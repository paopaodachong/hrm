package com.cjl.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by 陈佳乐 on 2018/4/26.
 */
public class JobExp {
    //工作经验的序列号
    private Integer jobExp_id;
    //工作经验的开始时间
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date jobExp_startDate;
    //工作经验的结束时间
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date jobExp_endDate;
    //担任职务
    private String jobExp_position;
    //工作描述
    private String jobExp_desc;
    //薪水
    private Double jobExp_salary;
    //对应的添加游客
    private Vistor vistor;

    public JobExp() {
    }

    public Integer getJobExp_id() {
        return jobExp_id;
    }

    public void setJobExp_id(Integer jobExp_id) {
        this.jobExp_id = jobExp_id;
    }

    public Date getJobExp_startDate() {
        return jobExp_startDate;
    }

    public void setJobExp_startDate(Date jobExp_startDate) {
        this.jobExp_startDate = jobExp_startDate;
    }

    public Date getJobExp_endDate() {
        return jobExp_endDate;
    }

    public void setJobExp_endDate(Date jobExp_endDate) {
        this.jobExp_endDate = jobExp_endDate;
    }

    public String getJobExp_position() {
        return jobExp_position;
    }

    public void setJobExp_position(String jobExp_position) {
        this.jobExp_position = jobExp_position;
    }

    public String getJobExp_desc() {
        return jobExp_desc;
    }

    public void setJobExp_desc(String jobExp_desc) {
        this.jobExp_desc = jobExp_desc;
    }

    public Double getJobExp_salary() {
        return jobExp_salary;
    }

    public void setJobExp_salary(Double jobExp_salary) {
        this.jobExp_salary = jobExp_salary;
    }

    public Vistor getVistor() {
        return vistor;
    }

    public void setVistor(Vistor vistor) {
        this.vistor = vistor;
    }
}
