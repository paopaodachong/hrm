<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/5/8
  Time: 15:11
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
    <title>全部员工的薪水情况</title>
</head>
<body>
    <div>${salaries}</div>
    <span>返回<a href="toAdminSuccess">主页面</a> </span>
</body>
</html>
