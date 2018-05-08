package com.cjl.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 陈佳乐 on 2018/5/8.
 */
public class PerformanceSalary implements Serializable {
    private Integer performanceSalary_id;

    private Double performanceSalary_money;
    @DateTimeFormat(pattern = "yyyy-MM-dd HHmmss")
    private Date performanceSalary_createDate;

    private String performanceSalary_desc;

    public PerformanceSalary() {
    }

    public Integer getPerformanceSalary_id() {
        return performanceSalary_id;
    }

    public void setPerformanceSalary_id(Integer performanceSalary_id) {
        this.performanceSalary_id = performanceSalary_id;
    }

    public Double getPerformanceSalary_money() {
        return performanceSalary_money;
    }

    public void setPerformanceSalary_money(Double performanceSalary_money) {
        this.performanceSalary_money = performanceSalary_money;
    }

    public Date getPerformanceSalary_createDate() {
        return performanceSalary_createDate;
    }

    public void setPerformanceSalary_createDate(Date performanceSalary_createDate) {
        this.performanceSalary_createDate = performanceSalary_createDate;
    }

    public String getPerformanceSalary_desc() {
        return performanceSalary_desc;
    }

    public void setPerformanceSalary_desc(String performanceSalary_desc) {
        this.performanceSalary_desc = performanceSalary_desc;
    }
}
