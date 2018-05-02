package com.cjl.biz;

import com.cjl.dao.ResumeMapper;
import com.cjl.model.Resume;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 陈佳乐 on 2018/4/27.
 */
@Service
public class ResumeServiceImpl implements ResumeService {
    @Resource
    private ResumeMapper resumeMapper;

    @Override
    public Resume lookResumeByVistorId(Integer vistor_id) {
        return resumeMapper.lookResumeByVistorId(vistor_id);
    }
}
