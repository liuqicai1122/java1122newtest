import com.sun.deploy.security.SelectableSecurityManager;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class TelRegex {
    public  int getNum(int begin,int end){//通过参数传入begin到end,程序更加灵活
        while(true){
            System.out.println("请输入"+begin+"到"+end);
            Scanner sc=new Scanner(System.in);
            String s = sc.nextLine();
            String regex="\\d{1}";//正则表达式,只能输入1位数字
            if (s.matches(regex)){
                int i = Integer.parseInt(s);
                if (i>=begin&&i<=end){
                    return i;
                }else {
                    System.out.println("输入的范围不合适请输入"+begin+"到"+end);
                }
            }else {
                System.out.println("输入的格式错误"+begin+"到"+end+"之间的数");
            }
            return  -1;//当不符合规则,返回-1;
        }
    }
    public String nameRegex(){
        while (true){
            System.out.println("请输入名字:1-10个字符");
            Scanner sc=new Scanner(System.in);
            String nameStr=sc.nextLine();
            String regex="[a-zA-z]{1,10}";
            if (nameStr.matches(regex)){
                return nameStr;
            }else {
                System.out.println("名字格式不正确请输入1-10个字母");
            }
        }
    }
    public int ageRegex(){
        while (true){
            System.out.println("请输入年龄1-100");
            Scanner sc=new Scanner(System.in);
            String s = sc.nextLine();
            String regex="[1]?\\d{1,2}";
            if (s.matches(regex)){
                int i = Integer.parseInt(s);
                return  i;
            }else {
                System.out.println("输入的年龄格式不正确,请重新输入");
            }
        }
    }

    public String sexRegex(){
        while (true){
            System.out.println("请输入性别 m or M f or F");
            Scanner sc=new Scanner(System.in);
            String sexStr = sc.nextLine();
            String regex="[mfMf]{1}";
            if (sexStr.matches(regex)){
                return  sexStr;
            }else {
                System.out.println("性别格式不正确请重新输入");
            }
        }
    }
    public  String phoneRegex(){
        while (true){
            System.out.println("请输入电话号码:11位");
            Scanner sc=new Scanner(System.in);
            String s = sc.nextLine();
            String regex="[0-9]{11}";
            if (s.matches(regex)){
                return s;
            }else {
                System.out.println("电话格式不正确");
            }
        }
    }

    public  String addressRegex(){
        while (true){
            System.out.println("请输入地址1-50个字符");
            Scanner sc=new Scanner(System.in);
            String s = sc.nextLine();
            String addressStr="[a-zA-Z]{1,50}";
            if (s.matches(addressStr)){
                return  s;
            }else {
                System.out.println("地址格式不正确");
            }
        }
    }

}
