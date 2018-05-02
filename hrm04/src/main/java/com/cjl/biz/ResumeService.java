package com.cjl.biz;

import com.cjl.model.Resume;

/**
 * Created by 陈佳乐 on 2018/4/27.
 */
public interface ResumeService {
    Resume lookResumeByVistorId(Integer vistor_id);
}
