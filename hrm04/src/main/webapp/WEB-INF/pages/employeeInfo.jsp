<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/5/3
  Time: 9:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>员工个人信息展示</title>
</head>
<body>
    <div id="employeeInfo">
        <div>
            <h3>账号相关</h3>
            <table>
                <thead>
                    <tr>
                        <td>账号信息</td>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>账号id</td>
                        <td>账号登录名</td>
                    </tr>
                    <tr>
                        <td>${loginEmployee.employee_id}</td>
                        <td>${loginEmployee.employee_name}</td>
                    </tr>
                </tbody>
            </table>
        </div>
        <div>
            <h3>个人介绍</h3>
            <table>
                <thead>
                <tr>
                    <td>身份信息</td>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>身份证id</td>
                    <td>姓名</td>
                    <td>性别</td>
                </tr>
                <tr>
                    <td>${loginEmployee.resume.idCard.idcard_num}</td>
                    <td>${loginEmployee.resume.idCard.idcard_name}</td>
                    <td>${loginEmployee.resume.idCard.idcard_gender}</td>
                </tr>
                <tr>
                    <td>家庭住址</td>
                </tr>
                <tr>
                    <td>${loginEmployee.resume.idCard.idcard_address}</td>
                </tr>
                </tbody>
            </table>

            <table>
                <thead>
                <tr>
                    <td>教育信息</td>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>毕业学校</td>
                    <td>专业</td>
                    <td>学历学位</td>
                </tr>
                <tr>
                    <td>${loginEmployee.resume.education.edu_schoolName}</td>
                    <td>${loginEmployee.resume.education.edu_majorName}</td>
                    <td>${loginEmployee.resume.education.edu_level}</td>
                </tr>
                <tr>
                    <td>入学时间</td>
                </tr>
                <tr>
                    <td>
                        <fmt:formatDate value="${loginEmployee.resume.education.edu_startTime}" type="date" dateStyle="long"/>
                    </td>
                </tr>
                </tbody>
            </table>

            <table>
                <thead>
                <tr>
                    <td>工作经历</td>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>开始时间</td>
                    <td>结束时间</td>
                    <td>任职岗位</td>
                    <td>工作描述</td>
                    <td>薪水</td>
                </tr>
                <c:forEach var="jobExp" items="${loginEmployee.resume.jobExps}">

                    <tr>
                        <td>
                                <fmt:formatDate value="${jobExp.jobExp_startDate}" type="date" dateStyle="long"/>
                        </td>
                        <td>
                                <fmt:formatDate value="${jobExp.jobExp_endDate}" type="date" dateStyle="long"/>
                        </td>
                        <td>${jobExp.jobExp_position}</td>
                        <td>${jobExp.jobExp_desc}</td>
                        <td>${jobExp.jobExp_salary}</td>
                    </tr>
                </c:forEach>

                </tbody>
            </table>
        </div>
        <div>
            <h3>职位信息</h3>
            <table>
                <thead>
                <tr>
                    <td>职位相关</td>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>所在部门</td>
                    <td>部门基础薪资</td>
                    <td>就职岗位</td>
                    <td>岗位薪资系数</td>
                    <td>在职级别</td>
                    <td>级别薪资系数</td>
                </tr>
                <tr>
                    <td>${loginEmployee.dept.dept_name}</td>
                    <td>${loginEmployee.dept.dept_baseSalary}</td>
                    <td>${loginEmployee.deptPosition.deptPosition_name}</td>
                    <td>${loginEmployee.deptPosition.deptPosition_salaryRatio}</td>
                    <td>${loginEmployee.employeeLevel.employeeLevel_name}</td>
                    <td>${loginEmployee.employeeLevel.employeeLevel_salaryRatio}</td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
    <h3>返回<a href="toEmployeeSuccess">个人主页面</a></h3>
</body>
</html>
