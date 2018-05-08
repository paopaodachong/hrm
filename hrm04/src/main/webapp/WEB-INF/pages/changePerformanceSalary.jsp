<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/5/8
  Time: 13:35
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
    <title>绩效奖金查看和修改页面</title>
</head>
<body>
<div>${message}</div>
<div>
    <c:forEach var="performanceSalary" items="${performanceSalaries}">
        <h3>绩效奖金查看和修改</h3>
        <form method="post" action="changePerformanceSalary">
            <input type="text" value="${performanceSalary.performanceSalary_id}" name="performanceSalary_id"
                   hidden="hidden">
            原定上月绩效奖金为:<c:out value="${performanceSalary.performanceSalary_money}"/><br>
            您想要再修改的上月绩效奖金为:<input type="text" name="performanceSalary_money"><br>
            原定上月绩效奖金描述为:<br>
            <c:out value="${performanceSalary.performanceSalary_desc}"/><br>
            您想要再修改的上月绩效奖金描述为:<br>
            <input type="text" name="performanceSalary_desc"><br>
            <input type="submit" value="确认修改">

        </form>
    </c:forEach>

</div>
<span>返回<a href="toAdminSuccess">管理员主页面</a></span>
</body>
</html>
