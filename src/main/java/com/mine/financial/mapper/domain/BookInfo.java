package com.mine.financial.mapper.domain;

import lombok.Data;

import java.util.Date;

@Data
public class BookInfo {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 记账日期
     * yyyy-MM-dd HH:mm:ss
     */
    private String bookDate;

    /**
     * 借贷方名称
     */
    private String bookName;

    /**
     * 科目类别
     */
    private String bookType;

    /**
     * 借款额
     */
    private double debit;

    /**
     * 贷款额
     */
    private double credit;
}
