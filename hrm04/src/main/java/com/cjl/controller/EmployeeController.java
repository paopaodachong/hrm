package com.cjl.controller;

import com.cjl.biz.EmployeeService;
import com.cjl.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by 陈佳乐 on 2018/5/2.
 */
@Controller
public class EmployeeController {
    @RequestMapping("toEmployeeLogin")
    public String toEmployeeLogin(){
        return "employeeLogin";
    }

    @Resource
    private EmployeeService employeeService;
    @RequestMapping("employeeLogin")
    public String employeeLogin(Employee employee, Model model,HttpSession httpSession){
        Employee employee1 = employeeService.loginEmployee(employee);
        if (null==employee1){
            model.addAttribute("message","登陆失败!请重新登陆");
            return "employeeLogin";
        }else{
            httpSession.setAttribute("employee",employee1);
            model.addAttribute("message","登陆成功");
            return "employeeSuccess";
        }
    }
}
