package com.cjl.biz;

import com.cjl.dao.QualificationMapper;
import com.cjl.model.Qualification;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 陈佳乐 on 2018/5/2.
 */
@Service
public class QualificationServiceImpl implements QualificationService {
    /**
     * springMVC  注解
     */
    @Resource
    private QualificationMapper qualificationMapper;

    /**
     * 初次添加应聘记录的方法
     * @param qualification
     * @return
     */
    //添加应聘记录
    @Override
    public boolean addQua(Qualification qualification) {
        return qualificationMapper.addQua(qualification);
    }

    /**
     * 拒绝相应应聘的方法
     * @param qualification
     * @return
     */
    @Override
    public boolean updateFailed(Qualification qualification) {
        return qualificationMapper.updateFailed(qualification);
    }

    /**
     * 同意相应应聘的方法
     * @param qualification
     * @return
     */
    @Override
    public boolean updateSuccess(Qualification qualification) {
        return qualificationMapper.updateSuccess(qualification);
    }
}
