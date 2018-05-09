<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/5/10
  Time: 0:06
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
    <title>职位相关操作</title>
</head>
<body>
<div>${message}</div>
<div>
    <h3>员工职位相关操作</h3>
    <table>
        <thead>
        <tr>
            <td>员工职位名</td>
            <td>职位薪水系数</td>
            <td>选择要进行的操作</td>
            <td>提交</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="deptPosition" items="${deptPositions}">
            <form action="adminDeptPosition" method="post">
                <tr>
                    <td>
                            ${deptPosition.deptPosition_name}
                        <input type="text" name="deptPosition_id" value="${deptPosition.deptPosition_id}"
                               hidden="hidden">
                        <input type="text" name="deptPosition_name" value="${deptPosition.deptPosition_name}"
                               hidden="hidden">
                    </td>

                    <td>
                            ${deptPosition.deptPosition_salaryRatio}
                        <input type="text" name="deptPosition_salaryRatio"
                               value="${deptPosition.deptPosition_salaryRatio}" hidden="hidden">
                    </td>
                    <td>
                        <input type="radio" name="operation" value="1">删除
                        <input type="radio" name="operation" value="2">修改
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
<span>
        <form action="adminDeptPosition" method="post">
            <input type="text" name="operation" value="4" hidden>
            <input type="submit" value="添加一个职位">
        </form>
    </span><br>
<span>返回<a href="toAdminSuccess">管理员主页面</a></span>
</body>
</html>
