package com.offcn.demo;

import javafx.scene.layout.BackgroundRepeat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                request.setAttribute("name","1122java");
                request.getRequestDispatcher("demo.jsp").forward(request,response);

                User user =new User();
                user.setId(1);
                user.setAge(16);
                user.setName("刘奇才");
                request.setAttribute("user",user);
                request.getRequestDispatcher("demo.jsp").forward(request,response);

                User user1=new User(1,"haha",21);
                User user2=new User(2,"大傻逼",1);
                 User user3=new User(3,"皮卡丘",22);
        List<User> list= new ArrayList<>();
                list.add(user);
                list.add(user1);
                list.add(user3);
                list.add(user2);
                request.getRequestDispatcher("demo.jsp").forward(request,response);


    }
}
