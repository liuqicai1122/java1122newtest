<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/15
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
            <title>Title</title>
</head>
<body>
          <form action="AddBookServlet" method="post">
              <input type="text" name="name" id="username" placeholder="请输入书名">
              <br>
              <input type="text" name="author" id="uu" placeholder="请输入作者">
              <input type="submit" value="添加">
          </form>

</body>
</html>
