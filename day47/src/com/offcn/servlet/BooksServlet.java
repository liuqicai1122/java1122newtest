package com.offcn.servlet;

import com.offcn.bean.Books;
import com.offcn.bean.Page;
import com.offcn.service.BooksService;
import com.offcn.service.BooksServiceImpl;
import com.offcn.utils.DateUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@WebServlet("/BooksServlet")
public class BooksServlet extends HttpServlet {
    BooksService booksService=new BooksServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getParameter("method");

        if ("add".equals(method)){
            add(request,response);
        }else if("findAll".equals(method)){
            findAll(request,response);
        }else  if ("del".equals(method)){
            delete(request,response);
        }else  if ("findbookbycondition".equals(method)){
            findbookbycondition(request,response);
        }else  if("preupdate".equals(method)){
             selectById(request, response);
        }else  if("update".equals(method)){
            update(request,response);

        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //request.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");
        String booknum = request.getParameter("booknum");
        String bookname = request.getParameter("bookname");
        String bookauthor = request.getParameter("bookauthor");
        String bookpublish = request.getParameter("bookpublish");
        String bookdate = request.getParameter("bookdate");
        String bookprice = request.getParameter("bookprice");
        System.out.println(bookname);
        Books books=new Books();
        books.setId(Integer.parseInt(id));
        books.setBooknum(booknum);
        books.setBookname(bookname);
        books.setBookpublish(bookpublish);
        books.setBookauthor(bookauthor);
        books.setBookdate(DateUtil.stringToDate(bookdate));
        books.setBookprice(Integer.parseInt(bookprice));
        int i = booksService.updateBooks(books);
        System.out.println(i);
        if (i!=0){
            response.sendRedirect("BooksServlet?method=findAll");
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // String method = request.getParameter("method");
       // if ("findAll".equals(method)){
           // findAll(request,response);
       // }
        this.doPost(request,response);
    }
    //添加书籍
    private void add(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String booknum = request.getParameter("booknum");
        String bookname = request.getParameter("bookname");
        String bookauthor = request.getParameter("bookauthor");
        String bookpublish = request.getParameter("bookpublish");
        String bookdate = request.getParameter("bookdate");
        String bookprice = request.getParameter("bookprice");
        Books books=new Books();
        books.setBooknum(booknum);
        books.setBookname(bookname);
        books.setBookauthor(bookauthor);
        books.setBookpublish(bookpublish);
        books.setBookdate(DateUtil.stringToDate(bookdate));
        books.setBookprice(Integer.parseInt(bookprice));
        booksService.insertBooks(books);
        response.sendRedirect("BooksServlet?method=findAll");
    }
    //查询全部
    private void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //当前页 默认为1
        int currentPage=1;

        String currPage = request.getParameter("currPage");//从页面获取当前页码
        if (currPage !=null&& !"".equals(currPage) ){
                        currentPage=Integer.parseInt(currPage);
        }
        Page page=new Page();
        page.setCurrentPage(currentPage);//设置当前页
        //计算总条数
        int totalNum = booksService.findCount();
        page.setTotalNum(totalNum);//设置总条数
        //计算总页数
        int totalPage=0;
        if (totalNum%Page.PAGESIZE==0){
            totalPage=totalNum/Page.PAGESIZE;
        }else{///不能整除需要加1
            totalPage=totalNum/Page.PAGESIZE+1;
        }
        //设置总页数
        page.setTotalPage(totalPage);

        List<Books> list = booksService.selectBooks(page);
        request.setAttribute("page",page);
        request.setAttribute("blist",list);
    request.getRequestDispatcher("showbook.jsp").forward(request,response);
    }
    //根据id删除
    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        System.out.println(id);
        int i = booksService.deleteById(Integer.parseInt(id));

        if (i!=0){
            response.sendRedirect("BooksServlet?method=findAll");
        }
    }
    //根据条件查询
    private void findbookbycondition(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                //获得参数
        String booknum = request.getParameter("booknum");
        String bookname = request.getParameter("bookname");
        String bookauthor = request.getParameter("bookauthor");
        String bookpublish = request.getParameter("bookpublish");
        String bookdate = request.getParameter("bookdate");
        String bookprice = request.getParameter("bookprice");
        //封装对象
        Books books=new Books();
        books.setBooknum(booknum);
        books.setBookname(bookname);
        books.setBookauthor(bookauthor);
        books.setBookpublish(bookpublish);
        //设置 前进行判断 是否录入有效信息
        if (bookdate!=null && !"".equals(bookdate.trim())){
            books.setBookdate(DateUtil.stringToDate(bookdate));
        }

        if (bookprice!=null&& !"".equals(bookprice.trim())){
            books.setBookprice(Integer.parseInt(bookprice));
        }
        BooksService booksService=new BooksServiceImpl();
        List<Books> list = booksService.findBookByCondition(books);
        request.setAttribute("blist",list);
        request.getRequestDispatcher("showbook.jsp").forward(request,response);
    }
    private void selectById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        Books books = booksService.selectById(Integer.parseInt(id));
            request.setAttribute("books",books);
            request.getRequestDispatcher("update.jsp").forward(request,response);
    }

}
