package com.cjl.model;

/**
 * 部门实体类
 * Created by 陈佳乐 on 2018/4/23.
 */
public class Dept {
    //部门id
    private Integer dept_id;
    //部门名称
    private String dept_name;
    //部门基础薪水
    private Double dept_baseSalary;
    //部门描述
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

    @Override
    public String toString() {
        return "Dept{" +
                "dept_id=" + dept_id +
                ", dept_name='" + dept_name + '\'' +
                ", dept_baseSalary=" + dept_baseSalary +
                ", dept_desc='" + dept_desc + '\'' +
                '}';
    }
}
