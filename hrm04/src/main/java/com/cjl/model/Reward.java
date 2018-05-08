package com.cjl.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 陈佳乐 on 2018/5/8.
 */
public class Reward implements Serializable{
    private Integer reward_id;
    //奖惩时间
    private Date reward_date;
    //奖惩类型
    private String reward_name;
    //奖惩描述
    private String reward_desc;
    //奖惩钱
    private Double reward_money;
    //奖惩人
    private Employee employee;

    public Reward() {
    }

    public Integer getReward_id() {
        return reward_id;
    }

    public void setReward_id(Integer reward_id) {
        this.reward_id = reward_id;
    }

    public Date getReward_date() {
        return reward_date;
    }

    public void setReward_date(Date reward_date) {
        this.reward_date = reward_date;
    }

    public String getReward_name() {
        return reward_name;
    }

    public void setReward_name(String reward_name) {
        this.reward_name = reward_name;
    }

    public String getReward_desc() {
        return reward_desc;
    }

    public void setReward_desc(String reward_desc) {
        this.reward_desc = reward_desc;
    }

    public double getReward_money() {
        return reward_money;
    }

    public void setReward_money(double reward_money) {
        this.reward_money = reward_money;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Reward{" +
                "reward_id=" + reward_id +
                ", reward_date=" + reward_date +
                ", reward_name='" + reward_name + '\'' +
                ", reward_desc='" + reward_desc + '\'' +
                ", reward_money=" + reward_money +
                ", employee=" + employee +
                '}';
    }
}
