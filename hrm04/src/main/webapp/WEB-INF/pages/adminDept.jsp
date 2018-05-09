<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/5/9
  Time: 13:54
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
        #message{
            color: brown;
        }
    </style>
</head>
<body>
<div>
    <h3>部门信息操作界面</h3>
    <div id="message">${message}</div>
    <table>
        <thead>
        <td>部门id</td>
        <td>部门名称</td>
        <td>部门基础薪资</td>
        <td>部门描述</td>
        <td>可进行操作</td>
        <td>提交</td>
        </thead>
        <tbody>
        <c:forEach var="dept" items="${depts}">
            <form action="adminDept" method="post">
            <tr>
                <td>
                    <c:out value="${dept.dept_id}"/>
                    <input type="text" value="${dept.dept_id}" name="dept_id" hidden="hidden">
                </td>

                <td>
                    <c:out value="${dept.dept_name}"/>
                    <input type="text" value="${dept.dept_name}" name="dept_name" hidden="hidden">
                </td>
                <td>
                    <c:out value="${dept.dept_baseSalary}"/>
                    <input type="text" value="${dept.dept_baseSalary}" name="dept_baseSalary" hidden="hidden">
                </td>
                <td>
                    <c:out value="${dept.dept_desc}"/>
                    <input type="text" value="${dept.dept_desc}" name="dept_desc" hidden="hidden">
                </td>
                <td>
                    <input type="radio" value="1" name="operation">删除
                    <input type="radio" value="2" name="operation" checked="checked">修改
                </td>
                <td>
                    <input type="submit" value="提交操作">
                </td>
            </tr>
            </form>
        </c:forEach>
        </tbody>
    </table>
</div>
<span><a href="toAddDept">新增一个部门</a></span><br>
<span>返回<a href="toAdminSuccess">管理员主页面</a></span>
</body>
</html>
