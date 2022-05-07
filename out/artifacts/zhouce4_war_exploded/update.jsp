<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/29
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <form action="StudentServlet?method=update" method="post">
            <table>
                    <tr>
                        <td colspan="2">
                            <input type="hidden" name="id" value="${requestScope.student.id}">
                        </td>
                    </tr>
                <tr>
                    <td>姓名</td>
                    <td>
                        <input type="text" name="name" value="${requestScope.student.name}">
                    </td>
                </tr>
                <tr>
                    <td>年龄</td>
                    <td>
                        <input type="text" name="age" value="${requestScope.student.age}">
                    </td>
                </tr>
                <tr>
                    <td>计算机成绩</td>
                    <td>
                        <input type="text" name="score" value="${requestScope.student.score}">
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
