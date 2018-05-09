package com.cjl.biz;

import com.cjl.dao.DeptPositionMapper;
import com.cjl.model.DeptPosition;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 陈佳乐 on 2018/4/25.
 */
@Service
public class DeptPositionServiceImpl implements DeptPositionService {
    @Resource
    private DeptPositionMapper deptPositionMapper;

    /**
     * 获取所有部门职位的方法
     * @return
     */
    @Override
    public List<DeptPosition> getAllDeptPosition() {
        return deptPositionMapper.getAllDeptPosition();
    }

    @Override
    public boolean deleteDeptPositionByDP(DeptPosition deptPosition) {
        return deptPositionMapper.deleteDeptPositionByDP(deptPosition);
    }

    @Override
    public boolean updateDeptPositionByDP(DeptPosition deptPosition) {
        return deptPositionMapper.updateDeptPositionByDP(deptPosition);
    }

    @Override
    public boolean addDeptPositionByDP(DeptPosition deptPosition) {
        return deptPositionMapper.addDeptPositionByDP(deptPosition);
    }
}
