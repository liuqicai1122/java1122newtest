import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Operation {
    private List<Student> list=new ArrayList<>();//创建ArrayList用来保护添加的Student对象
    TelRegex tr=new TelRegex();//用于控制输入内容


    public  void addLogic(){//添加逻辑
        Menu menu=new Menu();
        while (true){
            menu.addMenu();//打印添加子菜单
            int num = tr.getNum(1, 3);
            switch (num){
               case 1: addOperate();break;//添加操作
               case 2: findAll();break;//查询操作
               case 3: return; //返回上一级
                //default:break;
            }
        }
    }
    public void addOperate(){//添加操作
        //获取输入数据

        String s1 = tr.nameRegex();
        int i = tr.ageRegex();

        String s2 = tr.sexRegex();
        String s3 = tr.phoneRegex();
        String s = tr.addressRegex();
        //通过Student构造方法吧数据存入Student对象
        Student student=new Student(s1,i,s2,s3,s);
        //为student添加编号 id
        student.setId(list.size()+1);
        //把student存入list中
        list.add(student);

    }
    public  void findAll(){
        if (list.size()>0){
            for (Student stu:list){
                System.out.println(stu);
            }
        }else {
            System.out.println("没有任何记录");
        }
    }


    public void searchLogic(){//查找记录逻辑
        Menu menu=new Menu();
        while (true){
            menu.searchMenu();
            int num = tr.getNum(1, 7);
            switch (num){
                case 1 : findByName(); break;
                case 2 :;findByAge(); break;
                case 3 :;findBySex();break;
                case 4 :;findByPhone();break;
                case 5 :;findByAddress();break;
                case 6 : findAll();break;
                case 7 : return;
                default:break;
            }
        }
    }
    public void findByName(){//按姓名查找
        String s = tr.nameRegex();
        boolean flag=false;//假设没有找到
        for (Student stu: list) {
            if (s.equals(stu.getName())){
                System.out.println(stu);
                flag=true;
            }
        }
        if (flag=false){
            System.out.println("没有记录");
        }
    }
    public void findByAge(){//按照年龄查找
        int i = tr.ageRegex();
        Boolean flag=false;
        for (Student stu:list) {
            if (i==stu.getAge()){
                System.out.println(stu);
                flag=true;
            }
        }
        if (flag=false){
            System.out.println("没有记录");
        }
    }
    public  void  findBySex(){//性别查找
        String s = tr.sexRegex();
        boolean flag=false;//假设找不到
        for (Student stu:list) {
            if (s.equals(stu.getSex())){
                System.out.println(stu);
                flag=true;
            }
        }
        if (flag=false){
            System.out.println("没有记录");
        }
    }
    public void findByPhone(){//按照号码查找
        String s = tr.phoneRegex();
        boolean flag=false;//假设找不到
        for (Student stu:list ){
            if (s.equals(stu.getPhone())){
                System.out.println(stu);
                flag=true;
            }
        }
        if (flag==false){
            System.out.println("没有记录");
        }
    }
    public void  findByAddress(){//按照地址查找
        String s = tr.addressRegex();
        boolean flag=false;//假设找不到
        for (Student stu: list){
            if (s.equals(stu.getAddress())) {
                System.out.println(stu);
                flag = true;//找到
            }
        }
        if (false){
            System.out.println("没有记录");
        }
    }
    public  void modifyLogic(){//修改逻辑
        Menu menu=new Menu();
        while (true){
            menu.modifyMenu();
            int num = tr.getNum(1, 3);
            switch (num){
                case 1: findAll(); break;
                case 2: madifyOperate();break;
                case 3: return;
            }
        }
    }
     public void madifyOperate(){
        Menu menu=new Menu();
         System.out.println("请输入你要修改的编号");
         int num = tr.getNum(1, list.size());
         if (num==-1){//当输入要修改数据的编号不正确 这个方法会返回一个-1
             System.out.println("请输入正确的编号");
         }else {
             Student student = list.get(num - 1);//找到要修改的那个student
             menu.modifySubMenu();
             int num1 = tr.getNum(1, 6);
             switch (num1){
                 case 1: student.setName(tr.nameRegex());break;
                 case 2: student.setAge(tr.ageRegex());break;
                 case 3: student.setSex(tr.sexRegex());break;
                 case 4:student.setPhone(tr.phoneRegex());break;
                 case 5: student.setAddress(tr.addressRegex());break;
                 case 6: return;
                 default:break;
             }
         }
     }
    public void deleteLogic(){//删除逻辑
        Menu m=new Menu();
        while (true){
            m.deleteMenu();
            int num = tr.getNum(1, 4);
            switch (num){
                case 1: findAll();break;
                case 2: delete();break;
                case 3: deleteAll();break;
                case 4:return;
            }
        }
    }
    public  void delete(){//删除指定记录
        System.out.println("请输入指定的记录序号");
        int num = tr.getNum(1, list.size());
        if (num==-1){
            System.out.println("请输入正确的序号");
        }else {
            Student student = list.remove(num - 1);
            for (int i =0; i<list.size(); i++ ){
                (list.get(i)).setId(i+1);
            }
        }
        System.out.println("删除成功,请继续操作");
    }

    public  void deleteAll(){//删除全部记录
        list.clear();
        System.out.println("内容已经清空,请继续操作");

    }
    public  void  sortLogic(){//排序逻辑
        Menu m= new Menu();
        while (true){
            m.sortMenu();
            int num = tr.getNum(1, 5);
            switch (num){
                case 1:sortByName();break;
                case 2:sortByAge();break;
                case 3:sortSex();break;
                case 4: findAll();break;
                case 5:return;
            }
        }
    }
    public void sortByName() {//姓名排序
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (int i=0;i<list.size();i++){
            (list.get(i)).setId(i+1);
        }
    }
    public  void sortByAge(){
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        for (int i=0;i<list.size();i++){
            (list.get(i)).setId(i+1);
        }
    }
    public  void sortSex(){
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getSex().compareTo(o2.getSex());
            }
        });
        for (int i=0;i<list.size();i++){
            (list.get(i)).setId(i+1);
        }
    }


}
