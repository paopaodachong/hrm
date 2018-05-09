package com.cjl.model;

import java.util.Date;

/**
 * Created by 陈佳乐 on 2018/5/9.
 */
public class SalaryDef {
    private Integer salaryDef_id;

    private Double salaryDef_money;

    private String salaryDef_desc;

    //薪水复议的状态
    //0 刚被创建
    //1 被查看,同意
    //2 被查看,不同意
    private Integer salaryDef_state;

    //薪水复议创建时间
    //用来判断是本月唯一一条
    private Date salaryDef_createDate;

    private Employee employee;

    public SalaryDef() {
    }

    public Integer getSalaryDef_id() {
        return salaryDef_id;
    }

    public void setSalaryDef_id(Integer salaryDef_id) {
        this.salaryDef_id = salaryDef_id;
    }

    public Double getSalaryDef_money() {
        return salaryDef_money;
    }

    public void setSalaryDef_money(Double salaryDef_money) {
        this.salaryDef_money = salaryDef_money;
    }

    public String getSalaryDef_desc() {
        return salaryDef_desc;
    }

    public void setSalaryDef_desc(String salaryDef_desc) {
        this.salaryDef_desc = salaryDef_desc;
    }

    public Integer getSalaryDef_state() {
        return salaryDef_state;
    }

    public void setSalaryDef_state(Integer salaryDef_state) {
        this.salaryDef_state = salaryDef_state;
    }

    public Date getSalaryDef_createDate() {
        return salaryDef_createDate;
    }

    public void setSalaryDef_createDate(Date salaryDef_createDate) {
        this.salaryDef_createDate = salaryDef_createDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
