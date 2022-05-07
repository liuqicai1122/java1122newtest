import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ResponceServlet")
public class ResponceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("refresh","5;url=http://www.baidu.com");
        //response.setHeader("content-encoding","gzip");
        response.setContentType("text/html;charset=utf-8");
        // 设置响应头
        response.setHeader("content-encoding","gzip");
        //重定向
        //response.sendRedirect("WirterServlet");
    }
}
