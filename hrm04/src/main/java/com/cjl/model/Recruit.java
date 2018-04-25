package com.cjl.model;

import java.util.Date;

/**
 * Created by 陈佳乐 on 2018/4/23.
 */
//招聘实体类
public class Recruit {
    //招聘id
    private Integer recruit_id;
    //招聘名字
    private String recruit_name;
    //招聘人数
    private Integer recruit_num;
    //招聘描述
    private String recruit_desc;
    //招聘开始日期
    private Date recruit_startDate;
    //招聘结束日期
    private Date recruit_endDate;
    //招聘薪水
    private Double recruit_salary;
    //招聘部门
    private Dept dept;
    //招聘员工等级
    private EmployeeLevel employeeLevel;
    //招聘员工职位
    private DeptPosition deptPosition;


    public Recruit() {
    }

    public Integer getRecruit_id() {
        return recruit_id;
    }

    public void setRecruit_id(Integer recruit_id) {
        this.recruit_id = recruit_id;
    }

    public String getRecruit_name() {
        return recruit_name;
    }

    public void setRecruit_name(String recruit_name) {
        this.recruit_name = recruit_name;
    }

    public Integer getRecruit_num() {
        return recruit_num;
    }

    public void setRecruit_num(Integer recruit_num) {
        this.recruit_num = recruit_num;
    }

    public String getRecruit_desc() {
        return recruit_desc;
    }

    public void setRecruit_desc(String recruit_desc) {
        this.recruit_desc = recruit_desc;
    }

    public Date getRecruit_startDate() {
        return recruit_startDate;
    }

    public void setRecruit_startDate(Date recruit_startDate) {
        this.recruit_startDate = recruit_startDate;
    }

    public Date getRecruit_endDate() {
        return recruit_endDate;
    }

    public void setRecruit_endDate(Date recruit_endDate) {
        this.recruit_endDate = recruit_endDate;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public EmployeeLevel getEmployeeLevel() {
        return employeeLevel;
    }

    public void setEmployeeLevel(EmployeeLevel employeeLevel) {
        this.employeeLevel = employeeLevel;
    }

    public DeptPosition getDeptPosition() {
        return deptPosition;
    }

    public void setDeptPosition(DeptPosition deptPosition) {
        this.deptPosition = deptPosition;
    }

}
