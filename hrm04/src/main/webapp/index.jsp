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
    <form action="vistorLogin" method="post">
        账号：<input name="name"><br>
        密码：<input name="pass"><br>
        <input type="submit" value="登录">尚未注册账号,立即<a href="pages/success">注册</a>
    </form>

</div>
</body>
</html>
