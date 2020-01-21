package com.rocket.dream.shopping.pojo;

import java.util.Date;

public class Comment {
    private Integer comId;

    private Integer userCode;

    private String commentInfo;

    private Date comDate;

    private Integer billCode;

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public Integer getUserCode() {
        return userCode;
    }

    public void setUserCode(Integer userCode) {
        this.userCode = userCode;
    }

    public String getCommentInfo() {
        return commentInfo;
    }

    public void setCommentInfo(String commentInfo) {
        this.commentInfo = commentInfo;
    }

    public Date getComDate() {
        return comDate;
    }

    public void setComDate(Date comDate) {
        this.comDate = comDate;
    }

    public Integer getBillCode() {
        return billCode;
    }

    public void setBillCode(Integer billCode) {
        this.billCode = billCode;
    }
}