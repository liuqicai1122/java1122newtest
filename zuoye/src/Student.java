import java.util.Objects;

public class Student {
    private  int id;//编号
    private  String name;//姓名
    private  int age;// 年龄
    private String sex;//性别
    private String phone;//电话号码
    private String address;// 地址

    //无参构造方法

    public Student() {
    }

    //全属性有参构造


    public Student(int id, String name, int age, String sex, String phone, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.address = address;
    }
    //无id属性构造方法

    public Student(String name, int age, String sex, String phone, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "序号ID"+id+"       "+"姓名"+name+"   "+"年龄"+age+"性别"+sex+"电话号码" +phone+"地址"+address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(sex, student.sex) &&
                Objects.equals(phone, student.phone) &&
                Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, sex, phone, address);
    }
}
