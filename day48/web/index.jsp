<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/27
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <input type="button" value="异步请求" onclick="fun()">
  <input type="button" value="异步请求get" onclick="fun1()">
  <input type="button" value="异步请求post" onclick="fun2()">
  <input type="button" value="异步提交getJSON()" onclick="fun3()">
  </body>
  <script src="js/jquery.js"></script>
 <script>
      function fun() {
            $.ajax({
              //请求资源路径
              url:"AjaxServlet",
              //请求参数
              data:"username=zhangsan",
              //请求方式
              type:"post",
              //数据形式text
              dataType:"text",
              //请求后执行方法
              //data是一个形参 服务器端返回数据
              success:function (data) {
                alert(data)
              },
              //请求失败后执行方法
              error:function () {
                alert("失败");
              }
            });
      }
      function fun1() {
          //$.get(url,data,success,dataType)
          $.get("Ajax01Servlet","username=lao8",function (data) {
                    alert(data);
          },"text")
      }
      function  fun2() {
            //$.post(url, [data] , [success] , [returnType])
          //$.post(url,data,success,dataType)
          $.post("Ajax02Servlet","username=wangwu",function (data){
              alert(data);
          },"text");
      }
      function fun3(){
            $.getJSON(
               // $.getJSON(
              //  ”url”,
          //{json数据},
          //function(obj){},
      //);
                //请求资源路径
                "Ajax03Servlet",
                //成功后 回调函数
                function (data) {
                    alert(data.username);
                    alert(data.age);
                }
            )
      }
 </script>
</html>
