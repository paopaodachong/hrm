package com.cjl.biz;

import com.cjl.dao.EmployeeLevelMapper;
import com.cjl.model.EmployeeLevel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 陈佳乐 on 2018/4/25.
 */
@Service
public class EmployeeLevelServiceImpl implements EmployeeLevelService {
    @Resource
    private EmployeeLevelMapper employeeLevelMapper;
    //获取所有职员等级的方法
    @Override
    public List<EmployeeLevel> getAllEmployeeLevel() {
        return employeeLevelMapper.getAllEmployeeLevel();
    }
}
