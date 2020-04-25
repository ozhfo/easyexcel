package com.alibaba.easyexcel.test.demo.write;

import lombok.Data;

import java.util.Date;

/**
 * 基础数据类
 *
 * @author Jiaju Zhuang
 **/
@Data
public class NormalData {

    private Integer age;
    private String string;
    private Date date;
    private Double doubleData;
}
