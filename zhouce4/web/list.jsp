<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/29
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
          <table width="400px" align="center" border="1px">
              <tr>
                  <td>id</td>
                  <td>姓名</td>
                  <td>年龄</td>
                  <td>计算机成绩</td>
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
                          ${u.age}
                      </td>
                      <td>
                          ${u.score}
                      </td>
                      <td>
                          <a href="StudentServlet?method=delete&id=${u.id}">
                              删除
                          </a>
                      </td>
                      <td>
                          <a href="StudentServlet?method=preupdate&id=${u.id}">
                              修改
                          </a>
                      </td>
                  </tr>

              </c:forEach>
         <tr>
             <td colspan="6">
                 <a href="StudentServlet?method=selectAll&currentPage=1">首页</a>
                 <a href="StudentServlet?method=selectAll&currentPage=${requestScope.page.totalPage}">尾页</a>
                 <c:forEach begin="1" end="${requestScope.page.totalPage}" var="u">
                     <c:choose>
                         <c:when test="${requestScope.page.currentPage==u}">
                             <a href="StudentServlet?method=selectAll&currentPage=${u}" style="color: red">${u}</a>
                         </c:when>
                            <c:otherwise>
                                <a href="StudentServlet?method=selectAll&currentPage=${u}">${u}</a>
                            </c:otherwise>
                     </c:choose>


                 </c:forEach>
                 <c:if test="${requestScope.page.currentPage!=1}">
                     <a href="StudentServlet?method=selectAll&currentPage=${requestScope.page.currentPage-1}">
                         上一页
                     </a>
                 </c:if>
                <c:if test="${requestScope.page.currentPage!=requestScope.page.totalPage}">
                    <a href="StudentServlet?method=selectAll&currentPage=${requestScope.page.currentPage+1}">
                        下一页
                    </a>
                </c:if>


             </td>
         </tr>

          </table>
</body>
</html>
