<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/26
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="BooksServlet?method=update" method="post">
        <table>
            <tr>
                <td align="right">id</td>
                <td>
                    <input type="text" name="id" value="${requestScope.books.id}">
                </td>
            </tr>
            <tr>
                <td align="right">图书序号</td>
                <td>
                    <input type="text" name="booknum" value="${requestScope.books.booknum}">
                </td>
            </tr>
            <tr >
                <td  align="right">书名</td>
                <td>
                    <input type="text" name="bookname" value="${requestScope.books.bookname}">
                </td>
            </tr>
            <tr>
                <td align="right">作者</td>
                <td>
                    <input type="text" name="bookauthor" value="${requestScope.books.bookauthor}">
                </td>
            </tr>
            <tr>
                <td align="right">出版社</td>
                <td>
                    <input type="text" name="bookpublish" value="${requestScope.books.bookpublish}">
                </td>
            </tr>
            <tr>
                <td align="right">日期</td>
                <td>
                    <input type="text" name="bookdate" value="${requestScope.books.bookdate}">
                </td>
            </tr>
            <tr>
                <td align="right">价格</td>
                <td>
                    <input type="text" name="bookprice" value="${requestScope.books.bookprice}">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="修改">
                </td>

            </tr>
        </table>
    </form>

</body>
</html>
