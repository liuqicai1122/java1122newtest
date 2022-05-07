package com.offcn.servlet;

import com.offcn.bean.User;
import com.offcn.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DeleteUserServlet")
public class DeleteUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        UserServiceImpl userService=new UserServiceImpl();
        // User user =new User();
        // user.setId(Integer.parseInt(id));
        int i = userService.deleteUserById(Integer.parseInt(id));
        if (i !=0){
            response.sendRedirect("success.html");
        }
    }

}
