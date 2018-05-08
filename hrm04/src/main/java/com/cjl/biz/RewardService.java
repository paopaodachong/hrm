package com.cjl.biz;

import com.cjl.model.Employee;
import com.cjl.model.Reward;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 陈佳乐 on 2018/5/8.
 */
public interface RewardService {
    List<Reward> getAllRewardsByEmployee(Employee employee);
    boolean addNewReward(Reward reward);
}
