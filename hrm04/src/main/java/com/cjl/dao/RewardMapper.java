package com.cjl.dao;


import com.cjl.model.Employee;
import com.cjl.model.Reward;

import java.util.List;

/**
 * Created by 陈佳乐 on 2018/5/8.
 */
public interface RewardMapper {
    //添加一条奖惩信息
    boolean addRewardMapper(Reward reward);
    //获得所有该员工的奖惩信息
    List<Reward> getAllRewardsByEmployee(Employee employee);
    //获得所有该员工上个月的奖惩信息
    List<Reward> getLastMonthRewardsByEmployee(Employee employee);

    boolean adminAddNewReward(Reward reward,Integer employee_id);
}
