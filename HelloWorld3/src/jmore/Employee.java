package jmore;
//要用抽象方法必须用抽象类
//抽象成员方法或者抽象构造方法也行
public abstract class Employee {
    static int cash=8000;//总资产
    //成员变量
    private static int id=0;
    String name;
    int age;
    private double salary=2000;

    public Employee(){
        this.id=++id;
    }
    //构造方法(创建子类不能有构造方法)
    public Employee(String name,int age){
        this.id=++id;
        this.name=name;
        this.age=age;



    }
    //抽象方法
    public abstract void work();//此方法是工作，但不知道是什么职位，不确定做什么，是抽象方法

    //成员方法
    public  static int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

}
