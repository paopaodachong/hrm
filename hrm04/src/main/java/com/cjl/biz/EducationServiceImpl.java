package com.cjl.biz;

import com.cjl.dao.EducationMapper;
import com.cjl.model.Education;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 陈佳乐 on 2018/4/26.
 */
@Service
public class EducationServiceImpl implements EducationService {
    @Resource
    private EducationMapper educationMapper;

    /**
     * 添加教育的方法
     * @param education
     * @return
     */
    @Override
    public boolean addEdu(Education education) {
        return educationMapper.addEdu(education);
    }

    /**
     * 根据游客id获取
     * @param vistor_id
     * @return
     */
    @Override
    public Education selectByVistorId(Integer vistor_id) {
        return educationMapper.selectByVistorId(vistor_id);
    }
}
