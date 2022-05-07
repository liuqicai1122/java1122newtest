package com.offcn.servlet;

import com.offcn.bean.User;
import com.offcn.service.UserServiceImpl;
import org.omg.PortableInterceptor.INACTIVE;
import org.omg.PortableInterceptor.USER_EXCEPTION;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@WebServlet("/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8"); //解决中文乱码
        UserServiceImpl userService = new UserServiceImpl();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String telephone = request.getParameter("telephone");
        String birthday = request.getParameter("birthday");
        String id = request.getParameter("id");
        User user = new User();
        user.setId(Integer.parseInt(id));
        user.setUsername(username);
        user.setPassword(password);
        user.setName(name);
        user.setTelephone(telephone);
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        try {
            user.setBirthday(date.parse(birthday));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        int i = userService.updateUser(user);
        if (i!=0){
            response.sendRedirect("success.html");
        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.doPost(request,response);
    }
}
