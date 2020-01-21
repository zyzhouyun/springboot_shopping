/**
 * zhouyun
 * 发布商品
 * 9月24日星期二有改动
 */


$(function () {

    var ckBillName , ckBillPrice , ckImg=false
    $(document).on('blur','#billName',checkBillName)
    $(document).on('blur','#billMoney',checkBillMoney)
    $(document).on('blur','#upfile',checkImgFormat)

    function  checkBillName(e) {
        e.stopPropagation();
        var billName=$.trim($('#billName').val())
        if(billName.length==0){
            layer.msg('物品名不能为空',{icon:2})
        }else if(!isNaN(billName.charAt(0))){
            layer.msg('物品名不能以数字开头',{icon:2})
        }else {
            $.ajax({
                url:'/publish/checkBillName',
                data:{billName:billName},
                type:'post',
                dataType:'json',
                success:function (result) {
                    console.log(result)
                    if(result==0){
                        ckBillName=true
                        console.log('ckBillName='+ckBillName)
                    }else{
                        layer.msg('物品名不可用',{icon:2})
                        ckBillName=false
                        console.log('ckBillName='+ckBillName)
                    }
                }
            })
        }
    }

    //验证物品价格
    function checkBillMoney(e) {
        e.stopPropagation();
        var billmoney=$.trim($('#billMoney').val())
        if(billmoney.length==0){
            layer.msg('物品金额不能为空',{icon:2})
        }else if(billmoney==0||billmoney<10){
            layer.msg('物品金额需高于10元',{icon:2})
        }else if(!regPrice(billmoney)){
            layer.msg('金额不合理',{icon:2})
        }else{
            ckBillPrice=true
        }
    }

    //验证图片格式
    function checkImgFormat(e) {
        e.stopPropagation();
        var fileName=$('#upfile').val()
        var suffix=fileName.substring(fileName.indexOf(".")+1).toLowerCase()
        if(suffix=='jpg'||suffix=='png'||suffix=='jpeg'){
            ckImg=true
        }else if($('#upfile').val()==''){
            layer.msg('请选择商品图片')
        }else{
            layer.msg('文件格式不正确：'+suffix,{icon:2})
        }
    }

    $('#billName').keyup(function () {
        $('#publish').prop('disabled',false).css('backgroundColor','#89c3eb')
    })


    function regPrice(value) {
        //金额校验；整数或者保留两位小数
        var reg = /(^[1-9]\d*(\.\d{1,2})?$)|(^0(\.\d{1,2})?$)/
        return reg.test(value)
    }

    //发布商品
    $('#publish').click(function () {
        if(ckBillName&&ckBillPrice&&$('#typesel').val()!=0&&ckImg){
        var formData=new FormData($("#upform")[0])
        //name去重，不适用序列化
        $.ajax({
            url:"/publish/publishGoods?billName="+$('#billName').val()+"&billdesc="+$('#billdesc').val(),
            data:formData,
            type:'post',
            dataType:'json',
            async:false,
            cache:false,
            processData:false,
            contentType:false,
            success:function (result) {
                if(result.num==1){
                    layer.msg(result.message,{icon:1})
                    $('#publish').prop('disabled',true).css('backgroundColor','#ccc')
                    //$.cookie('imgpath' , result.datas[0].toString())
                }else{
                    layer.msg(result.message,{icon:2})
                }
            },
            error:function () {
                layer.msg('服务器繁忙')
            }
        })
        }else{
            layer.msg('\u000d请正确填写必要物品信息\u000d【物品名|物品金额|物品类别|图片】')
        }
    })

    //getImgCookie()
    function getImgCookie() {
        var imgck=$.cookie('imgpath')
        if(imgck!=''){
            $('#img').attr('src',imgck)
        }
    }
})

window.onload=function () {
   Vue.http.options.emulateJSON = true
    new Vue({
        el:'#user_content',
        data:{
            typeList:[],
            bill:{
                billName:'',
                billMoney:'',
                billType:0,
                billdesc:'',
            },
            fontCount:100,
        },
        methods:{
            showBillType:function () {
                this.$http.post('/publish/findAllBillTypes').then(function (result) {
                    this.typeList = result.body
                })
            },
            jstextArea:function () {
                return this.fontCount - this.bill.billdesc.length;
            }
        },
        created:function () {
            this.showBillType()
        }
    })
}

function choose(file) {
    if (file.files && file.files[0]) {
        var reader = new FileReader()
        reader.onload = function (e) {
            $('#img').attr({"src": e.target.result})
        }
        reader.readAsDataURL(file.files[0]);
    }
}

$(function () {
    document.oncontextmenu=function(e){
        var x=e.pageX
        var y=e.pageY
        $("#menu").css({
            display:"block",
            left:x+"px",
            top:y+"px"
        })
        return false
    }

    $(document).click(function(e){
        if(e.button==0){
            $("#menu").fadeOut()
        }
    })

    /* $("#menu a").click(function(e){
         var index=$(this).attr('index')
             if(index=='0'){
             //显示发布商品的页面

         }
     })*/
})
/**
 * 发布end
 */


















