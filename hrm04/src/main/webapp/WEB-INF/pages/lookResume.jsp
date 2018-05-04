<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/5/2
  Time: 10:02
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
    <title></title>
</head>
<body>
    <div>
        <h3>个人信息展示</h3>
        <table>
            <tr>
                <td>游客信息</td>
            </tr>
            <tr>
                <td>游客姓名</td>
                <td>${resume.vistor.vistor_name}</td>
            </tr>
        </table>
        <table>
            <tr>
                <td>身份信息</td>
            </tr>
            <tr>
                <td>姓名</td>
                <td>${resume.idCard.idcard_name}</td>
                <td>性别</td>
                <td>${resume.idCard.idcard_gender}</td>
                <td>生日</td>
                <td><fmt:formatDate value="${resume.idCard.idcard_birthday}" type="date" dateStyle="long"/> </td>
            </tr>
            <tr>
                <td>身份证号</td>
                <td>${resume.idCard.idcard_num}</td>
            </tr>
            <tr>
                <td>家庭住址</td>
                <td>${resume.idCard.idcard_address}</td>
            </tr>
        </table>
        <table>
            <tr>
                <td>学历信息</td>
            </tr>
            <tr>
                <td>学校名称</td>
                <td>${resume.education.edu_schoolName}</td>
                <td>学院名称</td>
                <td>${resume.education.edu_majorName}</td>
                <td>学位</td>
                <td>${resume.education.edu_degree}</td>
            </tr>
        </table>
        <table>
            <tr>
                <td>工作经验</td>
            </tr>
                <c:forEach var="jobExp" items="${resume.jobExps}">
                    <tr>
                        <td>工作详情</td>

                    </tr>
                    <tr>
                        <td>
                            ${jobExp.jobExp_position}
                        </td>
                    </tr>
                </c:forEach>
        </table>
    </div>
</body>
</html>
