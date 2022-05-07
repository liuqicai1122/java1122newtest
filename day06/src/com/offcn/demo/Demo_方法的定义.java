package com.offcn.demo;

public class Demo_方法的定义 {
    public static void main(String[] args) {
        getSum(213,341);//直接调用
        System.out.println(getSum(213,341));//输出调用
        int sum=getSum(333,432);//赋值调用
        System.out.println(sum);
        //方法不调用不执行
        //方法的调用
        //直接书写方法的名称
        //int sum = getSum(100,234);
        //System.out.println(sum);
        //1.getSum(100,200); 直接调用
        //2.输出调用 :有结果的方法才能输出调用
        //System.out.println(getSum(34,24));
        //  3. 赋值调用 ,有结果的方法才能
        // int sum = getSum(456,789);
        //System.out.println(sum);

    }
    //方法与方法之间是平级的关系 方法里面不能有方法
    /*public static 返回值类型  方法名 (参数列表){
            方法体语句;
            return xxx  ;   (根据实际情况)
    }
    *public static:现在我们就先这样去书写
    返回值类型:定义一个方法 . 方法可能会有一定的产出(结果),这个结果是需要对应容器接受
        返回值类型 说白了 就是 结果的数据类型
        方法名:以后看到这个方法就能找到这段代码,就能使用   起名规范;
        第一个单词首字母小写 后面单词每个首字母大写
    \*参数列表; 方法去执行的时候 可能需要一定的资源 这时我们需要吧需要的资源的数据类型
    给提供出来
    *方法体语句 正常的逻辑代码就行
    return 方法可能会有结果 我们需要把这个结果,返回值给我们调用者
    如果没有结果 就可以不适用return;
    * */
                //两个整数和 的方法
    public static int  getSum(int num1, int num2){
            int getSum =num1 + num2;
            return  getSum;

    }






}


