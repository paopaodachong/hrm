<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/5/3
  Time: 9:46
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
    <title>员工奖惩</title>
</head>
<body>
    <div>${message}</div>
    <h3>${sessionScope.employee.employee_name}员工奖惩明细</h3>
    <table>
        <thead>
            <tr>
                <td>奖惩时间</td>
                <td>奖惩事由</td>
                <td>奖惩描述</td>
                <td>奖惩金额</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="empReward" items="${rewards}">
                <tr>
                    <td><fmt:formatDate value="${empReward.reward_date}" type="date" dateStyle="long"/></td>
                    <td><c:out value="${empReward.reward_name}"/></td>
                    <td><c:out value="${empReward.reward_desc}"/></td>
                    <td><c:out value="${empReward.reward_money}"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <span>返回<a href="toEmployeeSuccess">个人主页面</a></span>
</body>
</html>
