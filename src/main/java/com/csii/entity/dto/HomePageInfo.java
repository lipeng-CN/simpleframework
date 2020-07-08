package com.csii.entity.dto;

import com.csii.entity.bo.HeadLine;
import com.csii.entity.bo.ShopCategory;
import lombok.Data;

import java.util.List;

/**
 * @author lipeng
 * @className MainPageInfo
 * @description
 * @date 2020/7/6 23:44
 **/

@Data
public class HomePageInfo {

    private List<HeadLine> headLineList;

    private List<ShopCategory> shopCategoryList;
}
