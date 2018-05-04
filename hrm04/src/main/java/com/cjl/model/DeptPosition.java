package com.cjl.model;

import java.io.Serializable;

/**
 * 职位实体类
 * Created by 陈佳乐 on 2018/4/25.
 */
public class DeptPosition implements Serializable {
    private Integer deptPosition_id;
    //职位名称
    //办事员 分部主管 部门负责副职 部门负责正职
    private String deptPosition_name;
    //职位薪水系数
    //1     1.4     1.8               2
    private Double deptPosition_salaryRatio;

    public DeptPosition() {
    }

    public Integer getDeptPosition_id() {
        return deptPosition_id;
    }

    public void setDeptPosition_id(Integer deptPosition_id) {
        this.deptPosition_id = deptPosition_id;
    }

    public String getDeptPosition_name() {
        return deptPosition_name;
    }

    public void setDeptPosition_name(String deptPosition_name) {
        this.deptPosition_name = deptPosition_name;
    }

    public Double getDeptPosition_salaryRatio() {
        return deptPosition_salaryRatio;
    }

    public void setDeptPosition_salaryRatio(Double deptPosition_salaryRatio) {
        this.deptPosition_salaryRatio = deptPosition_salaryRatio;
    }

    @Override
    public String toString() {
        return "DeptPosition{" +
                "deptPosition_id=" + deptPosition_id +
                ", deptPosition_name='" + deptPosition_name + '\'' +
                ", deptPosition_salaryRatio=" + deptPosition_salaryRatio +
                '}';
    }
}
