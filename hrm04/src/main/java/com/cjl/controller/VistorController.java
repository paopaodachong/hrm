package com.cjl.controller;

import com.cjl.biz.RecruitService;
import com.cjl.biz.VistorServicec;
import com.cjl.model.IdCard;
import com.cjl.model.Recruit;
import com.cjl.model.Vistor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 陈佳乐 on 2018/4/20.
 */
@Controller
public class VistorController {
    @Resource
    private VistorServicec vistorServicec;

    @Resource
    private RecruitService recruitService;

    @RequestMapping("/vistorLogin")
    public String vistorLogin(Vistor vistor, Model model) throws Exception{
        System.out.println("欢迎来到登录系统");
        System.out.println(vistor);
        System.err.println(vistorServicec.login(vistor));

        if (null!=vistor){
            model.addAttribute("vistor",vistor);
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
    public String vistorRegister(Vistor vistor,Model model)throws Exception{
        System.out.println("欢迎来到注册系统");
        if (vistorServicec.register(vistor)){
            model.addAttribute("message","注册成功!请登录!!!");
            return "../../index";
        }else{
            model.addAttribute("message","注册失败!请重新注册!!!");
            return "register";
        }
    }

    /**
     * 查看当前所有的招聘信息
     * @param model
     * @return
     */
    @RequestMapping("/getCurRecruit")
    public String getCurRecruit(Model model){
        List<Recruit> recruits = recruitService.getAll();

        model.addAttribute("recruits",recruits);
        return "recruitLook";
    }

    @RequestMapping("/toAddIdcard")
    public String toAddIdcard(){
        return "addIdcard";
    }

    @RequestMapping("/addIdcard")
    public String addIdcard(IdCard idCard,Model model){
        System.out.println(idCard);

        return "test";
    }
}
