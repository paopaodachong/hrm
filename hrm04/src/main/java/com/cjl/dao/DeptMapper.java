package com.cjl.dao;

import com.cjl.model.Dept;

import java.util.List;

/**
 * Created by 陈佳乐 on 2018/4/25.
 */
public interface DeptMapper {
    List<Dept> getAllDept();
    Dept selectDeptByDeptId(Integer dept_id);
    boolean deleteDeptByDeptId(Integer dept_id);
    boolean updateDeptByDept(Dept dept);
    Dept selectDeptByDeptName(Dept dept);
    boolean addDeptByDept(Dept dept);
}
