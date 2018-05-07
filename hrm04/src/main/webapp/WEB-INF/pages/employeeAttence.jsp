<%--
  Created by IntelliJ IDEA.
  User: 陈佳乐
  Date: 2018/5/3
  Time: 9:47
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
    <title>员工考勤</title>
    <style>
        body{
            text-align: center;
        }
        div{
            float: none;
        }
    </style>
    <script type="text/javascript">
        setInterval("timeStr = new Date().toLocaleString();inTimer.innerText=timeStr;",1000)
        setInterval("timeStr1=new Date().toLocaleString();offTimer.innerText=timeStr1;",1000)
    </script>
</head>
<body>
    <div>${message}</div>
    <div id="clockIn">
        <div id="inTimer" style="font:11px Tahoma;height:10px"></div><br>
        <span>上班时间09:00</span><br>
        <div id="inTimerInput">
            <form action="clockIn" method="post">

                <input type="submit" value="上班打卡">
            </form>
        </div>

    </div>
    <div>${message1}</div>
    <div id="clockOff">
        <div id="offTimer" style="font:11px Tahoma;height:10px"></div><br>
        <div id="offTimerInput">
            <form method="post" action="clockOff">

                <input type="submit" value="下班打卡">
            </form>

        </div>

    </div>
</body>
</html>
