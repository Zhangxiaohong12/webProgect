package easycode.common.entity;

import java.util.Date;

/**
 * (OrderDetail)表实体类
 *
 * @author makejava
 * @since 2018-09-07 10:57:16
 */
public class OrderDetail {
    
    private String detailId;
    
    private String detailGoodsId;
    
    private Object detailGoodsCount;
    
    private String detailGoodsUnit;
    
    private Object detailGoodsPrice;
    
    private Object detailTotalPrice;
    
    private String detailComment;
    
    private Object detailStatus;
    
    private String detailOrderId;
    
    private String detailUserId;
    
    private Date detailDateTime;


    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    public String getDetailGoodsId() {
        return detailGoodsId;
    }

    public void setDetailGoodsId(String detailGoodsId) {
        this.detailGoodsId = detailGoodsId;
    }

    public Object getDetailGoodsCount() {
        return detailGoodsCount;
    }

    public void setDetailGoodsCount(Object detailGoodsCount) {
        this.detailGoodsCount = detailGoodsCount;
    }

    public String getDetailGoodsUnit() {
        return detailGoodsUnit;
    }

    public void setDetailGoodsUnit(String detailGoodsUnit) {
        this.detailGoodsUnit = detailGoodsUnit;
    }

    public Object getDetailGoodsPrice() {
        return detailGoodsPrice;
    }

    public void setDetailGoodsPrice(Object detailGoodsPrice) {
        this.detailGoodsPrice = detailGoodsPrice;
    }

    public Object getDetailTotalPrice() {
        return detailTotalPrice;
    }

    public void setDetailTotalPrice(Object detailTotalPrice) {
        this.detailTotalPrice = detailTotalPrice;
    }

    public String getDetailComment() {
        return detailComment;
    }

    public void setDetailComment(String detailComment) {
        this.detailComment = detailComment;
    }

    public Object getDetailStatus() {
        return detailStatus;
    }

    public void setDetailStatus(Object detailStatus) {
        this.detailStatus = detailStatus;
    }

    public String getDetailOrderId() {
        return detailOrderId;
    }

    public void setDetailOrderId(String detailOrderId) {
        this.detailOrderId = detailOrderId;
    }

    public String getDetailUserId() {
        return detailUserId;
    }

    public void setDetailUserId(String detailUserId) {
        this.detailUserId = detailUserId;
    }

    public Date getDetailDateTime() {
        return detailDateTime;
    }

    public void setDetailDateTime(Date detailDateTime) {
        this.detailDateTime = detailDateTime;
    }

}