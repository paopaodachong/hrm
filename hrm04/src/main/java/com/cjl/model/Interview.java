package com.cjl.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 面试记录实体类
 * Created by 陈佳乐 on 2018/5/2.
 */
public class Interview implements Serializable {
    private Integer interview_id;
    //对应电子应聘记录
    private Qualification qualification;
    //面试邀请时间
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date interviewCreateTime;
    //面试时间
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date interview_happenTime;
    //面试状态
    //0 创建面试了,但还未有结果,面试对象未响应
    //1 面试对象同意
    //2 面试对象拒绝
    //3 面试过期
    //99面试通过
    private Integer interview_state;

    public Interview() {
    }

    public Integer getInterview_id() {
        return interview_id;
    }

    public void setInterview_id(Integer interview_id) {
        this.interview_id = interview_id;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public Date getInterviewCreateTime() {
        return interviewCreateTime;
    }

    public void setInterviewCreateTime(Date interviewCreateTime) {
        this.interviewCreateTime = interviewCreateTime;
    }

    public Date getInterview_happenTime() {
        return interview_happenTime;
    }

    public void setInterview_happenTime(Date interview_happenTime) {
        this.interview_happenTime = interview_happenTime;
    }

    public Integer getInterview_state() {
        return interview_state;
    }

    public void setInterview_state(Integer interview_state) {
        this.interview_state = interview_state;
    }
}
