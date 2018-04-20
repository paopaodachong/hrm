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
    public String vistorLogin(Vistor vistor, Model model){
        //Vistor vistor1 = vistorServicec.login(vistor);
        if (vistor.getName().equals("张三")&&vistor.getPass().equals("123")){
            return "success";
        }else{
            return "../../index";
        }
    }
}
