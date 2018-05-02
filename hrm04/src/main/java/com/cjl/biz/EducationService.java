package com.cjl.biz;

import com.cjl.model.Education;

/**
 * Created by 陈佳乐 on 2018/4/26.
 */
public interface EducationService {
    boolean addEdu(Education education);
    Education selectByVistorId(Integer vistor_id);
}
