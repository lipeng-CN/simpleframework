package com.csii.service.combine.impl;

import com.csii.entity.bo.HeadLine;
import com.csii.entity.bo.ShopCategory;
import com.csii.entity.dto.HomePageInfo;
import com.csii.entity.dto.Result;
import com.csii.service.combine.HomePageCombineService;
import com.csii.service.solo.HeadLineService;
import com.csii.service.solo.ShopCategoryService;

import java.util.List;

/**
 * @author lipeng
 * @className HomePageCombineServiceImpl
 * @description
 * @date 2020/7/6 23:50
 **/

public class HomePageCombineServiceImpl implements HomePageCombineService {
    private HeadLineService headLineService;
    private ShopCategoryService shopCategoryService;

    /**
     * 获取主页内容
     * @return
     */
    public Result<HomePageInfo> getHomePageInfo() {
        // step1:获取头条列表
        HeadLine headLineCondition = new HeadLine();
        headLineCondition.setEnableStatus(1);
        Result<List<HeadLine>> headLineResult =  headLineService.queryHeadLine(headLineCondition,1,4);

        // step2:获取店铺类别列表
        ShopCategory shopCategoryCondition = new ShopCategory();
        Result<List<ShopCategory>> shopCategoryResult = shopCategoryService.queryShopCategory(shopCategoryCondition,1,4);

        // step3:合并返回
        Result<HomePageInfo> result = mergeHomePageInfoResult(headLineResult,shopCategoryResult);
        return result;
    }

    /**
     * 合并内容
     * @param headLineResult
     * @param shopCategoryResult
     * @return
     */
    private Result<HomePageInfo> mergeHomePageInfoResult(Result<List<HeadLine>> headLineResult, Result<List<ShopCategory>> shopCategoryResult) {
        // todo 合并
        return null;
    }
}
