<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/5/10
  Time: 4:23
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
    <title>员工修改操作</title>
</head>
<body>
    <div>
        <h3>员工${changeEmployee.employee_name}信息调整</h3>
        <form action="adminEmployee" method="post">
            <table>
                <tr>
                    <td>
                        员工调整项目
                    </td>
                    <td>
                        员工调整前
                    </td>
                    <td>
                        员工调整后
                    </td>
                </tr>
                <tr>
                    <td>员工所在部门</td>
                    <td>${changeEmployee.dept.dept_name}</td>
                    <td>
                        <select name="dept_name">
                            <c:forEach var="dept" items="${depts}">
                                <option>${dept.dept_name}</option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>员工职位</td>
                    <td>${changeEmployee.deptPosition.deptPosition_name}</td>
                    <td>
                        <select name="deptPosition_name">
                            <c:forEach var="deptPosition" items="${deptPositions}">
                                <option>${deptPosition.deptPosition_name}</option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>员工职级</td>
                    <td>${changeEmployee.employeeLevel.employeeLevel_name}</td>
                    <td>
                        <select name="employeeLevel_name">
                            <c:forEach var="employeeLevel" items="${employeeLevels}">
                                <option>${employeeLevel.employeeLevel_name}</option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
            </table>
            <input type="text" name="employee_id" value="${changeEmployee.employee_id}" hidden="hidden">
            <input type="text" name="employee_name" value="${changeEmployee.employee_name}" hidden="hidden">
            <input type="text" name="operation" value="3" hidden="hidden">
            <input type="submit" value="确认修改">
        </form>
    </div>
</body>
</html>
