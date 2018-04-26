package com.cjl.controller;

import com.cjl.biz.*;
import com.cjl.model.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 陈佳乐 on 2018/4/20.
 */
@Controller
@SessionAttributes("vistor")
public class VistorController {
    @Resource
    private VistorServicec vistorServicec;

    @Resource
    private RecruitService recruitService;

    @RequestMapping("/vistorLogin")

    public String vistorLogin(Vistor vistor, Model model) throws Exception{
        System.out.println("欢迎来到登录系统");
        System.out.println(vistor);
        vistor = vistorServicec.login(vistor);

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
    public String vistorRegister(Vistor vistor,Model model){
        System.out.println("欢迎来到注册系统");
        boolean flag = false;
        try {
            flag = vistorServicec.register(vistor);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (flag){
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


    @Resource
    private IdCardService idCardService;

    /**
     *
     * @param idCard
     * @param vistor
     * @param model
     * @return
     */
    @RequestMapping("/addIdcard")
    public String addIdcard(IdCard idCard, @ModelAttribute("vistor")Vistor vistor, Model model){
        System.out.println(idCard);
        System.out.println(vistor);
        idCard.setVistor(vistor);
        System.out.println(idCard);
        idCardService.addIdCard(idCard);
        return "test";
    }

    @RequestMapping("/toAddEdu")
    public String toAddEdu(){
        return "addEducation";
    }
    @Resource
    private EducationService educationService;
    @RequestMapping("/addEdu")
    public String addEdu(Education education,@ModelAttribute("vistor") Vistor vistor,Model model){
        education.setVistor(vistor);
        educationService.addEdu(education);
        return "test";
    }

    @RequestMapping("toAddJobExp")
    public String toAddJobExp(){
        return "addJobExp";
    }
    @Resource
    private JobExpService jobExpService;
    @RequestMapping("/addJobExp")
    public String addJobExp(JobExp jobExp,@ModelAttribute("vistor")Vistor vistor,Model model){
        jobExp.setVistor(vistor);
        jobExpService.addJobExp(jobExp);
        return "test";
    }
}
