<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/5/9
  Time: 10:49
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
    <title>处理带处理薪资复议</title>
</head>
<body>
    <div>${message}</div>
    <h3>待处理薪资复议</h3>
    <table>
        <thead>
            <tr>
                <td>薪资复议原因</td>
                <td>薪资复议员工</td>
                <td>薪资复议金额</td>
                <td>薪资复议操作</td>
                <td>薪资复议备注(必填)</td>
                <td>确认处理</td>
            </tr>
        </thead>
        <tbody>
    <c:forEach var="salaryDef" items="${salaryDefs}">
        <form action="resolveSalaryDef" method="post">
            <tr>
                <td>
                    <c:out value="${salaryDef.salaryDef_desc}"/>
                    <input type="text" name="salaryDef_id" value="${salaryDef.salaryDef_id}" hidden="hidden">
                    <input type="text" name="reward_desc" value="${salaryDef.salaryDef_desc}" hidden ="hidden">
                </td>
                <td>
                    <c:out value="${salaryDef.employee.employee_name}"/>
                    <input type="text" name="employee_id" value="${salaryDef.employee.employee_id}" hidden="hidden">
                </td>
                <td>
                    <c:out value="${salaryDef.salaryDef_money}"/>
                    <input type="text" name="reward_money" value="${salaryDef.salaryDef_money}" hidden="hidden">
                </td>
                <td>
                    <input type="radio" name="resolving" value="1">同意
                    <input type="radio" name="resolving" value="2">不同意
                </td>
                <td>
                    <input type="text" name="reward_namex">
                    <input type="text" name="reward_name" value="薪资复议同意" hidden="hidden">
                </td>
                <td>
                    <input type="submit" value="确认处理">
                </td>
            </tr>
        </form>
    </c:forEach>
        </tbody>
    </table>
    <span>返回<a href="toAdminSuccess">管理员主页面</a></span>
</body>

</html>
