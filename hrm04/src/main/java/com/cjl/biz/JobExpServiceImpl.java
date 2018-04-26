package com.cjl.biz;

import com.cjl.dao.JobExpMapper;
import com.cjl.model.JobExp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 陈佳乐 on 2018/4/26.
 */
@Service
public class JobExpServiceImpl implements JobExpService {
    @Resource
    private JobExpMapper jobExpMapper;

    @Override
    public boolean addJobExp(JobExp jobExp) {
        return jobExpMapper.addJobExp(jobExp);
    }
}
