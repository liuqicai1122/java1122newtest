<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/25
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="BooksServlet?method=add" method="post">
              <table align="center" border="2px" width="400px" >
                  <tr>
                      <td align="right">
                        请输入书序号
                      </td>
                      <td>
                          <input type="text" name="booknum" placeholder="请输入书序号">
                      </td>
                  </tr>
                  <tr>
                      <td align="right">
                          请输入书名
                      </td>
                      <td>
                          <input type="text" name="bookname" placeholder="请输入书名">
                      </td>
                  </tr>
                  <tr>
                      <td align="right">
                          请输入作者
                      </td>
                      <td>
                          <input type="text" name="bookauthor" placeholder="请输入作者">
                      </td>
                  </tr>
                  <tr>
                      <td align="right">
                          请输入出版社
                      </td>
                      <td>
                          <input type="text" name="bookpublish" placeholder="请输入出版社">
                      </td>
                  </tr>
                  <tr>
                      <td align="right">
                          请输入书的日期
                      </td>
                      <td>
                          <input type="text" name="bookdate" placeholder="请输入书的日期">
                      </td>
                  </tr>
                  <tr>
                      <td align="right">
                          请输入书的价格
                      </td>
                      <td>
                          <input type="text" name="bookprice" placeholder="请输入书的价格">
                      </td>
                  </tr>
                  <tr align="center">
                      <td colspan="2">
                        <input type="submit" value="添加">
                      </td>

                  </tr>
              </table>
    </form>

</body>
</html>
