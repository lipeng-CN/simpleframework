package com.csii.entity.bo;

import lombok.Data;

import java.util.Date;

/**
 * @author lipeng
 * @className ShopCategory
 * @description
 * @date 2020/6/30 23:52
 **/
@Data
public class ShopCategory {
    private long shopCategoryId;
    private String shopCategoryName;
    private String shopCategoryDesc;
    private String shopCategoryImg;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    private ShopCategory parent;
}
