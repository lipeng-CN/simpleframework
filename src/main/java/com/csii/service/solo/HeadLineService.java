package com.csii.service.solo;

import com.csii.entity.bo.HeadLine;
import com.csii.entity.dto.Result;

import java.util.List;

/**
 * @author lipeng
 * @className HeadLineService
 * @description
 * @date 2020/7/6 23:08
 **/
public interface HeadLineService {

    Result<Boolean> addHeadLine(HeadLine headLine);

    Result<Boolean> removeHeadLine(int headLineId);

    Result<Boolean> modifyHeadLine(HeadLine headLine);

    Result<HeadLine> queryHeadLineById(int headLineId);

    Result<List> queryHeadLine(HeadLine headLineCondition,int pageIndex,int pageSize);
}
