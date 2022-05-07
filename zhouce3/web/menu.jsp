<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/22
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
         <p>
             欢迎用户${sessionScope.user.username}来到页面
         </p>
         <br>
         <a href="selectAllServlet">
             查询所有图书信息
         </a>

        <p align="center">
            <a href="ExitServlet" style="color: red">
                 安全退出
            </a>
        </p>


</body>
</html>
