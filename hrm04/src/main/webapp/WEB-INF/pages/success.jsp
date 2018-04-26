<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/4/20
  Time: 17:00
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
    <title></title>
</head>
<body>
    哈哈哈
    <h3><a href="getCurRecruit">查看所有招聘</a></h3>
    <h3>查看个人简历</h3>
    <h3><a href="toAddIdcard">添加及修改个人信息</a></h3>
    <h3><a href="toAddEdu">添加及修改学历信息</a></h3>
</body>
</html>
