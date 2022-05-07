import java.lang.invoke.MutableCallSite;

public class App {
    public static void main(String[] args) {
        Menu meun = new Menu(); //创建Meun对象,开始调用方法打印菜单
        TelRegex tr = new TelRegex();//用户控制键盘输入的内容
        Operation ii = new Operation();
        while (true) {//死循环 不符合一直打印主菜单
            meun.mainMenu();//打印主菜单
            int num = tr.getNum(1, 6);//调用方法 控制输入1  到6
            //上面方法是有返回值为 int
            //根据输入的内容.,选择相应的case 执行相应操作逻辑
            switch (num) {

                case 1:
                    ii.addLogic();
                    break;
                case 2:
                    ii.searchLogic();
                    break;
                case 3:
                    ii.modifyLogic();
                    break;
                case 4:
                    ii.deleteLogic();
                    break;
                case 5:
                        ii.sortLogic();
                    break;

                case 6:
                System.exit(0);//退出程序
                default:
                    break;//当输入的内容不能匹配,跳出switch 再次进入循环 输入主菜单
            }

        }

    }
}
