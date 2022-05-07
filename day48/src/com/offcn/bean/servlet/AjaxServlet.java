package com.offcn.bean.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.offcn.bean.Page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/AjaxServlet")
public class AjaxServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String parameter = request.getParameter("username");
        response.getWriter().print(parameter);

        Page page=new Page(3,3,3);
        //jackson转换转化对象
        ObjectMapper mapper=new ObjectMapper();
        String string = mapper.writeValueAsString(page);
        System.out.println(string);

        Page page1=new Page(4,3,1);
        Page page2=new Page(6,2,2);
        //jackson转换集合
        List<Page> list=new ArrayList<>();
        list.add(page);
        list.add(page1);
        list.add(page2);
        String string1 = mapper.writeValueAsString(list);
        System.out.println(string1);

        //转化多个集合 存入map集合
        List<Page> list1=new ArrayList<>();
        list1.add(page1);
        list.add(page2);
        Map<String,List<Page>> map=new HashMap<>();
        map.put("list1",list);
        map.put("list2",list1);
        String string2 = mapper.writeValueAsString(map);
        System.out.println(string2);
        //注册 验证用户是否存在  修改day40天
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                this.doPost(request,response);
    }
}
