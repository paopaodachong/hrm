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
    @RequestMapping("/toEmployeeLogin")
    public String toEmployeeLogin(){
        return "employeeLogin";
    }

    /**
     * 返回个人登录主页面方法
     * @return
     */
    @RequestMapping("/toEmployeeSuccess")
    public String toEmployeeSuccess(){
        return "employeeSuccess";
    }



    @Resource
    private EmployeeService employeeService;
    @RequestMapping("/employeeLogin")
    public String employeeLogin(Employee employee, Model model,HttpSession httpSession){
        Employee employee1 = employeeService.loginEmployee(employee);
        System.out.println(employee1);
        if (null==employee1){
            model.addAttribute("message","登陆失败!请重新登陆");
            return "employeeLogin";
        }else{
            httpSession.setAttribute("employee",employee1);
            return "employeeSuccess";
        }
    }

    /**
     * 跳转至公司个人信息的方法
     * @return
     */
    @RequestMapping("/toEmployeeInfo")
    public String toEmployeeInfo(HttpSession httpSession,Model model){
        Employee employee = (Employee) httpSession.getAttribute("employee");
        model.addAttribute("loginEmployee",employee);
        return "employeeInfo";
    }



    /**
     * 跳转至公司通讯录的方法
     * @return
     */
    @RequestMapping("/toEmployeeList")
    public String toEmployeeList(){
        return "employeeList";
    }


    /**
     * 跳转至公司培训信息的方法
     * @return
     */
    @RequestMapping("/toEmployeeTrain")
    public String toEmployeeTrain(){
        return "employeeTrain";
    }


    /**
     * 跳转至公司员工奖惩信息的方法
     * @return
     */
    @RequestMapping("/toEmployeeReward")
    public String toEmployeeReward(){
        return "employeeReward";
    }



    /**
     * 跳转至公司员工考勤信息的方法
     * @return
     */
    @RequestMapping("/toEmployeeAttence")
    public String toEmployeeAttence(){
        return "employeeAttence";
    }

    /**
     * 跳转至公司员工薪资结算信息的方法
     * @return
     */
    @RequestMapping("/toEmployeeSalary")
    public String toEmployeeSalary(){
        return "employeeSalary";
    }

}
