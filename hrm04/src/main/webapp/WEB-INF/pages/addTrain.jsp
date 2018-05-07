<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/5/3
  Time: 16:00
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
    <title>培训信息添加</title>
    <script type="text/javascript">

    </script>
</head>
<body>
    <div>
        <h3>添加培训</h3>
        <form action="addTrain" method="post">
            培训主题:<input type="text" name="train_theme"><br>
            培训详情:<input type="text" name="train_desc"><br>
            培训开始时间:<input type="date" name="train_startDate"><br>
            培训地点:<input type="text" name="train_address"><br>
            选择培训相应部门:
            <select id="depts" name="dept" onchange = "changeDept(this.selectedIndex)">
                <option value="办公室">办公室</option>
                <option value="财务部">财务部</option>
                <option value="工程技术部">工程技术部</option>
                <option value="市场部">市场部</option>
                <option value="法律部">法律部</option>
            </select>
            <div id="employees">

            </div>
            <input type="submit" value="提交">
        </form>
    </div>
</body>
</html>
