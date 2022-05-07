package com.offcn.servlet;

import com.offcn.bean.Book;
import com.offcn.service.BookService;
import com.offcn.service.BookServiceImpl;
import com.offcn.service.UserService;
import com.offcn.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/preUpdateServlet")
public class preUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BookService bookService=new BookServiceImpl();
        String id = request.getParameter("id");
        Book book = bookService.selectById(Integer.parseInt(id));
        request.setAttribute("book",book);
        request.getRequestDispatcher("updateBook.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                this.doPost(request,response);
    }
}
