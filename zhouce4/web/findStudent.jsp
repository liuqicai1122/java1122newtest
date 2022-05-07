<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/29
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <form action="StudentServlet?method=findByCondition" method="post">
            <table>
                <tr>
                    <td>
                        请输入查找学生的名字
                    </td>
                    <td>
                        <input type="text" name="name" id="name">
                    </td>
                </tr>
                <tr>
                    <td>
                        请输入查找的年龄
                    </td>
                    <td>
                        <input type="text" name="age" id="age">
                    </td>
                </tr>
                <tr>
                    <td>
                        请输入查找的计算机成绩
                    </td>
                    <td>
                        <input type="text" name="score" id="score">
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="查询">
                    </td>
                </tr>
            </table>
        </form>
</body>
</html>
