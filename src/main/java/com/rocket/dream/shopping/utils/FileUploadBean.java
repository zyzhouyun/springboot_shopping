package com.rocket.dream.shopping.utils;

import com.rocket.dream.shopping.ex.FileException;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class FileUploadBean {

    @Resource
    private PortBean portBean;

    /**
     * @param multipartFiles
     * @return
     * @throws Exception
     */
    public List<String> upload(List<MultipartFile> multipartFiles) throws Exception {
        String realPath = ClassUtils.getDefaultClassLoader().getResource("").getPath()
                + "static" + File.separator + "upload" + File.separator + "";
        List<String> paths = new ArrayList<>();
       if (CollectionUtils.isEmpty(multipartFiles)) {
            throw new Exception("上传的文件为空");
        }
        for (MultipartFile multipartFile : multipartFiles) {
            String suffix = StringUtils.getFilenameExtension(multipartFile.getOriginalFilename());
            if (!suffix.equals("jpg") && !suffix.equals("png") && !suffix.equals("jpeg") && !suffix.equals("gif")) { //图片格式
                throw new FileException("文件格式不正确：" + suffix); //抛出文件格式不正确异常
            } else {
                String fileName = UUID.randomUUID() + "." + suffix; //上传文件名
                fileName=fileName.replace("-","");
                File uploadFile = new File(realPath, fileName);
                if (!uploadFile.exists()) {
                    uploadFile.mkdirs();
                }
                multipartFile.transferTo(uploadFile);
                System.out.println("上传成功");
                String path = new StringBuffer(realPath).append(fileName).toString();
                System.out.println("原路径-->" + path);
                String savePath = "http://localhost:"+ portBean.getPort()+File.separator + path.substring(path.lastIndexOf("upload" + File.separator));
                System.out.println("保存路径-->" + savePath);
                paths.add(savePath); //保存到数据库中的上传路径
            }
        }
        return paths;
    }
}
