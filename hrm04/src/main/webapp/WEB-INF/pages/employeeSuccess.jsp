<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/5/2
  Time: 15:54
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
    <title>员工登陆成功展示主页面</title>
</head>
<body>
    <h3><a href="toEmployeeInfo">个人信息</a></h3>
    <h3><a href="toEmployeeList">公司通讯录</a></h3>
    <h3><a href="toEmployeeTrain">培训</a></h3>
    <h3><a href="toEmployeeReward">奖惩信息</a></h3>
    <h3><a href="toEmployeeAttence">考勤打卡</a></h3>
    <h3><a href="toEmployeeSalary">薪资结算</a></h3>
</body>
</html>
