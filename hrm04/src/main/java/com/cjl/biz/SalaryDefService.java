package com.cjl.biz;

import com.cjl.model.Employee;
import com.cjl.model.SalaryDef;

import java.util.List;

/**
 * Created by 陈佳乐 on 2018/5/9.
 */
public interface SalaryDefService {
    SalaryDef getCurrentByEmployee(Employee employee);
    boolean addNewSalaryDef(SalaryDef salaryDef);
    List<SalaryDef> getUnresolveDef();
    boolean updateSalaryDefBySalaryDefIdAndState(Integer salaryDef_id,Integer salaryDef_state);
}
