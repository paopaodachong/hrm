<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/5/3
  Time: 9:48
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
    <title>员工薪资</title>
</head>
<body>
    <div>${message}</div>
    <div>
        <table>
            <thead>
                <tr>
                    <td>基本工资</td>
                    <td>绩效工资</td>
                    <td>加班费用</td>
                    <td>上月正常上班天数</td>
                    <td>上月总上班天数</td>
                    <td>奖惩费用</td>
                    <td>社保费用</td>
                    <td>上月结算工资</td>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>${baseSalary}</td>
                    <td>${pfsSalary}</td>
                    <td>${moreWorkSalary}</td>
                    <td>${normalDays}</td>
                    <td>${onworkDays}</td>
                    <td>${rewardsSalary}</td>
                    <td>${securitySalary}</td>
                    <td>${salary_money}</td>
                </tr>
            </tbody>
        </table>
    </div>
    <span>我对薪资有疑问,提起<a href="toEmployeeSalaryDef">复议</a></span><br>
    <span>返回<a href="toEmployeeSuccess">个人主页面</a></span>
</body>
</html>
