package com.cjl.dao;

import com.cjl.model.Qualification;

/**
 * Created by 陈佳乐 on 2018/5/2.
 */
public interface QualificationMapper {
    boolean addQua(Qualification qualification);
    boolean updateFailed(Qualification qualification);
    boolean updateSuccess(Qualification qualification);
}
