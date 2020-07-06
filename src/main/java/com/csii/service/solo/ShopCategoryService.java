package com.csii.service.solo;

import com.csii.entity.bo.ShopCategory;
import com.csii.entity.dto.Result;

import java.util.List;

/**
 * @author lipeng
 * @className ShopCategoryService
 * @description
 * @date 2020/7/6 23:08
 **/
public interface ShopCategoryService {

    Result<Boolean> addShopCategory(ShopCategory shopCategory);

    Result<Boolean> removeShopCategory(int shopCategoryId);

    Result<Boolean> modifyShopCategory(ShopCategory shopCategory);

    Result<ShopCategory> queryShopCategoryById(int shopCategoryId);

    Result<List> queryShopCategory(ShopCategory shopCategoryCondition, int pageIndex, int pageSize);
}
