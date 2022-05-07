<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/22
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="loginchecked.jsp"%>
<html>
  <head>
    <title>$Title$</title>
    <div>
        <p align="center">欢迎${sessionScope.user.username}登录网站</p>
        <p align="right">
          <a href="TuiChuServlet">
                安全退出
          </a>
        </p>

    </div>

  </head>
  <body>
  $END$
  </body>
</html>
