<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/5/3
  Time: 9:44
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
    <title>员工培训页面</title>
</head>
<body>
    <h3>全部培训</h3>
    <c:forEach var="trainDetail" items="${trainDetails}">
        培训主题:<c:out value="${trainDetail.train.train_theme}"/><br>
        培训时间:<c:out value="${trainDetail.train.train_startDate}"/><br>
        培训地点:<c:out value="${trainDetail.train.train_address}"/><br>
        培训描述:<c:out value="${trainDetail.train.train_desc}"/><br>
    </c:forEach>
    <span>返回<a href="toEmployeeSuccess">个人主页面</a></span>
</body>



</html>
