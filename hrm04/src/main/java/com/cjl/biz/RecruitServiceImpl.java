package com.cjl.biz;

import com.cjl.dao.RecruitMapper;
import com.cjl.model.Recruit;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 陈佳乐 on 2018/4/25.
 */
@Service
public class RecruitServiceImpl implements RecruitService {
    @Resource
    private RecruitMapper recruitMapper;
    @Override
    public List<Recruit> getAll() {
        return recruitMapper.getAll();
    }
}
