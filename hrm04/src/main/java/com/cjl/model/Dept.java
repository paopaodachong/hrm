package com.cjl.model;

/**
 * Created by 陈佳乐 on 2018/4/23.
 */
public class Dept {
    private Integer dept_id;
    private String dept_name;
    private Double dept_baseSalary;
    private String dept_desc;

    public Dept() {
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public Double getDept_baseSalary() {
        return dept_baseSalary;
    }

    public void setDept_baseSalary(Double dept_baseSalary) {
        this.dept_baseSalary = dept_baseSalary;
    }

    public String getDept_desc() {
        return dept_desc;
    }

    public void setDept_desc(String dept_desc) {
        this.dept_desc = dept_desc;
    }
}
