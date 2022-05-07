package Demo;

public class Test_01 {
    //顶一个一个方法 方法的参数是int[]类型 把传入的int类型的数组组成字符串返回
    //返回格式为[1#2#3#] int[] aa ={1,2,3}
    public static void main(String[] args) {
        int [] aa={1,2,3};
        System.out.println(str(aa));
    }
    public static String str (int [] arr) {
        //我们先做好判定
        if (arr != null && arr.length != 0) {
            String str1="[";
            for (int index = 0; index <arr.length; index++) {
                int num=arr[index];
                if(index!=arr.length-1){
                    str1=str1+num+"#";
                }else {
                    str1=str1+num+"#"+"]";
                }
            } return str1;

        } else {
            System.out.println("您输入的数组为空 或长度为零");
        }return "";
    }

}



