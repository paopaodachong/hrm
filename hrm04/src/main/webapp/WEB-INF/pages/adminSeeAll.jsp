<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/4/25
  Time: 21:13
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
    <title>所有信息一览</title>
    <style>
        table{
            text-align: center;
            border: solid 1px;
        }
    </style>
</head>
<body>
    <div>
        <h3>部门信息一览</h3>
        <table>
            <thead>
                <td>部门id</td>
                <td>部门名称</td>
                <td>部门基础薪资</td>
                <td>部门描述</td>
            </thead>
            <tbody>
                <c:forEach var="dept" items="${depts}">
                    <tr>
                        <td><c:out value="${dept.dept_id}"/></td>
                        <td><c:out value="${dept.dept_name}"/></td>
                        <td><c:out value="${dept.dept_baseSalary}"/></td>
                        <td><c:out value="${dept.dept_desc}"/></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <div>
        <h3>职位信息一览</h3>
        <table>
            <thead>
                <td>职位id</td>
                <td>职位名称</td>
                <td>职位薪水系数</td>
            </thead>
            <tbody>
                <c:forEach var="deptPosition" items="${deptPositions}">
                    <tr>
                        <td><c:out value="${deptPosition.deptPosition_id}"/></td>
                        <td><c:out value="${deptPosition.deptPosition_name}"/></td>
                        <td><c:out value="${deptPosition.deptPosition_salaryRatio}"/></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <div>
        <h3>职员等级信息一览</h3>
        <table>
            <thead>
                <td>职员等级id</td>
                <td>职员等级名称</td>
                <td>职员等级薪水系数</td>
            </thead>
            <tbody>
            <c:forEach var="employeeLevel" items="${employeeLevels}">
                <tr>
                    <td><c:out value="${employeeLevel.employeeLevel_id}"/></td>
                    <td><c:out value="${employeeLevel.employeeLevel_name}"/></td>
                    <td><c:out value="${employeeLevel.employeeLevel_salaryRatio}"/></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <div>
        <h3>招聘信息一览</h3>
        <table>
            <thead>
                <td>招聘序列</td>
                <td>招聘名称</td>
                <td>招聘人数</td>
                <td>薪水待遇</td>
                <td>开招时间</td>
                <td>截止日期</td>
            </thead>
            <tbody>
            <c:forEach var="recruit" items="${recruits}">
                <tr>
                    <td><c:out value="${recruit.recruit_id}"/></td>
                    <td><c:out value="${recruit.recruit_name}"/></td>
                    <td><c:out value="${recruit.recruit_num}"/></td>
                    <td><c:out value="${recruit.recruit_salary}"/></td>
                    <td><fmt:formatDate value="${recruit.recruit_startDate}" type="date" dateStyle="long"/> </td>
                    <td><fmt:formatDate value="${recruit.recruit_endDate}" type="date" dateStyle="long"/> </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
