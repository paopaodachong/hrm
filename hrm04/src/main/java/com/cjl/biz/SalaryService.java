package com.cjl.biz;

import com.cjl.model.Employee;
import com.cjl.model.PerformanceSalary;
import com.cjl.model.Salary;

import java.util.List;

/**
 * Created by 陈佳乐 on 2018/5/8.
 */
public interface SalaryService {
    boolean addSalaryByDetails(Double salary_money, Employee employee, PerformanceSalary performanceSalary);
    //查看所有人薪水
    List<Salary> selectCurrentMonthSalary();
    //查看个人当月薪水
    Salary selectCurrentMonthSalaryByEmployee(Employee employee);
}
