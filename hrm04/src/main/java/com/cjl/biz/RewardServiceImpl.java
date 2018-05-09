package com.cjl.biz;

import com.cjl.dao.RewardMapper;
import com.cjl.model.Employee;
import com.cjl.model.Reward;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 陈佳乐 on 2018/5/8.
 */
@Service
public class RewardServiceImpl implements RewardService {
    @Resource
    private RewardMapper rewardMapper;

    /**
     * 获取员工对应所有奖惩的方法
     * @param employee
     * @return
     */
    @Override
    public List<Reward> getAllRewardsByEmployee(Employee employee) {
        return rewardMapper.getAllRewardsByEmployee(employee);
    }

    /**
     * 添加新的奖惩信息的方法
     * @param reward
     * @return
     */
    @Override
    public boolean addNewReward(Reward reward) {
        return rewardMapper.addRewardMapper(reward);
    }

    @Override
    public List<Reward> getLastMonthRewardsByEmployee(Employee employee) {
        return rewardMapper.getLastMonthRewardsByEmployee(employee);
    }

    @Override
    public boolean adminAddNewReward(Reward reward, Integer employee_id) {
        return rewardMapper.adminAddNewReward(reward, employee_id);
    }
}
