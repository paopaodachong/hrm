package com.cjl.dao;

import com.cjl.model.Education;

/**
 * Created by 陈佳乐 on 2018/4/26.
 */
public interface EducationMapper {
    boolean addEdu(Education education);
    Education selectByVistorId(Integer vistor_id);
}
