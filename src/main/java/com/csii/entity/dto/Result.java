package com.csii.entity.dto;

import lombok.Data;

/**
 * @author lipeng
 * @className Result
 * @description
 * @date 2020/7/6 23:05
 **/
@Data
public class Result<T> {

    private int code;

    private String msg;

    private T data;
}
