package com.cjl.dao;

import com.cjl.model.PerformanceSalary;

import java.util.List;

/**
 * Created by 陈佳乐 on 2018/5/8.
 */
public interface PerformanceSalaryMapper {
    boolean addNewPfs(PerformanceSalary performanceSalary);
    //找出当月添加的绩效
    List<PerformanceSalary> getThisMonthPfs();

    boolean updatePfs(PerformanceSalary performanceSalary);

    PerformanceSalary selectPfsByPfsId(Integer PfsId);
}
