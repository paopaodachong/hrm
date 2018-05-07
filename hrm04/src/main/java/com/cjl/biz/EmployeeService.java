package com.cjl.biz;

import com.cjl.model.Employee;

import java.util.List;

/**
 * Created by 陈佳乐 on 2018/5/2.
 */
public interface EmployeeService {
    Employee loginEmployee(Employee employee);
    List<Employee> getAllEmployee();
    List<Employee> getEmployeesByDeptname(String deptname);
}
