package easycode.common.entity;

import java.util.Date;

/**
 * (Goods)表实体类
 *
 * @author makejava
 * @since 2018-09-07 10:57:16
 */
public class Goods {
    
    private String goodsId;
    
    private String goodsName;
    
    private Object goodsPrice;
    
    private Object goodsLargerPrice;
    
    private String goodsCategoriesId;
    
    private String goodsBrandId;
    
    private String goodsPhoto;
    
    private Object goodsStatus;
    
    private String goodsCount;
    
    private String goodsUnit;
    
    private Date goodsDatetime;
    
    private Object goodsSuggestPrice;


    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Object getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Object goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Object getGoodsLargerPrice() {
        return goodsLargerPrice;
    }

    public void setGoodsLargerPrice(Object goodsLargerPrice) {
        this.goodsLargerPrice = goodsLargerPrice;
    }

    public String getGoodsCategoriesId() {
        return goodsCategoriesId;
    }

    public void setGoodsCategoriesId(String goodsCategoriesId) {
        this.goodsCategoriesId = goodsCategoriesId;
    }

    public String getGoodsBrandId() {
        return goodsBrandId;
    }

    public void setGoodsBrandId(String goodsBrandId) {
        this.goodsBrandId = goodsBrandId;
    }

    public String getGoodsPhoto() {
        return goodsPhoto;
    }

    public void setGoodsPhoto(String goodsPhoto) {
        this.goodsPhoto = goodsPhoto;
    }

    public Object getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Object goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(String goodsCount) {
        this.goodsCount = goodsCount;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    public Date getGoodsDatetime() {
        return goodsDatetime;
    }

    public void setGoodsDatetime(Date goodsDatetime) {
        this.goodsDatetime = goodsDatetime;
    }

    public Object getGoodsSuggestPrice() {
        return goodsSuggestPrice;
    }

    public void setGoodsSuggestPrice(Object goodsSuggestPrice) {
        this.goodsSuggestPrice = goodsSuggestPrice;
    }

}