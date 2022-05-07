<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/20
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="UpdateUserServlet" method="post">
        <table border="1px"width="400px"align="center" >
            <td>
                <tr>
                    <input type="hidden" name="id" value="${requestScope.book.id}">
                </tr>
            </td>
        <td>
            <tr align="right">
                书名
            </tr>
            <tr>
                <input type="txet" name="name" value="${requestScope.book.name}">
            </tr>
        </td>
            <td>
                <tr align="right">
                    作者名
                </tr>
                <tr>
                    <input type="txet" name="author" value="${requestScope.book.author}">
                </tr>
            </td>
            <tr>
                <td>
                    <input type="submit" value="更新">
                </td>
            </tr>
        </table>
    </form>



</body>
</html>
