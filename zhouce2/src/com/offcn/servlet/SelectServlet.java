package com.offcn.servlet;

import com.offcn.bean.Book;
import com.offcn.service.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/SelectServlet")
public class SelectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BookServiceImpl book=new BookServiceImpl();
        List<Book> books = book.selectBookAll();
                request.setAttribute("list",books);
        for (Book book1 : books) {
            System.out.println(book1.getName());
        }
                request.getRequestDispatcher("chaxun.jsp").forward(request,response);
    }
}
