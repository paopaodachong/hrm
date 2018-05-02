package com.cjl.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 教育信息实体类
 * Created by 陈佳乐 on 2018/4/26.
 */
public class Education {
    //保存序列
    private Integer edu_id;
    //学校名称
    private String edu_schoolName;
    //专业名称
    private String edu_majorName;
    //入学日期
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date edu_startTime;
    //学制
    //全日制,自考,成人大学
    private String edu_type;
    //学历
    private String edu_level;
    //学位
    private String edu_degree;

    private Vistor vistor;

    public Education() {
    }

    public Integer getEdu_id() {
        return edu_id;
    }

    public void setEdu_id(Integer edu_id) {
        this.edu_id = edu_id;
    }

    public String getEdu_schoolName() {
        return edu_schoolName;
    }

    public void setEdu_schoolName(String edu_schoolName) {
        this.edu_schoolName = edu_schoolName;
    }

    public String getEdu_majorName() {
        return edu_majorName;
    }

    public void setEdu_majorName(String edu_majorName) {
        this.edu_majorName = edu_majorName;
    }

    public Date getEdu_startTime() {
        return edu_startTime;
    }

    public void setEdu_startTime(Date edu_startTime) {
        this.edu_startTime = edu_startTime;
    }

    public String getEdu_type() {
        return edu_type;
    }

    public void setEdu_type(String edu_type) {
        this.edu_type = edu_type;
    }

    public String getEdu_level() {
        return edu_level;
    }

    public void setEdu_level(String edu_level) {
        this.edu_level = edu_level;
    }

    public String getEdu_degree() {
        return edu_degree;
    }

    public void setEdu_degree(String edu_degree) {
        this.edu_degree = edu_degree;
    }

    public Vistor getVistor() {
        return vistor;
    }

    public void setVistor(Vistor vistor) {
        this.vistor = vistor;
    }
}
