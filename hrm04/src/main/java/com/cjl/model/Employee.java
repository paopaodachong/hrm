package com.cjl.model;

/**
 * 职员实体类(自动生成)
 * Created by 陈佳乐 on 2018/4/23.
 */
public class Employee {
    private Integer employee_id;
    private String employee_name;
    private String employee_pass;
    private Dept dept;
    private DeptPosition deptPosition;
    private EmployeeLevel employeeLevel;
    private Resume resume;


    public Employee() {
    }



    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public DeptPosition getDeptPosition() {
        return deptPosition;
    }

    public void setDeptPosition(DeptPosition deptPosition) {
        this.deptPosition = deptPosition;
    }

    public EmployeeLevel getEmployeeLevel() {
        return employeeLevel;
    }

    public void setEmployeeLevel(EmployeeLevel employeeLevel) {
        this.employeeLevel = employeeLevel;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_pass() {
        return employee_pass;
    }

    public void setEmployee_pass(String employee_pass) {
        this.employee_pass = employee_pass;
    }
}
