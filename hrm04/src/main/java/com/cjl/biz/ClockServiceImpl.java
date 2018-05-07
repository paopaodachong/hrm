package com.cjl.biz;

import com.cjl.dao.ClockMapper;
import com.cjl.model.Clock;
import com.cjl.model.Employee;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by 陈佳乐 on 2018/5/7.
 */
@Controller
public class ClockServiceImpl implements ClockService {
    @Resource
    private ClockMapper clockMapper;
    @Override
    public boolean addNewClock(Clock clock) {

        clock.setClock_state(1);
        System.out.println(clock);
        return clockMapper.addNewClock(clock);
    }

    @Override
    public boolean addNewLateClock(Clock clock) {
        clock.setClock_state(10);
        System.out.println(clock);
        return clockMapper.addNewClock(clock);
    }

    /**
     * 获取当前用户当前的打卡信息
     * @param employee
     * @return
     */
    @Override
    public Clock getCurrentSameDayClock(Employee employee) {
        return clockMapper.getCurrentSameDayClock(employee);
    }

    @Override
    public boolean updateClockOffDate(Clock clock) {

        return clockMapper.updateOffDateClock(clock);
    }

    @Override
    public boolean addNewClockOnlyOff(Clock clock) {
        return clockMapper.addNewClockOnlyOff(clock);
    }
}
