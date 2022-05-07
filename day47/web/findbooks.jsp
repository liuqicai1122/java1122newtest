<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/26
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <form action="BooksServlet?method=findbookbycondition" method="post">
            <table border="1px" cellspacing="0" width="500px" >
              <tr>
                  <td>图书序号</td>
                  <td>
                      <input type="text" name="booknum" id="booknum" placeholder="请输入查询的图书序号">
                  </td>
              </tr>
                <tr>
                    <td>书名</td>
                    <td>
                        <input type="text" name="bookname" id="bookname" placeholder="请输入查询的书名">
                    </td>
                </tr>
                <tr>
                    <td>作者</td>
                    <td>
                        <input type="text" name="bookauthor" id="bookauthor" placeholder="请输入查询作者">
                    </td>
                </tr>
                <tr>
                    <td>图书出版社</td>
                    <td>
                        <input type="text" name="bookpublish" id="" placeholder="请输入查询的图书序号">
                    </td>
                </tr>
                <tr>
                    <td>日期</td>
                    <td>
                        <input type="text" name="bookdate" id="bookdate" placeholder="请输入查询的日期">
                    </td>
                </tr>
                <tr>
                    <td>价格</td>
                    <td>
                        <input type="text" name="bookprice" id="bookprice" placeholder="请输入查询的价格">
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="查找">
                    </td>
                </tr>
            </table>
        </form>
</body>
</html>
