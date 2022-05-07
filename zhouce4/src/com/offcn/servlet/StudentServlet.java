package com.offcn.servlet;

import com.offcn.bean.Page;
import com.offcn.bean.Student;
import com.offcn.service.StudentService;
import com.offcn.service.StudentServiceImpl;
import com.sun.xml.internal.ws.addressing.WsaClientTube;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
            StudentService studentService=new StudentServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getParameter("method");
        if ("add".equals(method)){
            insertStudent(request,response);
        }else if ("selectAll".equals(method)){
            selectAll(request,response);
        }else  if ("delete".equals(method)){
            deleteById(request,response);
        }else  if ("preupdate".equals(method)){
            preupdate(request, response);
        }else  if ("update".equals(method)) {
            update(request, response);
        }else  if ("findByCondition".equals(method)){
            findByCondition(request,response);
        }

    }

    private void findByCondition(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String score= request.getParameter("score");
        Student student =new Student();
        student.setName(name);
        System.out.println(name);
        if (age!=null && !"".equals(age.trim())){
            student.setAge(Integer.parseInt(age));
        }
        if (score!=null && !"".equals(score.trim())){
            student.setScore(Integer.parseInt(score));
        }
        List<Student> list = studentService.selectByCondition(student);
        request.setAttribute("list",list);
        try {
            request.getRequestDispatcher("list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String score= request.getParameter("score");
        Student student=new Student();
        student.setId(Integer.parseInt(id));
        student.setName(name);
        student.setAge(Integer.parseInt(age));
        student.setScore(Integer.parseInt(score));
        int i = studentService.updateStudent(student);
        if (i!=0){
            try {
                response.sendRedirect("StudentServlet?method=selectAll");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private void preupdate(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        Student student = studentService.selectStudentById(Integer.parseInt(id));
        request.setAttribute("student",student);
        try {
            request.getRequestDispatcher("update.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteById(HttpServletRequest request, HttpServletResponse response) {
        String  id = request.getParameter("id");
        int i = studentService.deleteStudentById(Integer.parseInt(id));
        if (i!=0){
            try {
                response.sendRedirect("StudentServlet?method=selectAll");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void selectAll(HttpServletRequest request, HttpServletResponse response) {
        //从前台获取当前页数
        int currentPage=1;
        String currPage = request.getParameter("currentPage");
        if (currPage!=null&& !"".equals(currPage.trim())){
           currentPage= Integer.parseInt(currPage);
        }
        Page page=new Page();
        page.setCurrentPage(currentPage);
        int totalNum = studentService.finCount();
        page.setTotalNum(totalNum);
        int totalPage=0;
        if (totalNum%Page.PAGESIZE ==0){
             totalPage=totalNum/Page.PAGESIZE;
        }else {//不能整除+1
            totalPage=(totalNum/Page.PAGESIZE)+1;
        }
        page.setTotalPage(totalPage);
        request.setAttribute("page",page);

        List<Student> list = studentService.selectAllStudent(page);
        request.setAttribute("list",list);
        try {
            request.getRequestDispatcher("list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void insertStudent(HttpServletRequest request, HttpServletResponse response) {
        String name= request.getParameter("name");
        String age = request.getParameter("age");
        String score = request.getParameter("score");
        Student student=new Student();
        student.setName(name);
        student.setAge(Integer.parseInt(age));
        student.setScore(Integer.parseInt(score));
        int i = studentService.insertStudent(student);
        if (i!=0){
            try {
                response.sendRedirect("StudentServlet?method=selectAll");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
