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
    @Override
    public List<DeptPosition> getAllDeptPosition() {
        return deptPositionMapper.getAllDeptPosition();
    }
}
