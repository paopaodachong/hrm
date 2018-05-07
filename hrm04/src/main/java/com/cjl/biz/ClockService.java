package com.cjl.biz;

import com.cjl.model.Clock;
import com.cjl.model.Employee;

/**
 * Created by 陈佳乐 on 2018/5/7.
 */
public interface ClockService {
    //上午吧正常打卡
    boolean addNewClock(Clock clock);
    //上午迟到daka
    boolean addNewLateClock(Clock clock);
    Clock getCurrentSameDayClock(Employee employee);
    //下午正常打卡
    boolean updateClockOffDate(Clock clock);

    boolean addNewClockOnlyOff(Clock clock);
}
