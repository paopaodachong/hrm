<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/5/10
  Time: 1:06
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
    <title>职位信息修改页面</title>
</head>
<body>
    <div>
        <form action="adminDeptPosition" method="post">
        <table>
            <tr>
                <td>
                    修改前的职位名称
                </td>
                <td>
                    修改后的职位名称
                </td>
            </tr>
            <tr>
                <td>${deptPosition.deptPosition_name}</td>
                <td><input type="text" name="deptPosition_name" placeholder="${deptPosition.deptPosition_name}"/></td>

            </tr>
            <tr>
                <td>修改前的职位薪水系数</td>
                <td>修改后的职位薪水系数</td>
            </tr>
            <tr>
                <td>${deptPosition.deptPosition_salaryRatio}</td>
                <td><input type="text" name="deptPosition_salaryRatio"></td>
            </tr>
        </table>
            <input type="text" name="deptPosition_id" value="${deptPosition.deptPosition_id}" hidden="hidden">
            <input type="text" name="operation" value="3" hidden="hidden">
            <input type="submit" value="确认提交">
        </form>
    </div>

    <span>返回<a href="toAdminSuccess">管理员主页面</a></span>
</body>
</html>
