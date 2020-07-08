package com.csii.service.combine;

import com.csii.entity.dto.HomePageInfo;
import com.csii.entity.dto.Result;

/**
 * @author lipeng
 * @className HomePageCombine
 * @description
 * @date 2020/7/6 23:47
 **/

public interface HomePageCombineService {

    Result<HomePageInfo> getHomePageInfo();
}
