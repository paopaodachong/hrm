package com.cjl.biz;

import com.cjl.model.DeptPosition;

import java.util.List;

/**
 * Created by 陈佳乐 on 2018/4/25.
 */
public interface DeptPositionService {
    List<DeptPosition> getAllDeptPosition();
    boolean deleteDeptPositionByDP(DeptPosition deptPosition);
    boolean updateDeptPositionByDP(DeptPosition deptPosition);
    boolean addDeptPositionByDP(DeptPosition deptPosition);
}
