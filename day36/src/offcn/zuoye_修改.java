package offcn;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class zuoye_修改 {
        public static void main(String[] args) {
            //增加操作
            Scanner sc= new Scanner(System.in);
            System.out.println("请输入要修改的id");
            String id = sc.nextLine();            System.out.println("请输入要修改名字");
            String name = sc.nextLine();
            System.out.println("请输入要修改年纪");
            String age = sc.nextLine();
            System.out.println("请输入要修改生日");
            String birthday = sc.nextLine();

            //注册驱动 获取连接
            Connection con = null;
            Statement st =null;
            try {
                //注册驱动 获取连接
                con = JDBCUtil.getConnection();
                st = con.createStatement();//获取执行语句Statement 对象
                String sql="update student set name ='"+ name +"',age="+age+",birthday='"+birthday+"'where id ="+id+"";
                int i = st.executeUpdate(sql);//执行
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                JDBCUtil.close(con,st);
            }

        }
    }


