<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/22
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1px" width="100px" align="center">
        <tr>
            <td >
                id
            </td>
            <td>
                书名
            </td>
            <td>
                作者
            </td>
        </tr>
        <c:forEach items="${requestScope.list}" var="u">

            <tr>
                <td>
                    ${u.id}
                </td>
                <td>
                    ${u.name}
                </td>
                <td>
                    ${u.author}
                </td>
                <td>
                    <a href="preUpdateServlet?id=${u.id}" style="color: aqua">
                        修改
                    </a>
                </td>
                <td>
                    <a href="deleteServlet?id=${u.id}" style="color: aqua">
                        删除
                    </a>
                </td>
            </tr>




        </c:forEach>


    </table>



</body>
</html>
