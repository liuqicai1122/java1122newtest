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

@WebServlet("/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String author = request.getParameter("author");
        Book book=new Book();
        book.setId(Integer.parseInt(id));
        book.setName(name);
        book.setAuthor(author);
        BookService bookService=new BookServiceImpl();
        int i = bookService.updateBook(book);
        if (i!=0){
            response.sendRedirect("succed.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.doPost(request,response);
    }
}
