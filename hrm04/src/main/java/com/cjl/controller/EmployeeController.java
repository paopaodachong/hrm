package com.cjl.controller;

import com.cjl.biz.*;
import com.cjl.model.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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

    @Resource
    private TrainDetailService trainDetailService;
    /**
     * 跳转至公司培训信息的方法
     * @return
     */
    @RequestMapping("/toEmployeeTrain")
    public String toEmployeeTrain(HttpSession httpSession,Model model){
        Employee employee = (Employee) httpSession.getAttribute("employee");
        if (null == employee){
            String message  = "尚未登录或登录失效,请重新登陆";
            return "../../index";
        }
        List<TrainDetail> trainDetails =  trainDetailService.getTrainDetailByEmployeeId(employee.getEmployee_id());
        model.addAttribute("trainDetails",trainDetails);
        return "employeeTrain";
    }


    @Resource
    private RewardService rewardService;
    /**
     * 跳转至公司员工奖惩信息的方法
     * 需要提前传入参数
     * @return
     */
    @RequestMapping("/toEmployeeReward")
    public String toEmployeeReward(HttpSession httpSession,Model model){
        //获取session中的employee数据
        Employee employee = (Employee) httpSession.getAttribute("employee");

        List<Reward> rewards = rewardService.getAllRewardsByEmployee(employee);

        model.addAttribute("rewards",rewards);


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

    @Resource
    private SalaryService salaryService;
    @Resource
    private PerformanceSalaryService performanceSalaryService;
    /**
     * 跳转至公司员工薪资结算信息的方法
     * @return
     */
    @RequestMapping("/toEmployeeSalary")
    public String toEmployeeSalary(HttpSession httpSession,Model model){
        Employee employee = (Employee) httpSession.getAttribute("employee");
        Salary salary = salaryService.selectCurrentMonthSalaryByEmployee(employee);
        PerformanceSalary performanceSalary = performanceSalaryService.getThisMonthPfs();

        String message = "正在查看个人上月薪水信息";
        if (null==salary){
            message = "管理员尚未完成工资条";
        }else{
            //基本薪资
            double baseSalry = (employee.getDept().getDept_baseSalary()) * (employee.getDeptPosition().getDeptPosition_salaryRatio()) * (employee.getEmployeeLevel().getEmployeeLevel_salaryRatio());
            System.out.println("基本薪资"+baseSalry);
            model.addAttribute("baseSalary",baseSalry);
            //绩效薪资
            double pfSalary = (performanceSalary.getPerformanceSalary_money()) * (employee.getDeptPosition().getDeptPosition_salaryRatio()) * (employee.getEmployeeLevel().getEmployeeLevel_salaryRatio());
            System.out.println("绩效薪资"+pfSalary);
            model.addAttribute("pfsSalary",pfSalary);
            //加班工资
            //1计算工作天数
            double moreWorkSalary = 0;
            int normalDays = clockService.getLastMonthNormalClockByEmployee(employee).size();
            int onworkDays = clockService.getLastMonthOnworkClockByEmployee(employee).size();
            System.out.println("正常打卡天数"+normalDays);
            model.addAttribute("normalDays",normalDays);
            model.addAttribute("onworkDays",onworkDays);
            System.out.println("加迟到打卡天数"+onworkDays);
            if (onworkDays >= 22) {
                moreWorkSalary = baseSalry * (onworkDays - 22)/22;
            } else {
                //2计算旷工扣除钱数
                moreWorkSalary = baseSalry * (onworkDays - 22)/22;
            }
            model.addAttribute("moreWorkSalary",moreWorkSalary);
            System.out.println("加班费"+moreWorkSalary);
            //计算迟到早退钱数
            double lazyWorkSalary = (normalDays - onworkDays) * 50;
            System.out.println("迟到早退扣除钱"+lazyWorkSalary);
            model.addAttribute("lazyWorkSalary",lazyWorkSalary);
            //奖惩费用
            List<Reward> rewards = rewardService.getLastMonthRewardsByEmployee(employee);
            double rewardsSalary = 0;
            for (Reward reward : rewards) {
                rewardsSalary = rewardsSalary + reward.getReward_money();
            }
            System.out.println("各项奖赏的钱"+rewardsSalary);
            model.addAttribute("rewardsSalary",rewardsSalary);
            //社保应发工资0.2

            double securitySalary = 0.2 * (baseSalry + pfSalary + moreWorkSalary + rewardsSalary);
            System.out.println("社保"+securitySalary);
            model.addAttribute("securitySalary",securitySalary);
            //计算得到薪资
            double salary_money = baseSalry + pfSalary + moreWorkSalary + rewardsSalary - securitySalary;
            model.addAttribute("salary_money",salary_money);
            message = "管理员已完成工资条制作";
        }
        model.addAttribute("message",message);
        return "employeeSalary";
    }

    @Resource
    private ClockService clockService;
    /**
     * 上班打卡方法
     * @param httpSession
     * @param model
     * @return
     */
    @RequestMapping("/clockIn")
    public String clockIn(HttpSession httpSession,Model model){
        //获取当前时间,未打卡做准备,也为判断做准备
        Date clock_inDate = new Date();
        SimpleDateFormat putinfmt = new SimpleDateFormat("HHmmss");

        String putinDate = putinfmt.format(clock_inDate);
        int putinDateSeconds = Integer.parseInt(putinDate);
        //获取当前的用户信息
        Employee employee = (Employee) httpSession.getAttribute("employee");
        //获取当前用户的打卡信息(查看用户当前有没有打卡)
        Clock clock = clockService.getCurrentSameDayClock(employee);

        String message = null;
        //如果没有打卡
        if (null ==clock){
            message = "当前用户尚未打上班卡";
            //进行打卡新增操作
            clock = new Clock();
            clock.setClock_inDate(clock_inDate);
            clock.setEmployee(employee);
            //判断是否可以正常打卡,即正常上班
            if (putinDateSeconds<=90000){
                if (clockService.addNewClock(clock)){
                    message = "打卡成功!美好的一天从按时上班开始吧";
                }
            }else if (putinDateSeconds<=120000){
                if (clockService.addNewLateClock(clock)){
                    message = "打卡成功!虽然迟到了,但还是要努力工作";
                }
            }

        } else{
            //进一步判断打卡的内容
            String inDate = clockService.getCurrentSameDayClock(employee).getClock_inDate().toString();
            message = "该用户于"+inDate+"已经打过上班卡";
        }

        model.addAttribute("message",message);


        return "employeeAttence";
    }

    @RequestMapping("/clockOff")
    public String clockOff(Model model,HttpSession httpSession){
        String message = "进入下班打卡程序";

        //获取页面信息
        Employee employee = (Employee) httpSession.getAttribute("employee");
        Date date = new Date();
        System.out.println("下班程序中的当前时间"+date.toString());
        SimpleDateFormat offDate = new SimpleDateFormat("HHmmss");
        String offDateStr = offDate.format(date);
        int offDateInput = Integer.parseInt(offDateStr);

        //进行数据判断
        //判断是否是正常在下班时间下班
        if (offDateInput>=180000) {
            //判断是否打了上班卡
            Clock clock = clockService.getCurrentSameDayClock(employee);
            //如果打了
            if (null!=clock && null!=clock.getClock_inDate()){

                //获取上班打卡时间
                Date inDate = clock.getClock_inDate();
                System.out.println("上班打卡时间"+inDate.toString());
                SimpleDateFormat inDateFmt = new SimpleDateFormat("HHmmss");
                int inDateNum = Integer.parseInt(inDateFmt.format(inDate));
                clock.setClock_offDate(date);
                //如果上班没有迟到
                if (inDateNum<=90000){
                    clock.setClock_state(3);
                    clockService.updateClockOffDate(clock);
                    message = "辛苦工作了一天了,安心休息为了更美好的明天";
                //如果上班迟到了
                }else{
                    //满不满足工作时长
                    long onwork = (date.getTime() - inDate.getTime())/(1000*60*60);
                    //满足工作时长
                    if (onwork>=9){
                        clock.setClock_state(4);
                        clockService.updateClockOffDate(clock);
                        message = "虽然您迟到了,但工作时长达到了,请继续努力";
                    }else if (onwork>=6){
                        clock.setClock_state(5);
                        clockService.updateClockOffDate(clock);
                        message = "您今天迟到了,且工作时长没有达到要求,您可以继续上班然后打卡";
                    }else {
                        clock.setClock_state(6);
                        clockService.updateClockOffDate(clock);
                        message = "您今天不但迟到了,而且将计入旷工";
                    }
                }
            }else{
                //如果上班卡没有打
                if (null==clock){
                    message = "您上午没有打卡,将会被记录为状态7,以旷工计";
                    clock = new Clock();
                    clock.setClock_state(7);
                    clock.setClock_offDate(date);
                    clock.setEmployee(employee);
                    clockService.addNewClockOnlyOff(clock);
                }else{
                    message = "您上午没有打卡,将会被记录为状态7,以旷工计";
                    clock.setClock_offDate(date);
                    clock.setEmployee(employee);
                    clockService.updateClockOffDate(clock);
                }

            }

        }else {
            Clock clock = clockService.getCurrentSameDayClock(employee);
            //早退打卡,判断是否打了上班卡
            //如果打了上班卡
            if (null != clock && null !=clock.getClock_inDate()){
                //获取上午打卡的时间
                Date inDate = clock.getClock_inDate();
                SimpleDateFormat inDateFmt = new SimpleDateFormat("HHmmss");
                int inDateNum = Integer.parseInt(inDateFmt.format(inDate));
                System.out.println("早退上班打卡时间"+inDate.toString());
                clock.setClock_offDate(date);
                //如果上午没有迟到
                if (inDateNum<=90000){
                    //工作时长足够
                    long onwork = (date.getTime() - inDate.getTime())/(1000*60*60);
                    if (onwork>=9){
                        message = "您虽然早退,但您上午没有迟到,且今天的工作时长已经足够,你可以工作到下班后再来打卡,目前处于状态8";
                        clock.setClock_state(8);
                        clockService.updateClockOffDate(clock);
                    }else if (onwork>=6){
                        message = "您虽然早退,但您上午没有迟到,但今天的工作时长没有满足,你可以工作到下班后再来打卡,目前处于状态9";
                        clock.setClock_state(9);
                        clockService.updateClockOffDate(clock);
                    }else{

                        message = "您虽然早退,但您上午没有迟到,但今天的工作时长没有满足(缺时大于3小时),目前处于状态11,这会儿下班将会被判定为旷工";
                        clock.setClock_state(11);
                        clockService.updateClockOffDate(clock);
                    }
                }else{//如果上午迟到了
                    long onwork = (date.getTime() - inDate.getTime())/(1000*60*60);
                    if (onwork>=9){
                        message = "您早退,您上午迟到,但今天的工作时长已经足够,你可以工作到下班后再来打卡,目前处于状态12";
                        clock.setClock_state(12);
                        clockService.updateClockOffDate(clock);
                    }else if (onwork>=6){
                        message = "您虽然早退,您上午迟到,今天的工作时长没有满足,你可以工作到下班后再来打卡,目前处于状态13";
                        clock.setClock_state(13);
                        clockService.updateClockOffDate(clock);
                    }else{
                        message = "您虽然早退,您上午迟到,今天的工作时长远远没有满足,目前处于状态14,这会儿下班将会被判定为旷工";
                        clock.setClock_state(14);
                        clockService.updateClockOffDate(clock);
                    }
                }
            }else{
            // 如果没打卡
                if (null==clock){
                    message = "您上午没有打卡,且早退,将会被记录为状态15,以旷工计";
                    clock = new Clock();
                    clock.setClock_state(7);
                    clock.setClock_offDate(date);
                    clock.setEmployee(employee);
                    clockService.addNewClockOnlyOff(clock);
                }else{
                    message = "您上午没有打卡,将会被记录为状态15,以旷工计";
                    clock.setClock_offDate(date);
                    clock.setEmployee(employee);
                    clockService.updateClockOffDate(clock);
                }
            }
        }
        String message1 = "您于"+clockService.getCurrentSameDayClock(employee).getClock_offDate().toString()+"打卡下班";
        model.addAttribute("message1",message1);
        model.addAttribute("message",message);
        return "employeeAttence";
    }


    @Resource
    private SalaryDefService salaryDefService;
    @RequestMapping("/toEmployeeSalaryDef")
    public String toEmployeeSalaryDef(HttpSession httpSession,Model model){
        Employee employee = (Employee) httpSession.getAttribute("employee");
        SalaryDef salaryDef = salaryDefService.getCurrentByEmployee(employee);
        if (null==salaryDef){
            String message = "请添加您对本次薪资结算的复议";
            model.addAttribute("message",message);
            return "addSalaryDef";
        } else{
            String message = "您本月已提起过薪资结算复议,不能再提起";
            model.addAttribute("message",message);
            return "employeeSalary";
        }



    }

}
