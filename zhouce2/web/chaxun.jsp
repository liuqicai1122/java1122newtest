<%@ page import="com.offcn.bean.Book" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/15
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

        <table border="1px" width="60%" align="center" cellspacing="0">
            <tr>
                <td>id</td>
                <td>书名</td>
                <td>作者名</td>
            </tr>
                <c:forEach  items="${requestScope.list}" var="u">


                <tr>
                    <td>${u.id}</td>
                   <td> ${u.name}</td>
                    <td>${u.author}</td>
                    <td>
                        <a href="DeleteServlet?id=${u.id}">删除</a>
                    </td>
                    <td>
                        <a href="PreUpdateServlet?id=${u.id}">
                            修改
                        </a>
                    </td>
                </tr>



                </c:forEach>
        </table>


</body>
</html>
