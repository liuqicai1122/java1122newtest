<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/29
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <form action="StudentServlet?method=add" method="post">
            <table>
                <tr>
                    <td>姓名</td>
                    <td>
                        <input type="text" name="name"  id="name" placeholder="请输入姓名">
                    </td>
                </tr>
                <tr>
                    <td>年龄</td>
                    <td>
                        <input type="text" name="age" id="age" placeholder="请输入年龄">
                    </td>
                </tr>
                <tr>
                    <td>计算机成绩</td>
                    <td>
                        <input type="text" name="score" id="score" placeholder="请输入计算机成绩">
                    </td>
                </tr>
                <tr>

                    <td >
                        <input type="submit" value="注册">
                    </td>
                </tr>




            </table>
        </form>


</body>
</html>
