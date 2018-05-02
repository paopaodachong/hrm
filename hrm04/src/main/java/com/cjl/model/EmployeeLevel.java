package com.cjl.model;

import java.io.Serializable;

/**
 * 职员等级实体类
 * Created by 陈佳乐 on 2018/4/25.
 */
public class EmployeeLevel implements Serializable{

    private Integer employeeLevel_id;
    //职位名称
    //P1~P9 实习生 见习生 助理 正式 专业 资深
    private String employeeLevel_name;
    //薪水系数
    //      0.8     1    1.2    1.5  2   3
    private Double employeeLevel_salaryRatio;

    public EmployeeLevel() {
    }

    public Integer getEmployeeLevel_id() {
        return employeeLevel_id;
    }

    public void setEmployeeLevel_id(Integer employeeLevel_id) {
        this.employeeLevel_id = employeeLevel_id;
    }

    public String getEmployeeLevel_name() {
        return employeeLevel_name;
    }

    public void setEmployeeLevel_name(String employeeLevel_name) {
        this.employeeLevel_name = employeeLevel_name;
    }

    public Double getEmployeeLevel_salaryRatio() {
        return employeeLevel_salaryRatio;
    }

    public void setEmployeeLevel_salaryRatio(Double employeeLevel_salaryRatio) {
        this.employeeLevel_salaryRatio = employeeLevel_salaryRatio;
    }

    @Override
    public String toString() {
        return "EmployeeLevel{" +
                "employeeLevel_id=" + employeeLevel_id +
                ", employeeLevel_name='" + employeeLevel_name + '\'' +
                ", employeeLevel_salaryRatio=" + employeeLevel_salaryRatio +
                '}';
    }
}
