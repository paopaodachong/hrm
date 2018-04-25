<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/4/25
  Time: 20:43
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
    嚯嚯嚯
    <h3><a href="getAll">查看当前部门/部门职位/职工等级设置</a></h3>
</body>
</html>
