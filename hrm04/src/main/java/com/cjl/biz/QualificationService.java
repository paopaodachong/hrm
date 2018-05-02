package com.cjl.biz;

import com.cjl.model.Qualification;

/**
 * Created by 陈佳乐 on 2018/5/2.
 */
public interface QualificationService {
    boolean addQua(Qualification qualification);
    boolean updateFailed(Qualification qualification);
    boolean updateSuccess(Qualification qualification);

}
