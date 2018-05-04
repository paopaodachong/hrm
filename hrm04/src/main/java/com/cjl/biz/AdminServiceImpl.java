package com.cjl.biz;

import com.cjl.dao.AdminMapper;
import com.cjl.model.Admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 陈佳乐 on 2018/4/25.
 */
@Service
public class AdminServiceImpl implements AdminService{
    @Resource
    private AdminMapper adminMapper;


    /**
     * 管理员的登录方法
     * @param admin
     * @return
     */
    @Override
    public Admin adminLogin(Admin admin) {
        return adminMapper.login(admin);
    }

}
