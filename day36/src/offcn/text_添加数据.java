package offcn;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class text_添加数据 {
    public static void main(String[] args) {
        //1 获取控制台输入的数据
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = sc.nextLine();

        System.out.println("请输入年龄");
        String age = sc.nextLine();

        System.out.println("请输入生日");
        String brithday = sc.nextLine();

        //2加载驱动
        Connection conn=null;
        Statement st = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        //3 获取连接
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/my1?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai","root","root");


            //4 获取执行SQL的对象Statement
          st = conn.createStatement();

          //5 拼接  SQL
            String sql="insert into student values(null,'"+ name +"',"+ age +",'"+ brithday+"')";
            int i = st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (st!=null){
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
