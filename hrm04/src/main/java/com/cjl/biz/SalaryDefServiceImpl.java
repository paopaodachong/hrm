package com.cjl.biz;

import com.cjl.dao.SalaryDefMapper;
import com.cjl.model.Employee;
import com.cjl.model.SalaryDef;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 陈佳乐 on 2018/5/9.
 */
@Service
public class SalaryDefServiceImpl implements SalaryDefService {
    @Resource
    private SalaryDefMapper salaryDefMapper;
    @Override
    public SalaryDef getCurrentByEmployee(Employee employee) {
        return salaryDefMapper.getCurrentByEmployee(employee);
    }

    @Override
    public boolean addNewSalaryDef(SalaryDef salaryDef) {
        return salaryDefMapper.addNewSalaryDef(salaryDef);
    }

    @Override
    public List<SalaryDef> getUnresolveDef() {
        return salaryDefMapper.getUnresolveDef();
    }

    @Override
    public boolean updateSalaryDefBySalaryDefIdAndState(Integer salaryDef_id, Integer salaryDef_state) {
        return salaryDefMapper.updateSalaryDefBySalaryDefIdAndState(salaryDef_id,salaryDef_state);
    }
}
