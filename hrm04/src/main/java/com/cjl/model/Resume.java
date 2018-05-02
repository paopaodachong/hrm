package com.cjl.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 陈佳乐 on 2018/4/26.
 */
public class Resume implements Serializable{
    private Integer resume_id;
    private Vistor vistor;
    private IdCard idCard;
    private Education education;
    private List<JobExp> jobExps;

    public Resume() {
    }

    public Integer getResume_id() {
        return resume_id;
    }

    public void setResume_id(Integer resume_id) {
        this.resume_id = resume_id;
    }

    public Vistor getVistor() {
        return vistor;
    }

    public void setVistor(Vistor vistor) {
        this.vistor = vistor;
    }

    public IdCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public List<JobExp> getJobExps() {
        return jobExps;
    }

    public void setJobExps(List<JobExp> jobExps) {
        this.jobExps = jobExps;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "resume_id=" + resume_id +
                ", vistor=" + vistor +
                ", idCard=" + idCard +
                ", education=" + education +
                "工作经验"+jobExps+
                '}';
    }
}
