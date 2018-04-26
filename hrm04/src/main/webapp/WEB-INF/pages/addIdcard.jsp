<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/4/26
  Time: 8:11
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
    <title>录入个人信息</title>
</head>
<body>
    <div>
        <h3>请在下方表格中输入您的个人信息</h3>
        <form action="addIdcard" method="post">
            身份证号码:<input type="text" name="idcard_num"><br>
            姓名:<input type="text" name="idcard_name"><br>
            性别:<input type="text" name="idcard_gender"><br>
            生日:<input type="date" name="idcard_birthday"><br>
            家庭住址:<input type="text" name="idcard_address"><br>
            <input type="number" name="vistor_id" readonly="readonly" hidden="hidden" value="${vistor.vistor_id}">
            <input type="submit" value="确认提交"> &nbsp; <input type="reset" value="重新填写">
        </form>
    </div>
</body>
</html>
