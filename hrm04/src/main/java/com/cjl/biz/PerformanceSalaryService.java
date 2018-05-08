package com.cjl.biz;

import com.cjl.model.PerformanceSalary;

import java.util.List;

/**
 * Created by 陈佳乐 on 2018/5/8.
 */
public interface PerformanceSalaryService {
    boolean addNewPerformanceSalary(PerformanceSalary performanceSalary);
    PerformanceSalary getThisMonthPfs();
    boolean updatePfs(PerformanceSalary performanceSalary);
}
