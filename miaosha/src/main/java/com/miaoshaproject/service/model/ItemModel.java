package com.miaoshaproject.service.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class ItemModel {
    private Integer id;

    @NotBlank(message = "商品名称不能为空")
    //商品的名称
    private String title;

    @NotNull(message = "商品价格不能为空")
    @Min(value = 0,message = "商品价格要大于0")
    //商品的价格
    private BigDecimal price;

    @NotNull(message = "商品库存不能为空")
    //商品的库存
    private Integer stock;

    @NotBlank(message = "商品描述不能为空")
    //商品的描述
    private String description;
    //商品的价格
    private String sales;

    @NotBlank(message = "商品图片不能为空")
  // 商品描述图片的url
    private String imgUrl;

    //使用聚合模型,如果promoModel不为空，则表示其拥有还未结束的秒杀活动
//    private PromoModel promoModel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
