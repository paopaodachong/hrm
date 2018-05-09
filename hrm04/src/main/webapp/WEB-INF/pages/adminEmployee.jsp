<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/5/10
  Time: 3:25
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
    <title>员工操作页面</title>
</head>
<body>
    <div>
        <h3>员工选择查看</h3>
        <h4>根据部门选择查看</h4>
        <form action="adminEmployee" method="post">
            <select name="dept_name">
                <c:forEach var="dept" items="${depts}">
                    <option>${dept.dept_name}</option>
                </c:forEach>
            </select>

            <input type="text" name="operation" value="1" hidden="hidden">

            <input type="submit" value="确认查询">
        </form>
    </div>
    <div>
        <c:forEach var="employee" items="${deptEmployee}">

            <form action="adminEmployee" method="post">
                <table>
                    <tr>
                        <td>员工姓名</td>
                        <td>员工所在部门</td>
                        <td>员工职位</td>
                        <td>员工职级</td>
                        <td>提起对员工进行更改</td>
                    </tr>
                    <tr>
                        <input type="text" name="operation" value="2" hidden="hidden">
                        <input type="text" name="employee_id" value="${employee.employee_id}" hidden="hidden">
                        <td>${employee.employee_name}</td>
                        <td>${employee.dept.dept_name}</td>
                        <td>${employee.deptPosition.deptPosition_name}</td>
                        <td>${employee.employeeLevel.employeeLevel_name}</td>
                        <td><input type="submit" value="进行操作修改"></td>
                    </tr>
                </table>
            </form>
        </c:forEach>
    </div>
</body>
</html>
