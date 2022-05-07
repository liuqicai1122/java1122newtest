package com.exception;

public class Demo10_Finally {
    public static void main(String[] args) {
        System.out.println(getResult());
        //格式
        /*try{
        }catch(){
        }finally{
        }
        *
        *try{
        }finally {
        }       *
        *
        * */
    }

    public  static  int getResult(){
            int  result=0;
        int x =10;
        int y=1;

            try{

                result=x/y;
                //System.out.println(result);
                //return方法一旦碰到return就会结束
               // System.out.println(result);
                return  result;
            }catch (ArithmeticException a){
                //a.printStackTrace();
                System.out.println("嘤嘤嘤");
            }finally {
                //无论我们上面的代码执行成功还是失败 ,我们finally里面的代码  都一定会执行
                System.out.println("哈啊啊啊啊哈啊啊啊啊");
                result= 6666;
            }
            return  result;

    }
}
