<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/5/9
  Time: 9:45
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
    <div>${message}</div>
    <div>
        <form action="addSalaryDef" method="post">
            您预想的薪资差额(整数为少发,负数为多发):<br>
            <input type="text" name="salaryDef_money"><br>
            您提起薪资复议的理由:<br>
            <input type="text" name="salaryDef_desc"><br>
            <input type="submit" value="确认提起"><br>
        </form>
    </div>
</body>
</html>
