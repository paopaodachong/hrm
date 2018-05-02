package com.cjl.model;

import java.io.Serializable;

/**
 * 应聘记录实体类
 * Created by 陈佳乐 on 2018/4/23.
 */
public class Qualification implements Serializable{
    private Integer qua_id;
    private Recruit recruit;
    private Resume resume;
    //应聘状态
    //0 未查看,新建
    //1 已查看,拒绝
    //2 已查看,同意
    private Integer qua_state;

    public Qualification() {
    }

    public Integer getQua_id() {
        return qua_id;
    }

    public void setQua_id(Integer qua_id) {
        this.qua_id = qua_id;
    }

    public Recruit getRecruit() {
        return recruit;
    }

    public void setRecruit(Recruit recruit) {
        this.recruit = recruit;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public Integer getQua_state() {
        return qua_state;
    }

    public void setQua_state(Integer qua_state) {
        this.qua_state = qua_state;
    }
}
