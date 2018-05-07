package com.cjl.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 陈佳乐 on 2018/5/7.
 */
public class Clock implements Serializable{
    private Integer clock_id;
    @DateTimeFormat(pattern = "yyyy-MM-dd HHmmss")
    private Date clock_inDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd HHmmss")
    private Date clock_offDate;
    //全天打卡状态
    //0未打卡
    //1正常打卡一次 只打了上班卡 旷工
    //2正常打卡一次 只打了下班卡 旷工
    //3两次都打卡了 都正常
    //4迟到 都打卡了 工作时长满足 扣钱
    //5  迟到 时长没达到要求 3小时以内 扣钱
    //6 迟到 时长没达到要求 3小时以外 旷工
    //7 上午没有打卡 下午按条件打卡了
    //8时长足够 但早退了 没迟到
    //9时长不足 3小时以内 早退了 没迟到
    //10上午迟到 且只打卡了一次 旷工
    //11时长不足 3小时以外 早退了 没迟到
    //12时长足够 但早退了 迟到
    //13时长不足 3小时以内 早退了 迟到
    //14时长不足 3小时以外 早退了 迟到
    //11
    private Integer clock_state;
    private Employee employee;

    public Clock(Integer clock_id, Date clock_inDate, Date clock_offDate, Integer clock_state, Employee employee) {
        this.clock_id = clock_id;
        this.clock_inDate = clock_inDate;
        this.clock_offDate = clock_offDate;
        this.clock_state = clock_state;
        this.employee = employee;
    }

    public Clock() {
    }

    public Integer getClock_id() {
        return clock_id;
    }

    public void setClock_id(Integer clock_id) {
        this.clock_id = clock_id;
    }

    public Date getClock_inDate() {
        return clock_inDate;
    }

    public void setClock_inDate(Date clock_inDate) {
        this.clock_inDate = clock_inDate;
    }

    public Date getClock_offDate() {
        return clock_offDate;
    }

    public void setClock_offDate(Date clock_offDate) {
        this.clock_offDate = clock_offDate;
    }

    public Integer getClock_state() {
        return clock_state;
    }

    public void setClock_state(Integer clock_state) {
        this.clock_state = clock_state;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Clock{" +
                "clock_id=" + clock_id +
                ", clock_inDate=" + clock_inDate +
                ", clock_offDate=" + clock_offDate +
                ", clock_state=" + clock_state +
                ", employee=" + employee +
                '}';
    }
}
