package com.offcn.servlet;

import com.offcn.bean.Book;
import com.offcn.service.BookService;
import com.offcn.service.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAllServlet")
public class selectAllServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BookService bookService=new BookServiceImpl();
        List<Book> list = bookService.selectAll();
        request.setCharacterEncoding("utf-8");
        request.setAttribute("list",list);
        request.getRequestDispatcher("selectAll.jsp").forward(request,response);
    }
}
