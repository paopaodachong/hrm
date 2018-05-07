package com.cjl.dao;

import com.cjl.model.Clock;
import com.cjl.model.Employee;

/**
 * Created by 陈佳乐 on 2018/5/7.
 */
public interface ClockMapper {
    //上午正常打卡
    boolean addNewClock(Clock clock);
    //获取当前数据库中当天的打卡数据
    Clock getCurrentSameDayClock(Employee employee);
    //下午正常daka
    boolean updateOffDateClock(Clock clock);

    boolean addNewClockOnlyOff(Clock clock);
}
