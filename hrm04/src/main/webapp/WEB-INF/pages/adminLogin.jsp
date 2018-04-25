<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/4/25
  Time: 20:19
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
    <title>管理员登录界面</title>
</head>
<body>
    <div>
        <form action="adminLogin" method="post">
            账号:<input type="text" name="admin_name"><br>
            密码:<input type="password" name="admin_pass"><br>
            <input type="submit" value="登录"> &nbsp; <input type="reset" value="重置">
        </form>
    </div>
</body>
</html>
