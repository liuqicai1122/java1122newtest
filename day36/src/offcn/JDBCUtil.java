package offcn;

import java.sql.*;
import java.util.ResourceBundle;

public class JDBCUtil {
    //1 定义数据库连接
    private static String driverClass;
    private  static  String url;
    private static String username;
    private  static String password;
    //使用静态代码块执行一次
    static {
        try {
            //2.在静态代码块中加载 properties 文件 读取信息赋值给上面的变量
            ResourceBundle db = ResourceBundle.getBundle("db");//不加文件后缀名
            driverClass= db.getString("driverClass");
            url=db.getString("url");
            username= db.getString("username");
            password= db.getString("password");
            Class.forName(driverClass);
            //当这类加载到内存时候走这个静态代码块 主动注册
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //提供方法获取连接
    public static  Connection getConnection()  {
        Connection con=null;
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return   con;
    }
    //关闭资源的方法
    public static  void close(Connection con, Statement stmt, ResultSet rs){
        if(con!=null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(stmt!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static  void close(Connection con, Statement stmt){
        close(con,stmt,null);
    }
}
