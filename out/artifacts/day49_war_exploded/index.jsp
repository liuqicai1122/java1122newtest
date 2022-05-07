<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/5/5
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="js/jquery.js"></script>
    <script>
      //页面加载完成时 执行
      $(function () {
         //1 查询所有国家 将查询的结果写到sountrysel中
        $.get("CountryServlet",function (data) {
              //data并不是js对象  是字符串 所以通过eval("(+data+)"):转一下
               var obj= eval("("+data+")");
               var str="";
          for (var i = 0; i <obj.length ; i++) {
              str +=  "<option value= '"+ obj[i].id +"'>"+ obj[i].name+"</option>";
          }
          $("#countrysel").html($("#countrysel").html+str);
        })
        //2.国家选取完了以后 异步加载城市  我们使用值改变事件
        $("#countrysel").change(function () {
          //获得国家的id 选择框中的值
             var countryid= $("#countrysel").val();
              $.getJSON("CityServlet",{"countryId":countryid},function (data) {
                      //data不需要使用eval函数  因为jaon不是字符串类型不需要转换
                if (data.length>0){
                      var str="";
                  for (var i= 0; i<data.length; i++) {
                    str += "<option value='" + data[i].id + "'>" + data[i].name + "</option>";
                  }
                  $("#citysel").html(str);
                }else {
                  $("#citysel").html( "<option value='0'>请选择</option>");
                }
              })
        })

      })
    </script>
  </head>
  <body>
    <select name="countrysel" id="countrysel">
        <option value="0">请选择</option>
    </select>
    <select name="citysel" id="citysel">
      <option value="0">请选择</option>
    </select>


  </body>
</html>
