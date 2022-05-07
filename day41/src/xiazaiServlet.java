import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

@WebServlet ("/DownloadServlet")
public class xiazaiServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                //1  获得参数 文件名称
        String file = request.getParameter("filename");
                //2 设置响应头
        response.setHeader("Content-Disposition","attachment;filename=" +file);
                //设置文件相应流
        InputStream Stream = this.getServletContext().getResourceAsStream(file);
                //创建文件输出流
        ServletOutputStream outputStream = response.getOutputStream();
            //5文件处理 读写
        byte[] bytes = new byte[1024 * 8];
            int len=-1;//字节个数
            while ((len= Stream.read(bytes)) !=-1){
                outputStream.write(bytes,0,len);
            }
            //关流
              Stream.close();
            outputStream.close();
     }
}
