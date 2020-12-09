package com.zc.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;


@TableName("t_crowdfunding")
public class Crowdfunding {
    @TableId(value = "crowId",type = IdType.AUTO)
    private Integer crowId;
    @TableField(exist = false)
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
    private BigDecimal crowPrice;//众筹金额
    private Integer crowPeriod;//项目周期
    private Integer crowAreaId;//地区ID
    private Integer crowOrderId;//用户详情订单Id
    private Integer crowRetrunType;//回报类型
    private Integer crowTypeId;//众筹类型
    private Integer crowBrandStatus;//公开非公开众筹项目的种类
    private BigDecimal crowMinPrice;//最少捐款金额
    private String  crowContent;//回报内容


    public Crowdfunding() {
    }

    public Crowdfunding(Integer crowId, Integer crowUserId, String crowUserName, String crowUserCode, String crowUserPhone, String crowCodePositive, String crowCodeAnti, String crowPhoto, String crowTitle, String crowPurpose, String crowStory, BigDecimal crowPrice, Integer crowPeriod, Integer crowAreaId, Integer crowOrderId, Integer crowRetrunType, Integer crowTypeId, Integer crowBrandStatus, BigDecimal crowMinPrice, String crowContent) {
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
        this.crowPrice = crowPrice;
        this.crowPeriod = crowPeriod;
        this.crowAreaId = crowAreaId;
        this.crowOrderId = crowOrderId;
        this.crowRetrunType = crowRetrunType;
        this.crowTypeId = crowTypeId;
        this.crowBrandStatus = crowBrandStatus;
        this.crowMinPrice = crowMinPrice;
        this.crowContent = crowContent;
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

    public Integer getCrowRetrunType() {
        return crowRetrunType;
    }

    public void setCrowRetrunType(Integer crowRetrunType) {
        this.crowRetrunType = crowRetrunType;
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
}
