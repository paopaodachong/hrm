<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/5/8
  Time: 12:33
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
        <h3>添加绩效奖金</h3>
        <form action="addPerformanceSalary">
            上月绩效奖金:<input type="text" name="performanceSalary_money"/><br>
            绩效奖金说明:<input type="text" name="performanceSalary_desc"/><br>
            <input type="submit" value="确认提交上月奖金">


        </form>
    </div>
</body>
</html>
