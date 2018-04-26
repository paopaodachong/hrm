<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/4/24
  Time: 21:36
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
    <title>游客注册</title>
    <style>
        #registerbody{
            text-align: center;
            
        }
    </style>
</head>
<body>
<div id="registerbody">
    <form action="vistorRegister" method="post">
        <span>欢迎来到海同科技有限公司</span><br>
        <span>${message}</span>
        <span>请输入以下信息完成注册</span><br>
        账号:<input type="text" name="vistor_name"><br>
        密码:<input type="password" name="vistor_pass"><br>
        <input type="submit" value="提交">&nbsp<input type="reset" value="重新填写">
    </form>
</div>
</body>
</html>
