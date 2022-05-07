package com.offcn.servlet;

import com.offcn.bean.User;
import com.offcn.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet( "/SelectServlet")
public class SelectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserServiceImpl us=new UserServiceImpl();
        List<User> list = us.selectUserAll();
        request.setAttribute("llll",list);
         //转发到
        request.getRequestDispatcher("userxinxi.jsp").forward(request,response);
    }
}
