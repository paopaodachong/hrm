package com.cjl.dao;

import com.cjl.model.Resume;

/**
 * Created by 陈佳乐 on 2018/4/27.
 */
public interface ResumeMapper {
    Resume lookResumeByVistorId(Integer vistor_id);
    boolean addResume(Integer vistor_id);
}
