<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/5/9
  Time: 14:41
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
    <style>
        td{
            width: 400px;
        }
    </style>
</head>
<body>
    <div>
        <form action="adminDept" method="post">
            <input type="text" name="dept_id" value="${dept.dept_id}" hidden="hidden">
            <input type="text" name="operation" value="3" hidden="hidden">
        <table>
            <tr>
                <td>原部门名称</td><td>修改后部门名称</td>
            </tr>
            <tr>
                <td>${dept.dept_name}</td><td><input type="text" name="dept_name" placeholder="${dept.dept_name}"></td>
            </tr>
            <tr>
                <td>原部门基础薪资</td><td>修改后基础薪资</td>
            </tr>
            <tr>
                <td>${dept.dept_baseSalary}</td><td><input type="text" name="dept_baseSalary" placeholder="${dept.dept_baseSalary}"></td>
            </tr>
            <tr>
                <td>原部门描述</td><td>修改后的部门描述</td>
            </tr>
            <tr>
                <td>${dept.dept_desc}</td><td><input type="text" name="dept_desc" placeholder="${dept.dept_desc}"></td>
            </tr>
            <tr>
                <td><input type="submit" value="确认修改"></td>
            </tr>
        </table>
        </form>
    </div>
</body>
<span>返回<a href="toAdminSuccess">管理员主页面</a></span>
</html>
