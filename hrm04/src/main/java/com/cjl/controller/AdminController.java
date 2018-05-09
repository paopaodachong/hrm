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
    public String toAdminSuccess() {
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
     * @param model
     * @return
     */
    private Model getAllDetails(Model model) {
        List<Dept> depts = deptService.getAllDept();
        List<DeptPosition> deptPositions = deptPositionService.getAllDeptPosition();
        List<EmployeeLevel> employeeLevels = employeeLevelService.getAllEmployeeLevel();
        List<Recruit> recruits = recruitService.getAll();

        model.addAttribute("depts", depts);
        model.addAttribute("deptPositions", deptPositions);
        model.addAttribute("employeeLevels", employeeLevels);
        model.addAttribute("recruits", recruits);
        return model;
    }
    @RequestMapping("/toAdminDept")
    public String toAdminDept(Model model){
        List<Dept> depts = deptService.getAllDept();
        model.addAttribute("depts",depts);
        return "adminDept";
    }

    @RequestMapping("/adminDept")
    public String adminDept(Dept dept ,Model model,@Param("operation")String operation){
        if (operation.equals("1")){
            String message = "";
            List<Employee> employees = employeeService.getEmployeesByDeptname(dept.getDept_name());
            if (employees==null||employees.size()==0){
                if (deptService.deleteDeptByDeptId(dept.getDept_id())){
                    message = "部门删除成功";
                    List<Dept> depts = deptService.getAllDept();
                    model.addAttribute("message",message);
                    model.addAttribute("depts",depts);
                }
            }else{
                message = "部门内还有员工,不能删除";
                List<Dept> depts = deptService.getAllDept();
                model.addAttribute("message",message);
                model.addAttribute("depts",depts);
            }
            return "adminDept";
        }else if (operation.equals("2")){
            model.addAttribute("dept",dept);
            return "adminChangeDept";
        }else if (operation.equals("3")){
            System.out.println(dept);
            if (deptService.updateDeptByDept(dept)){
                String message = "更新成功";
                List<Dept> depts = deptService.getAllDept();
                model.addAttribute("message",message);
                model.addAttribute("depts",depts);
            }
            return "adminDept";
        }else if (operation.equals("4")){
            /*if (deptService.selectDeptByDeptName(dept)==null){
                if (deptService.addDeptByDept(dept)){
                    String message = "添加成功";
                    List<Dept> depts = deptService.getAllDept();
                    model.addAttribute("message",message);
                    model.addAttribute("depts",depts);
                }
                return "adminDept";
            }else{
                String message = "您要添加的部门重名,已返回主页面";
                List<Dept> depts = deptService.getAllDept();
                model.addAttribute("message",message);
                model.addAttribute("depts",depts);
                return "adminDept";
            }*/
        }
        return "adminSuccess";
    }


    @RequestMapping("/toAddDept")
    public String toAddDept(){
        return "addDept";
    }
    @RequestMapping("/addDept")
    public String addDept(Model model,Dept dept){
        if (deptService.selectDeptByDeptName(dept)==null){
            if (deptService.addDeptByDept(dept)){
                String message = "添加成功";
                List<Dept> depts = deptService.getAllDept();
                model.addAttribute("message",message);
                model.addAttribute("depts",depts);
            }
            return "adminDept";
        }else{
            String message = "您要添加的部门重名,已返回主页面";
            List<Dept> depts = deptService.getAllDept();
            model.addAttribute("message",message);
            model.addAttribute("depts",depts);
            return "adminDept";
        }
    }
    @RequestMapping("/toAdminDeptPosition")
    public String toDeptPosition(Model model){
        List<DeptPosition> deptPositions = deptPositionService.getAllDeptPosition();
        model.addAttribute("deptPositions",deptPositions);
        return "adminDeptPosition";
    }
    @RequestMapping("/adminDeptPosition")
    public String deptPosition(Model model,DeptPosition deptPosition,@Param("operation")String operation){
        //判断operation来进行相关操作
        if (operation.equals("1")){
            //进行删除操作
            if (deptPositionService.deleteDeptPositionByDP(deptPosition)){
                String message = "删除成功!";
                model.addAttribute("message",message);
            }
        }else if (operation.equals("2")){
            //进行修改操作
            model.addAttribute("deptPosition",deptPosition);
            return "adminChangeDeptPosition";
        }else if (operation.equals("3")){
            if (deptPositionService.updateDeptPositionByDP(deptPosition)){
                String message = "更新成功";
                model.addAttribute("message",message);
            }
        }else if (operation.equals("4")){
            return "adminAddDeptPosition";
        }else if (operation.equals("5")){
            if (deptPositionService.addDeptPositionByDP(deptPosition)){
                String message = "添加成功";
                model.addAttribute("message",message);
            }
        }
        List<DeptPosition> deptPositions = deptPositionService.getAllDeptPosition();
        model.addAttribute("deptPositions",deptPositions);
        return "adminDeptPosition";
    }

    @Resource
    private EmployeeService employeeService;
    @Resource
    private TrainService trainService;
    @Resource
    private TrainDetailService trainDetailService;

    @RequestMapping("/toAddTrain")
    public String toAddTrain(HttpSession session, Model model) {
        //获取部门及员工信息
        List<Dept> depts = deptService.getAllDept();
        List<Employee> employees = employeeService.getAllEmployee();
        List<String> deptNames = new ArrayList<>();
        for (Dept dept : depts) {
            String str = dept.getDept_name();

            deptNames.add(str);

        }
        model.addAttribute("depts", depts);
        model.addAttribute("deptNames", deptNames);
        model.addAttribute("employees", employees);
        return "addTrain";
    }

    @RequestMapping("/addTrain")
    public String addTrain(Train train, Model model, @Param("dept") String dept) {
        //获取部门所有人员
        String message = "添加人员";
        List<Employee> employees = employeeService.getEmployeesByDeptname(dept);
        System.out.println(employees);
        //添加培训

        Integer train_id = trainService.getIdByTrain(train);
        System.out.println("train_id" + train_id);
        if (null == train_id) {
            trainService.addTrain(train);
            train_id = trainService.getIdByTrain(train);
        } else {
            message = "相关培训已经存在,无法添加培训,经查看可添加";
        }

        //  添加培训相关人员

        train.setTrain_id(train_id);
        Integer i = 0;
        for (Employee employee : employees) {
            i = i + 1;
            System.out.println(employee.getEmployee_id());
            System.out.println(train_id);
            trainDetailService.addTrainDetaiByTrain(train, employee);
        }
        message = message + i + "人";


        model.addAttribute("message", message);
        return "adminSuccess";
    }


    @Resource
    private PerformanceSalaryService performanceSalaryService;

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping("/toAddPerformanceSalary")
    public String toAddPerformanceSalary(Model model) {
        PerformanceSalary performanceSalary = performanceSalaryService.getThisMonthPfs();
        if (null == performanceSalary) {

            return "addPerformanceSalary";
        } else {
            model.addAttribute("performanceSalary", performanceSalary);
            return "changePerformanceSalary";
        }

    }


    /**
     * 添加全新的绩效奖金
     *
     * @param performanceSalary
     * @param model
     * @return
     */
    @RequestMapping("/addPerformanceSalary")
    public String addPerformanceSalary(PerformanceSalary performanceSalary, Model model) {
        String message = "进入绩效奖金添加环节" + performanceSalary.getPerformanceSalary_money() + performanceSalary.getPerformanceSalary_desc();

        if (performanceSalaryService.addNewPerformanceSalary(performanceSalary)) {
            message = message + "添加成功了";
        }
        model.addAttribute("message", message);
        return "addPerformanceSalary";
    }

    /**
     *
     * @param performanceSalary
     * @param model
     * @return
     */
    @RequestMapping("/changePerformanceSalary")
    public String changePerformanceSalary(PerformanceSalary performanceSalary, Model model) {
        String message = "更新失败了";
        if (performanceSalaryService.updatePfs(performanceSalary)) {
            message = "更新成功了";

        }
        model.addAttribute("message", message);
        return "changePerformanceSalary";
    }

    @Resource
    private SalaryService salaryService;
    @Resource
    private ClockService clockService;
    @Resource
    private RewardService rewardService;

    /**
     *  生成和处理上月薪资结算
     * @param model
     * @return
     */
    @RequestMapping("/addAndShowAllSalary")
    public String addAndShowAllSalary(Model model) {
        //检查有没有已经添加
        List<Salary> salaries = salaryService.selectCurrentMonthSalary();
        List<Employee> employees = employeeService.getAllEmployee();
        PerformanceSalary performanceSalary = performanceSalaryService.getThisMonthPfs();
        //要计算每个人的钱,并添加
        if (null == performanceSalary) {
            String message = "请首先添加绩效奖金";
            return "addPerformanceSalary";
        }
        //如果已经添加了
        if (null != salaries && 0 != salaries.size()) {
            //最好全部更新一下
            //更新过会儿来写

            for (Employee employee : employees) {
                Salary salary = salaryService.selectCurrentMonthSalaryByEmployee(employee);
                //基本薪资
                double baseSalry = (employee.getDept().getDept_baseSalary()) * (employee.getDeptPosition().getDeptPosition_salaryRatio()) * (employee.getEmployeeLevel().getEmployeeLevel_salaryRatio());
                System.out.println("基本薪资"+baseSalry);
                //绩效薪资
                double pfSalary = (performanceSalary.getPerformanceSalary_money()) * (employee.getDeptPosition().getDeptPosition_salaryRatio()) * (employee.getEmployeeLevel().getEmployeeLevel_salaryRatio());
                System.out.println("绩效薪资"+pfSalary);
                //加班工资
                //1计算工作天数
                double moreWorkSalary = 0;
                int normalDays = clockService.getLastMonthNormalClockByEmployee(employee).size();
                int onworkDays = clockService.getLastMonthOnworkClockByEmployee(employee).size();
                System.out.println("正常打卡天数"+normalDays);
                System.out.println("加迟到打卡天数"+onworkDays);
                if (onworkDays >= 22) {
                    moreWorkSalary = baseSalry * (onworkDays - 22)/22;
                } else {
                    //2计算旷工扣除钱数
                    moreWorkSalary = baseSalry * (onworkDays - 22)/22;
                }
                System.out.println("加班费"+moreWorkSalary);
                //计算迟到早退钱数
                double lazyWorkSalary = (normalDays - onworkDays) * 50;
                System.out.println("迟到早退扣除钱"+lazyWorkSalary);
                //奖惩费用
                List<Reward> rewards = rewardService.getLastMonthRewardsByEmployee(employee);
                double rewardsSalary = 0;
                for (Reward reward : rewards) {
                    rewardsSalary = rewardsSalary + reward.getReward_money();
                }
                System.out.println("各项奖赏的钱"+rewardsSalary);
                //社保应发工资0.2

                double securitySalary = 0.2 * (baseSalry + pfSalary + moreWorkSalary + rewardsSalary);
                System.out.println("社保"+securitySalary);
                //计算得到薪资
                double salary_money = baseSalry + pfSalary + moreWorkSalary + rewardsSalary - securitySalary;
                //加入薪资表中
                salary.setSalary_money(salary_money);
                salaryService.updateSalary(salary);
                model.addAttribute("salaries", salaries);
            }
        } else {

            for (Employee employee : employees) {
                //基本薪资
                double baseSalry = (employee.getDept().getDept_baseSalary()) * (employee.getDeptPosition().getDeptPosition_salaryRatio()) * (employee.getEmployeeLevel().getEmployeeLevel_salaryRatio());
                //绩效薪资
                double pfSalary = (performanceSalary.getPerformanceSalary_money()) * (employee.getDeptPosition().getDeptPosition_salaryRatio()) * (employee.getEmployeeLevel().getEmployeeLevel_salaryRatio());
                //加班工资
                //1计算工作天数
                double moreWorkSalary = 0;
                int normalDays = clockService.getLastMonthNormalClockByEmployee(employee).size();
                int onworkDays = clockService.getLastMonthOnworkClockByEmployee(employee).size();
                if (onworkDays >= 22) {
                    moreWorkSalary = baseSalry * (onworkDays - 22)/22;
                } else {
                    //2计算旷工扣除钱数
                    moreWorkSalary = baseSalry * (onworkDays - 22)/22;
                }
                //计算迟到早退钱数
                double lazyWorkSalary = (normalDays - onworkDays) * 50;

                //奖惩费用
                List<Reward> rewards = rewardService.getLastMonthRewardsByEmployee(employee);
                double rewardsSalary = 0;
                for (Reward reward : rewards) {
                    rewardsSalary = rewardsSalary + reward.getReward_money();
                }
                //社保应发工资0.2
                double securitySalary = 0.2 * (baseSalry + pfSalary + moreWorkSalary + rewardsSalary);
                //计算得到薪资
                double salary_money = baseSalry + pfSalary + moreWorkSalary + rewardsSalary - securitySalary;
                //加入薪资表中
                salaryService.addSalaryByDetails(salary_money, employee, performanceSalary);
            }
            salaries =salaryService.selectCurrentMonthSalary();
            model.addAttribute("salaries",salaries);
        }
        return "addAndShowAllSalary";
    }

    @Resource
    private SalaryDefService salaryDefService;

    /**
     * 薪资复议添加程序,在判别该员工当月只有一条薪资复议后,进行薪资复议添加
     * @param salaryDef
     * @param httpSession
     * @return
     */
    @RequestMapping("/addSalaryDef")
    public String addSalaryDef(SalaryDef salaryDef,HttpSession httpSession,Model model){
        //获取页面中的员工信息
        Employee employee = (Employee) httpSession.getAttribute("employee");
        //入方法判断
        if (salaryDefService.getCurrentByEmployee(employee)!=null){
            String message = "您本月已提起过薪资复议";
            model.addAttribute("message",message);
            return "employeeSalary";
        }
        salaryDef.setEmployee(employee);
        salaryDefService.addNewSalaryDef(salaryDef);

        String message = "您本月薪资复议提起成功,等待管理员处理";
        model.addAttribute("message",message);
        return "employeeSalary";
    }

    /**
     * 链接,需要传数据
     * @return
     */
    @RequestMapping("/showSalaryDef")
    public String showSalaryDef(Model model){
        //要传过去的页面是用来处理薪资复议的,先将未处理的薪资复议传过去
        List<SalaryDef> salaryDefs = salaryDefService.getUnresolveDef();
        model.addAttribute("salaryDefs",salaryDefs);
        return "adminSalaryDefCandel";
    }

    @RequestMapping("/resolveSalaryDef")
    public String resolveSalaryDef(Reward reward,
                                   @Param("salaryDef_id")Integer salaryDef_id,
                                   @Param("resolving")String resolving,
                                   @Param("employee_id")Integer employee_id,
                                   Model model){
        String message = "";
        if (resolving.equals("1")) {
            message = "您同意了该薪资复议";
            salaryDefService.updateSalaryDefBySalaryDefIdAndState(salaryDef_id, 1);
            if (rewardService.adminAddNewReward(reward, employee_id)) {
                message = message + "并且添加到了奖惩中";
            }
        } else if (resolving.equals("2")) {
            salaryDefService.updateSalaryDefBySalaryDefIdAndState(salaryDef_id, 2);
            message = "您否决了该薪资复议";
        }
        model.addAttribute("message",message);
        return showSalaryDef(model);
    }
}
