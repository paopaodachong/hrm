package com.cjl.controller;

import com.cjl.biz.VistorServicec;
import com.cjl.model.Vistor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by 陈佳乐 on 2018/4/20.
 */
@Controller
public class VistorController {
    @Resource
    private VistorServicec vistorServicec;

    @RequestMapping("/vistorLogin")
    public String vistorLogin(Vistor vistor, Model model) throws Exception{
        System.out.println("欢迎来到登录系统");
        System.out.println(vistor);
        System.err.println(vistorServicec.login(vistor));

        if (null!=vistor){
            return "success";
        }else{
            return "../../index";
        }
    }

    @RequestMapping("/toRegister")
    public String toRegister() throws Exception{
        return "register";
    }

    @RequestMapping("/vistorRegister")
    public String vistorRegister(Vistor vistor,Model model){
        System.out.println("欢迎来到注册系统");

        System.out.println(vistorServicec.register(vistor));
        return "success";
    }
}
