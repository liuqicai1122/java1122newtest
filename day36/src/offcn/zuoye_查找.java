package offcn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class zuoye_查找 {
    public static void main(String[] args) {
        //操作
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入要查找的id");
        String id = sc.nextLine();
        //注册驱动 获取连接
        Connection con = null;
        Statement st =null;
        ResultSet rs = null;
        try {
            //注册驱动 获取连接
            con = JDBCUtil.getConnection();
            st = con.createStatement();//获取执行语句Statement 对象
            String sql= "select * from student where id ="+id;
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(con,st,rs);
        }

    }
}
