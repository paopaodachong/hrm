
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/4/25
  Time: 17:20
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
    <title>招聘信息一览</title>
    <style>
        #allRecruit{
            text-align: center;
        }
    </style>
</head>
<body>

<h3>招聘信息一览</h3>
<table id="allRecruit">
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

            <td><fmt:formatDate value="${recruit.recruit_startDate}" type="date" dateStyle="long"/></td>
            <td><fmt:formatDate value="${recruit.recruit_endDate}" type="date" dateStyle="long"/></td>
        </tr>
    </c:forEach>
    </tbody>

</table>


</body>
</html>
