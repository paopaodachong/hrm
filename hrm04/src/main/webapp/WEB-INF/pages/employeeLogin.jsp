<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/5/2
  Time: 15:05
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
    <div>
        <h3>职员登录界面</h3>
        <span>${message}</span>
        <form action="employeeLogin" method="post">
            登录名:<input type="text" name="employee_name"><br>
            登录密码:<input type="password" name="employee_pass"><br>
            <input type="submit" value="提交">
        </form>
    </div>
</body>
</html>
