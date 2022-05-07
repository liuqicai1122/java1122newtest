<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/22
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <form method="post" action="updateServlet">
           <table>
               <tr>
                   <td colspan="2">
                       <input type="hidden" name="id" value="${requestScope.book.id}">
                   </td>
               </tr>
               <tr>
                   <td align="center" style="color: coral">
                       书名
                   </td>
                   <td>
                       <input type="text" name="name" id="name" value="${requestScope.book.name}">
                   </td>
               </tr>
               <tr>
                   <td align="center" style="color: coral">
                       作者
                   </td>
                   <td>
                       <input type="text" name="author" id="author" value="${requestScope.book.author}">
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
