package com.cjl.dao;

import com.cjl.model.DeptPosition;

import java.util.List;

/**
 * Created by 陈佳乐 on 2018/4/25.
 */
public interface DeptPositionMapper {
    List<DeptPosition> getAllDeptPosition();
    DeptPosition selectDeptpositionByDeptpositionId(Integer deptposition_id);
    boolean deleteDeptPositionByDP(DeptPosition deptPosition);
    boolean updateDeptPositionByDP(DeptPosition deptPosition);
    boolean addDeptPositionByDP(DeptPosition deptPosition);
}
