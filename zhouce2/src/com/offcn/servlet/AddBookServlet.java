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

@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");//request缓冲 解决中文乱码问题
            Book book=new Book();//创建对象 内容封装到对象中
        String name = request.getParameter("name");
        String author = request.getParameter("author");
            book.setName(name);
            book.setAuthor(author);
        BookService bs=new BookServiceImpl();
          int i = bs.insertBook(book);
       /* BookServiceImpl book1=new BookServiceImpl();
        List<Book> books = book1.selectBookAll();
        request.setAttribute("list",books);
        request.getRequestDispatcher("chaxun.jsp").forward(request,response);
*/
       request.getRequestDispatcher("succed.jsp").forward(request,response);
        //request.getRequestDispatcher("SelectServlet").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
