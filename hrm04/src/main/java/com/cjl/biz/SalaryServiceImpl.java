package com.cjl.biz;

import com.cjl.dao.SalaryMapper;
import com.cjl.model.Employee;
import com.cjl.model.PerformanceSalary;
import com.cjl.model.Salary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 陈佳乐 on 2018/5/8.
 */
@Service
public class SalaryServiceImpl implements SalaryService {
    @Resource
    private SalaryMapper salaryMapper;

    @Override
    public boolean addSalaryByDetails(Double salary_money, Employee employee, PerformanceSalary performanceSalary) {
        return salaryMapper.addSalaryByDetails(salary_money,employee,performanceSalary);
    }

    @Override
    public List<Salary> selectCurrentMonthSalary() {
        return salaryMapper.selectCurrentMonthSalary();
    }

    @Override
    public Salary selectCurrentMonthSalaryByEmployee(Employee employee) {
        return salaryMapper.selectCurrentMonthSalaryByEmployee(employee);
    }
}
