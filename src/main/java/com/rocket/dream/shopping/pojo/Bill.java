package com.rocket.dream.shopping.pojo;

import java.util.Date;

public class Bill{
    private Integer billCode;

    private Integer userCode;

    private Integer typeId;

    private String billName;

    private Integer billState;

    private String billdesc;

    private String billImage;

    private Float billMoney;

    private Date putawayDate;

    private Date downDate;

    private Date issueDate;

    @Override
    public String toString() {
        return "Bill{" +
                "billCode=" + billCode +
                ", userCode=" + userCode +
                ", typeId=" + typeId +
                ", billName='" + billName + '\'' +
                ", billState=" + billState +
                ", billdesc='" + billdesc + '\'' +
                ", billImage='" + billImage + '\'' +
                ", billMoney=" + billMoney +
                ", putawayDate=" + putawayDate +
                ", downDate=" + downDate +
                ", issueDate=" + issueDate +
                '}';
    }

    public Integer getBillCode() {
        return billCode;
    }

    public void setBillCode(Integer billCode) {
        this.billCode = billCode;
    }

    public Integer getUserCode() {
        return userCode;
    }

    public void setUserCode(Integer userCode) {
        this.userCode = userCode;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public Integer getBillState() {
        return billState;
    }

    public void setBillState(Integer billState) {
        this.billState = billState;
    }

    public String getBilldesc() {
        return billdesc;
    }

    public void setBilldesc(String billdesc) {
        this.billdesc = billdesc;
    }

    public String getBillImage() {
        return billImage;
    }

    public void setBillImage(String billImage) {
        this.billImage = billImage;
    }

    public Float getBillMoney() {
        return billMoney;
    }

    public void setBillMoney(Float billMoney) {
        this.billMoney = billMoney;
    }

    public Date getPutawayDate() {
        return putawayDate;
    }

    public void setPutawayDate(Date putawayDate) {
        this.putawayDate = putawayDate;
    }

    public Date getDownDate() {
        return downDate;
    }

    public void setDownDate(Date downDate) {
        this.downDate = downDate;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }
}