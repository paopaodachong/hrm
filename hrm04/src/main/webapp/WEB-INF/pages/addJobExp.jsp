<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/4/26
  Time: 20:47
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
    <title>添加工作经验</title>
</head>
<body>
    <div>
        <h3>请在下方表格中输入您的工作经验的相关信息</h3>
        <form action="addJobExp" method="post">
            开始日期:<input type="date" name="jobExp_startDate"><br>
            结束日期:<input type="date" name="jobExp_endDate"><br>
            担任职务:<input type="text" name="jobExp_position"><br>
            工作描述:<input type="text" name="jobExp_desc"><br>
            工作薪资:<input type="number" name="jobExp_salary"><br>
            <input type="submit" value="确认提交"> &nbsp; <input type="reset" value="重新填写">
        </form>
    </div>
</body>
</html>
