public class Menu {
    public void mainMenu(){
        System.out.println("************************");//主菜单
        System.out.println("     1 添加记录            ");
        System.out.println("     2 查找记录             ");
        System.out.println("     3 修改记录             ");
        System.out.println("     4 删除记录              ");
        System.out.println("     5 排序记录              ");
        System.out.println("     6 退出系统                ");

    }
    public  void addMenu(){//添加菜单
        System.out.println("*********************");
        System.out.println("    1 添加新记录     ");
        System.out.println("    2 查找全记录     ");
        System.out.println("    3 返回上一级      ");
        System.out.println("*********************8");
    }
    public void searchMenu(){//查找菜单
        System.out.println("********************");
        System.out.println("     1 按照姓名查找  ");
        System.out.println("     2 按照年龄查找" );
        System.out.println("     3 按照性别查找  ");
        System.out.println("     4 按照号码查找  ");
        System.out.println("     5 按照住址查找  ");
        System.out.println("     6 查找全记录   ");
        System.out.println("     7 返回上一级    ");
        System.out.println("**********************");

    }
    public void  modifyMenu(){//修改菜单
        System.out.println("**************************");
        System.out.println("       1 查看全部记录      ");
        System.out.println("       2 修改指定记录       ");
        System.out.println("        3 返回上一级       ");
        System.out.println("*******************************");
    }
    public void modifySubMenu(){//修改子菜单
    System.out.println("*****************************");
    System.out.println("     1 修改名字     ");
    System.out.println("     2 修改年龄      ");
    System.out.println("     3 修改性别      ");
    System.out.println("     4 修改号码      ");
    System.out.println("     5 修改住址       ");
    System.out.println("     6 返回上一级     ");
    System.out.println("**************************");

    }//
    public void deleteMenu(){//删除菜单
        System.out.println("*********************");
        System.out.println("     1 查看全记录    ");
        System.out.println("     2 删除指定记录  ");
        System.out.println("     3 删除全部记录   ");
        System.out.println("      4  返回上一级    ");
        System.out.println("*********************");
    }
    public void sortMenu(){//排序菜单
        System.out.println("            ");
        System.out.println("    1 按姓名  ");
        System.out.println("    2 按年龄排序 ");
        System.out.println("     3 按性别排序");
        System.out.println("    4 查看全部记录  ");
        System.out.println("     5 返回上一级");

    }




}