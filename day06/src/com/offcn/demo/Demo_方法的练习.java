package com.offcn.demo;

public class Demo_方法的练习 {
    public static void main(String[] args) {
        //方法调用 有三种 1直接调用 2 赋值调用 3 输出调用
        //1 没有返回值 只能直接调用 无参无返
        print99();
        //2.有参数无返回值方法
            //定义一个方法,输出指定行数和列数的矩形,通过参数决定输出多少行,
        //每行多少个
     printStar(4,6);
     //3.无参有返
        //直接调用再去调用有返回值的时候,一般没有任何效果
        getIntMaxValue();
        //只能输出打印才有效果
        System.out.println(getIntMaxValue());//2147483647
        //有参有返
        System.out.println(getSum(5,10));
    }

    // 1 无参无返  没有参数 也没有返回值
    //没有返回值 返回值类型就书写成void 书写99乘法表
    public static void print99() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }    //2. 有参数没返回值方法
        //定义一个方法 ,  输出指定行数和列数的矩形 ,通过参数决定输出多少行   每行多少"*
        public static void printStar(int row,int num){
        for (int i=1 ; i<=row ; i++){
            for (int j = 1; j <=num ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    } //3. 无参有返
    //定义一个方法用于获取ing类型的最大值是多少
    public static int getIntMaxValue(){
        // 因为这个方法有返回值,所以需要return
        return Integer.MAX_VALUE;
    }//4.有参有返
    //定义一个方法,用于计算两个int类型变量的和并返回
    public  static int getSum(int num1,int num2){
        return num1+num2;
    }





}
