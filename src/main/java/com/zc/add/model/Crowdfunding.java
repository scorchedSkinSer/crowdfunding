package com.zc.add.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@TableName("t_crowdfunding")
public class Crowdfunding {
    @TableId(value = "t_crowId",type = IdType.AUTO)
    private Integer crowId;
    private Integer crowUserId;//用户Id
    private String crowUserName;//用户名
    private String crowUserCode;//用户身份证
    private String crowUserPhone;//用户手机号
    private String crowCodePositive;//用户身份证正面照
    private String crowCodeAnti;//用户身份证反面照
    private String crowPhoto;//封面照片
    private String crowTitle;//表题
    private String crowPurpose;//项目目的
    private String crowStory;//项目故事
    private BigDecimal crowCompletePrice;//已筹金额
    private BigDecimal crowPrice;//众筹金额
    private Integer crowPeriod;//项目周期
    private Integer crowAreaId;//地区ID
    private Integer crowOrderId;//用户详情订单Id
    private Integer crowReturnType;//回报类型
    private Integer crowTypeId;//众筹类型
    private Integer crowBrandStatus;//公开非公开众筹项目的种类
    private BigDecimal crowMinPrice;//最少捐款金额
    private String  crowContent;//回报内容
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:dd:ss")
    @JsonFormat(pattern = "yyyy-MM-dd  mm:dd:ss",timezone = "GMT+8")
    private Date   crowStartTime;//众筹开始日期
    private Date   crowOverTime;//众筹结束日期
    private String crowStatus;//项目众筹状态   筹款中 延期中 带回报


    public Crowdfunding() {
    }

    public Crowdfunding(Integer crowId, Integer crowUserId, String crowUserName, String crowUserCode, String crowUserPhone, String crowCodePositive, String crowCodeAnti, String crowPhoto, String crowTitle, String crowPurpose, String crowStory, BigDecimal crowCompletePrice, BigDecimal crowPrice, Integer crowPeriod, Integer crowAreaId, Integer crowOrderId, Integer crowReturnType, Integer crowTypeId, Integer crowBrandStatus, BigDecimal crowMinPrice, String crowContent, Date crowStartTime, Date crowOverTime, String crowStatus) {
        this.crowId = crowId;
        this.crowUserId = crowUserId;
        this.crowUserName = crowUserName;
        this.crowUserCode = crowUserCode;
        this.crowUserPhone = crowUserPhone;
        this.crowCodePositive = crowCodePositive;
        this.crowCodeAnti = crowCodeAnti;
        this.crowPhoto = crowPhoto;
        this.crowTitle = crowTitle;
        this.crowPurpose = crowPurpose;
        this.crowStory = crowStory;
        this.crowCompletePrice = crowCompletePrice;
        this.crowPrice = crowPrice;
        this.crowPeriod = crowPeriod;
        this.crowAreaId = crowAreaId;
        this.crowOrderId = crowOrderId;
        this.crowReturnType = crowReturnType;
        this.crowTypeId = crowTypeId;
        this.crowBrandStatus = crowBrandStatus;
        this.crowMinPrice = crowMinPrice;
        this.crowContent = crowContent;
        this.crowStartTime = crowStartTime;
        this.crowOverTime = crowOverTime;
        this.crowStatus = crowStatus;
    }

    public Integer getCrowId() {
        return crowId;
    }

    public void setCrowId(Integer crowId) {
        this.crowId = crowId;
    }

    public Integer getCrowUserId() {
        return crowUserId;
    }

    public void setCrowUserId(Integer crowUserId) {
        this.crowUserId = crowUserId;
    }

    public String getCrowUserName() {
        return crowUserName;
    }

    public void setCrowUserName(String crowUserName) {
        this.crowUserName = crowUserName;
    }

    public String getCrowUserCode() {
        return crowUserCode;
    }

    public void setCrowUserCode(String crowUserCode) {
        this.crowUserCode = crowUserCode;
    }

    public String getCrowUserPhone() {
        return crowUserPhone;
    }

    public void setCrowUserPhone(String crowUserPhone) {
        this.crowUserPhone = crowUserPhone;
    }

    public String getCrowCodePositive() {
        return crowCodePositive;
    }

    public void setCrowCodePositive(String crowCodePositive) {
        this.crowCodePositive = crowCodePositive;
    }

    public String getCrowCodeAnti() {
        return crowCodeAnti;
    }

    public void setCrowCodeAnti(String crowCodeAnti) {
        this.crowCodeAnti = crowCodeAnti;
    }

    public String getCrowPhoto() {
        return crowPhoto;
    }

    public void setCrowPhoto(String crowPhoto) {
        this.crowPhoto = crowPhoto;
    }

    public String getCrowTitle() {
        return crowTitle;
    }

    public void setCrowTitle(String crowTitle) {
        this.crowTitle = crowTitle;
    }

    public String getCrowPurpose() {
        return crowPurpose;
    }

    public void setCrowPurpose(String crowPurpose) {
        this.crowPurpose = crowPurpose;
    }

    public String getCrowStory() {
        return crowStory;
    }

    public void setCrowStory(String crowStory) {
        this.crowStory = crowStory;
    }

    public BigDecimal getCrowCompletePrice() {
        return crowCompletePrice;
    }

    public void setCrowCompletePrice(BigDecimal crowCompletePrice) {
        this.crowCompletePrice = crowCompletePrice;
    }

    public BigDecimal getCrowPrice() {
        return crowPrice;
    }

    public void setCrowPrice(BigDecimal crowPrice) {
        this.crowPrice = crowPrice;
    }

    public Integer getCrowPeriod() {
        return crowPeriod;
    }

    public void setCrowPeriod(Integer crowPeriod) {
        this.crowPeriod = crowPeriod;
    }

    public Integer getCrowAreaId() {
        return crowAreaId;
    }

    public void setCrowAreaId(Integer crowAreaId) {
        this.crowAreaId = crowAreaId;
    }

    public Integer getCrowOrderId() {
        return crowOrderId;
    }

    public void setCrowOrderId(Integer crowOrderId) {
        this.crowOrderId = crowOrderId;
    }

    public Integer getCrowReturnType() {
        return crowReturnType;
    }

    public void setCrowReturnType(Integer crowReturnType) {
        this.crowReturnType = crowReturnType;
    }

    public Integer getCrowTypeId() {
        return crowTypeId;
    }

    public void setCrowTypeId(Integer crowTypeId) {
        this.crowTypeId = crowTypeId;
    }

    public Integer getCrowBrandStatus() {
        return crowBrandStatus;
    }

    public void setCrowBrandStatus(Integer crowBrandStatus) {
        this.crowBrandStatus = crowBrandStatus;
    }

    public BigDecimal getCrowMinPrice() {
        return crowMinPrice;
    }

    public void setCrowMinPrice(BigDecimal crowMinPrice) {
        this.crowMinPrice = crowMinPrice;
    }

    public String getCrowContent() {
        return crowContent;
    }

    public void setCrowContent(String crowContent) {
        this.crowContent = crowContent;
    }

    public Date getCrowStartTime() {
        return crowStartTime;
    }

    public void setCrowStartTime(Date crowStartTime) {
        this.crowStartTime = crowStartTime;
    }

    public Date getCrowOverTime() {
        return crowOverTime;
    }

    public void setCrowOverTime(Date crowOverTime) {
        this.crowOverTime = crowOverTime;
    }

    public String getCrowStatus() {
        return crowStatus;
    }

    public void setCrowStatus(String crowStatus) {
        this.crowStatus = crowStatus;
    }
}
