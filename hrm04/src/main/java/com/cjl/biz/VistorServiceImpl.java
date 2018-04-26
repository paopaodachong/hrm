package com.cjl.biz;

import com.cjl.dao.VistorMapper;
import com.cjl.model.Vistor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 陈佳乐 on 2018/4/20.
 */
@Service
public class VistorServiceImpl implements VistorServicec {
    @Resource
    private VistorMapper vistorMapper;
    @Override
    public Vistor login(Vistor vistor) {
        return vistorMapper.login(vistor);
    }

    @Override
    public boolean register(Vistor vistor){
        return vistorMapper.add(vistor);
    }
}
