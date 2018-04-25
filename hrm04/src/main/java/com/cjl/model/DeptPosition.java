package com.cjl.model;

import java.io.Serializable;

/**
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

}
