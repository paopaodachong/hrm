<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/12 0012
  Time: 8:57
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
    <title>人事管理系统首页</title>
    <style>
        body{
            background-color:bisque;
        }
        #vistorBody{
            width: 400px;
            margin: 0px auto;
            text-align: center;
            background-color: aquamarine;
        }
    </style>
</head>
<body>
<div id="vistorBody">
    <legend>欢迎来到人事管理系统</legend>
    <span>${message}</span><br>
    <form action="vistorLogin" method="post">
        账号：<input name="vistor_name"><br>
        密码：<input name="vistor_pass"><br>
        <input type="submit" value="登录">尚未注册账号,立即<a href="toRegister">注册</a>
    </form>

</div>
<h3><a href="toAdminLogin">我是管理员</a></h3>
</body>
</html>
