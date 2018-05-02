package com.cjl.biz;

import com.cjl.dao.EmployeeMapper;
import com.cjl.model.Employee;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 陈佳乐 on 2018/5/2.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;
    @Override
    public Employee loginEmployee(Employee employee) {
        return employeeMapper.loginEmployee(employee);
    }
}
