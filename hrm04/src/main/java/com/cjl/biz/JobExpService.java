package com.cjl.biz;

import com.cjl.model.JobExp;

import java.util.List;

/**
 * Created by 陈佳乐 on 2018/4/26.
 */
public interface JobExpService {
    boolean addJobExp(JobExp jobExp);
    List<JobExp> selectByVistorId(Integer vistor_id);
}
