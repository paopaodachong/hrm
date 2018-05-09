package com.cjl.biz;

import com.cjl.model.Dept;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 陈佳乐 on 2018/4/25.
 */
public interface DeptService {
    List<Dept> getAllDept();
    boolean deleteDeptByDeptId(Integer dept_id);
    boolean updateDeptByDept(Dept dept);
    Dept selectDeptByDeptName(Dept dept);
    boolean addDeptByDept(Dept dept);
}
