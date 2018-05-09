package com.cjl.biz;

import com.cjl.dao.DeptMapper;
import com.cjl.model.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 陈佳乐 on 2018/4/25.
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptMapper deptMapper;

    /**
     * 获取所有部门的方法
     * @return
     */
    @Override
    public List<Dept> getAllDept() {
        return deptMapper.getAllDept();
    }

    @Override
    public boolean deleteDeptByDeptId(Integer dept_id) {
        return deptMapper.deleteDeptByDeptId(dept_id);
    }

    @Override
    public boolean updateDeptByDept(Dept dept) {
        return deptMapper.updateDeptByDept(dept);
    }

    @Override
    public Dept selectDeptByDeptName(Dept dept) {
        return deptMapper.selectDeptByDeptName(dept);
    }

    @Override
    public boolean addDeptByDept(Dept dept) {
        return deptMapper.addDeptByDept(dept);
    }
}
