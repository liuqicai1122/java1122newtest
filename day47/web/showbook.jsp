<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/26
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1px" cellspacing="0" width="60%" align="center">
        <tr>
            <th>
                id
            </th>
            <th>
                编号
            </th>
            <th>
                书名
            </th>
            <th>
                作者
            </th>
            <th>
                出版社
            </th>
            <th>
                出版日期
            </th>
            <th>
               价格
            </th>
            <th>
               操作
            </th>
        </tr>
        <c:forEach items="${requestScope.blist}" var="u">
            <tr>
                <td>${u.id}</td>
                <td>${u.booknum}</td>
                <td>${u.bookname}</td>
                <td>${u.bookauthor}</td>
                <td>${u.bookpublish}</td>
                <td>${u.bookdate}</td>
                <td>${u.bookprice}</td>
                <td>
                    <a href="BooksServlet?method=preupdate&id=${u.id}">
                    修改
                    </a>
                    <a href="javascript:deletebook(${u.id})">
                        删除
                    </a>
                </td>
            </tr>

        </c:forEach>
        <tr>
            <td colspan="8">
                <%-- 首页 第一页 --%>
                <a href="BooksServlet?method=findAll&currPage=1">
                    首页
                </a>
                    <%--每一页--%>
             <c:forEach begin="1" end="${requestScope.page.totalPage}" var="u">
                <c:choose>
                    <c:when test="${requestScope.page.currentPage==u}">
                        <a href="BooksServlet?method=findAll&currPage=${u}" style="color: red">${u}</a>
                    </c:when>
                    <c:otherwise >
                        <a href="BooksServlet?method=findAll&currPage=${u}" >${u}</a>
                    </c:otherwise>
                </c:choose>
             </c:forEach>

                    <%-- 尾页 总页码--%>
                <a href="BooksServlet?method=findAll&currPage=${requestScope.page.totalPage}">
                    尾页
                </a>
                    <c:if test="${requestScope.page.currentPage!=1}">

                        <a href="BooksServlet?method=findAll&currPage=${requestScope.page.currentPage-1}">
                            上一页
                        </a>
                    </c:if>


                    <c:if test="${requestScope.page.currentPage!=requestScope.page.totalPage}">

                        <a href="BooksServlet?method=findAll&currPage=${requestScope.page.currentPage+1}">
                            下一页
                        </a>
                    </c:if>
            </td>
        </tr>

    </table>
</body>
<script>
        function  deletebook(id) {
           var i= confirm(`你确定要删除吗???`); //false true
            if(i){
                location="BooksServlet?method=del&id="+id;
            }
        }
</script>
</html>
