package com.cjl.biz;

import com.cjl.dao.PerformanceSalaryMapper;
import com.cjl.model.PerformanceSalary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 陈佳乐 on 2018/5/8.
 */
@Service
public class PerformanceSalaryServiceImpl implements PerformanceSalaryService {
    @Resource
    private PerformanceSalaryMapper performanceSalaryMapper;

    @Override
    public boolean addNewPerformanceSalary(PerformanceSalary performanceSalary) {
        return performanceSalaryMapper.addNewPfs(performanceSalary);
    }

    @Override
    public PerformanceSalary getThisMonthPfs() {
        return performanceSalaryMapper.getThisMonthPfs();
    }

    @Override
    public boolean updatePfs(PerformanceSalary performanceSalary) {
        return performanceSalaryMapper.updatePfs(performanceSalary);
    }
}
