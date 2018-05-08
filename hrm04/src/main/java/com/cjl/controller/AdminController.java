package com.cjl.controller;

import com.cjl.biz.*;
import com.cjl.model.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 陈佳乐 on 2018/4/25.
 */
@Controller
public class AdminController {
    @Resource
    private AdminService adminService;

    @RequestMapping("/toAdminLogin")
    public String toAdminLogin(Model model) {
        return "adminLogin";
    }

    @RequestMapping("/adminLogin")
    public String addRecruit(Admin admin, Model model) {
        System.out.println(admin);
        Admin admin1 = adminService.adminLogin(admin);
        if (null != admin1) {
            return "adminSuccess";
        } else {
            return "adminLogin";
        }

    }
    @RequestMapping("toAdminSuccess")
    public String toAdminSuccess(){
        return "adminSuccess";
    }
    @Resource
    private DeptService deptService;
    @Resource
    private DeptPositionService deptPositionService;
    @Resource
    private EmployeeLevelService employeeLevelService;
    @Resource
    private RecruitService recruitService;

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping("/getAll")
    public String getAll(Model model) {
        //mvc m 设置获取相应系数
        //调用私有方法getAllDetails
        model = getAllDetails(model);
        return "adminSeeAll";
    }

    /**
     *
     * @param model
     * @return
     */
    private Model getAllDetails(Model model){
        List<Dept> depts = deptService.getAllDept();
        List<DeptPosition> deptPositions = deptPositionService.getAllDeptPosition();
        List<EmployeeLevel> employeeLevels = employeeLevelService.getAllEmployeeLevel();
        List<Recruit> recruits = recruitService.getAll();

        model.addAttribute("depts",depts);
        model.addAttribute("deptPositions",deptPositions);
        model.addAttribute("employeeLevels",employeeLevels);
        model.addAttribute("recruits",recruits);
        return model;
    }

    @Resource
    private EmployeeService employeeService;
    @Resource
    private TrainService trainService;
    @Resource
    private TrainDetailService trainDetailService;
    @RequestMapping("/toAddTrain")
    public String toAddTrain(HttpSession session,Model model){
        //获取部门及员工信息
        List<Dept> depts = deptService.getAllDept();
        List<Employee> employees = employeeService.getAllEmployee();
        List<String> deptNames = new ArrayList<>();
        for (Dept dept:depts){
            String str = dept.getDept_name();

            deptNames.add(str);

        }
        model.addAttribute("depts",depts);
        model.addAttribute("deptNames",deptNames);
        model.addAttribute("employees",employees);
        return "addTrain";
    }

    @RequestMapping("/addTrain")
    public String addTrain(Train train, Model model, @Param("dept")String dept){
        //获取部门所有人员
        String message = "添加人员";
        List<Employee> employees = employeeService.getEmployeesByDeptname(dept);
        System.out.println(employees);
        //添加培训

        Integer train_id = trainService.getIdByTrain(train);
        System.out.println("train_id"+train_id);
        if (null == train_id){
            trainService.addTrain(train);
            train_id = trainService.getIdByTrain(train);
        }else {
            message = "相关培训已经存在,无法添加培训,经查看可添加";
        }

        //  添加培训相关人员

        train.setTrain_id(train_id);
        Integer i = 0;
        for (Employee employee :employees){
            i= i +1;
            System.out.println(employee.getEmployee_id());
            System.out.println(train_id);
            trainDetailService.addTrainDetaiByTrain(train,employee);
        }
        message = message+i+"人";


        model.addAttribute("message",message);
        return "adminSuccess";
    }




    @Resource
    private PerformanceSalaryService performanceSalaryService;
    @RequestMapping("/toAddPerformanceSalary")
    public String toAddPerformanceSalary(Model model){
        List<PerformanceSalary> performanceSalaries = performanceSalaryService.getThisMonthPfs();
        if (null==performanceSalaries||performanceSalaries.size()==0){

            return "addPerformanceSalary";
        }else{
            model.addAttribute("performanceSalaries",performanceSalaries);
            return "changePerformanceSalary";
        }

    }


    /**
     * 添加全新的绩效奖金
     * @param performanceSalary
     * @param model
     * @return
     */
    @RequestMapping("/addPerformanceSalary")
    public String addPerformanceSalary(PerformanceSalary performanceSalary,Model model){
        String message = "进入绩效奖金添加环节"+performanceSalary.getPerformanceSalary_money()+performanceSalary.getPerformanceSalary_desc();

        if (performanceSalaryService.addNewPerformanceSalary(performanceSalary)) {
            message = message +"添加成功了";
        }
        model.addAttribute("message",message);
        return "addPerformanceSalary";
    }
    @RequestMapping("/changePerformanceSalary")
    public String changePerformanceSalary(PerformanceSalary performanceSalary,Model model){
        String message = "更新失败了";
        if (performanceSalaryService.updatePfs(performanceSalary)){
            message = "更新成功了";

        }
        model.addAttribute("message",message);
        return "changePerformanceSalary";
    }



}
