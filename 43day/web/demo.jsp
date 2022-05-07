<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/18
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        ${requestScope.name}
        <br>
        ${requestScope.user.age}
        ${requestScope.user.id}
        <br>
        ${requestScope.list[0].id}
        ${requestScope.list[2].name}
        ${requestScope.list[1].name}
        <br>
        <%--做运算--%>
        ${5+3}
        ${3.1+2}
        ${4*4}
        ${5>2}
        ${5==3}
        <br>
        <--%逻辑运算符 == !=  < >  <=   >= %-->
        <--%EL常用的操作web对象
        pageScope 指定从pageContext作用域取值()
        requestScope 指定从request作用域取值
        sessionScope 指定从session作用域取值
        applicationScope 指定从ServletContext作用域取值
        param 相当于从request.getParameter()
        %-->
        ${requestScope.list[0].id==0 and requestScope.list[2].age==1}
        ${not(requestScope.list[0].age == 18)}

</body>
</html>
