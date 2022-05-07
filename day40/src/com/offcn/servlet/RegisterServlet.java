package com.offcn.servlet;

import com.offcn.bean.User;
import com.offcn.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("utf-8");//request缓冲 解决中文乱码问题
        //获取参数 表单name
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String uname = request.getParameter("uname");
        String phone = request.getParameter("phone");
        String birthday = request.getParameter("birthday");
        /* 创建对象 封装到user */
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setName(uname);
        user.setTelephone(phone);
        //日期格式化
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            user.setBirthday(simpleDateFormat.parse(birthday));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //d调用方法
        UserServiceImpl us= new UserServiceImpl();
        us.insertUser(user);

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
