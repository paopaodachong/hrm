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
    @Override
    public List<Dept> getAllDept() {
        return deptMapper.getAllDept();
    }
}
