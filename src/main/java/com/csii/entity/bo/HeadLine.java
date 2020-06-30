package com.csii.entity.bo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author lipeng
 * @className HeadLine
 * @description
 * @date 2020/6/30 23:47
 **/
@Data
public class HeadLine {
    private long lineId;
    private String lineName;
    private String lineLink;
    private String lineImg;
    private Integer priority;
    private Integer enableStatus;
    private Date createTime;
    private Date lastEditTime;
}
