package com.cjl.dao;

import com.cjl.model.Employee;

import java.util.List;

/**
 * Created by 陈佳乐 on 2018/5/2.
 */
public interface EmployeeMapper {
    Employee loginEmployee(Employee employee);
    List<Employee> getAllEmployees();
    List<Employee> getEmployeesByDeptName(String deptname);
    Employee selectEmployeeByEmployeeId(Integer employeeId);
}
