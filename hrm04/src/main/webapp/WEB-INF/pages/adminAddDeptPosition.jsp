<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/5/10
  Time: 2:58
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
    <title>职位添加页面</title>
</head>
<body>
    <h3>请填入您要添加的职位相关信息</h3>
    <div>
        <form >
            请输入您要添加的职位名:<input type="text" name="deptPosition_name"><br>
            请输入您要添加的职位薪水系数:<input type="text" name="deptPosition_salaryRatio"><br>
            <input type="text" name="operation" value="5" hidden="hidden">
            <input type="submit" value="确认提交">
        </form>
    </div>
    <br>
    <span>返回<a href="toAdminSuccess">管理员主页面</a></span>
</body>
</html>
