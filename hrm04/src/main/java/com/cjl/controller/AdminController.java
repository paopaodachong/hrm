package com.cjl.controller;

import com.cjl.biz.*;
import com.cjl.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
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
    @Resource
    private DeptService deptService;
    @Resource
    private DeptPositionService deptPositionService;
    @Resource
    private EmployeeLevelService employeeLevelService;
    @Resource
    private RecruitService recruitService;

    @RequestMapping("/getAll")
    public String getAll(Model model) {
        List<Dept> depts = deptService.getAllDept();
        List<DeptPosition> deptPositions = deptPositionService.getAllDeptPosition();
        List<EmployeeLevel> employeeLevels = employeeLevelService.getAllEmployeeLevel();
        List<Recruit> recruits = recruitService.getAll();

        model.addAttribute("depts",depts);
        model.addAttribute("deptPositions",deptPositions);
        model.addAttribute("employeeLevels",employeeLevels);
        model.addAttribute("recruits",recruits);

        return "adminSeeAll";
    }
}
