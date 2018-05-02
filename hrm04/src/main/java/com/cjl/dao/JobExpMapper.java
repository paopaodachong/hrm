package com.cjl.dao;

import com.cjl.model.JobExp;

import java.util.List;

/**
 * Created by 陈佳乐 on 2018/4/26.
 */
public interface JobExpMapper {
    boolean addJobExp(JobExp jobExp);
    List<JobExp> selectByVistor_id(Integer vistor_id);
}
