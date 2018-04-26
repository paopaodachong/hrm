<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/4/26
  Time: 16:31
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
    <title>学历信息增加</title>
</head>
<body>
    <div>
        <form action="addEdu" method="post">
            <h3>请输入您的最高学历信息</h3>
            学校名称:<input type="text" name="edu_schoolName"><br>
            专业名称:<input type="text" name="edu_majorName"><br>
            入学日期:<input type="date" name="edu_startTime"><br>
            学习学制:<input type="text" name="edu_type"><br>
            学习学历:<input type="text" name="edu_level"><br>
            学习学位:<input type="text" name="edu_degree"><br>
            <input type="submit" value="确认提交"> &nbsp;<input type="reset" value="重新填写">
        </form>
    </div>

</body>
</html>
