package com.cjl.model;

import java.util.Date;

/**
 * Created by 陈佳乐 on 2018/5/8.
 */
public class Salary {
    private Integer salary_id;
    private Double salary_money;
    //可以查看基本工资
    //可以查看加班费用
    private Employee employee;
    private Date salary_createDate;
    private PerformanceSalary performanceSalary;

    public Salary() {
    }

    public Salary(Integer salary_id, Double salary_money, Employee employee, Date salary_createDate, PerformanceSalary performanceSalary) {
        this.salary_id = salary_id;
        this.salary_money = salary_money;
        this.employee = employee;
        this.salary_createDate = salary_createDate;
        this.performanceSalary = performanceSalary;
    }

    public Date getSalary_createDate() {
        return salary_createDate;
    }

    public void setSalary_createDate(Date salary_createDate) {
        this.salary_createDate = salary_createDate;
    }

    public Integer getSalary_id() {
        return salary_id;
    }

    public void setSalary_id(Integer salary_id) {
        this.salary_id = salary_id;
    }

    public Double getSalary_money() {
        return salary_money;
    }

    public void setSalary_money(Double salary_money) {
        this.salary_money = salary_money;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public PerformanceSalary getPerformanceSalary() {
        return performanceSalary;
    }

    public void setPerformanceSalary(PerformanceSalary performanceSalary) {
        this.performanceSalary = performanceSalary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "salary_id=" + salary_id +
                ", salary_money=" + salary_money +
                ", employee=" + employee +
                ", performanceSalary=" + performanceSalary +
                '}';
    }
}
