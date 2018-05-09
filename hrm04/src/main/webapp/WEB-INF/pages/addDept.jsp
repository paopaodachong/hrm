<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/5/9
  Time: 23:13
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
    <title>部门添加页面</title>
</head>
<body>
<div>
    <h3>部门添加操作</h3>
    <form action="addDept" method="post">
        <input type="text" name="operation" value="4" hidden=hidden>
        部门名字:<input type="text" name="dept_name"><br>
        部门基础薪资:<input type="text" name="dept_baseSalary"><br>
        部门描述:<input type="text" name="dept_desc"><br>
        <input type="submit" value="确认提交"><input type="reset" value="重新填写"><br>
    </form>
</div>
<span>返回<a href="toAdminSuccess">管理员主页面</a></span><br>
</body>
</html>
