package jmore1;

public class Students {
    //成员变量
    private String name;
    private int age;
    static String classroom="222";//静态变量,属于对象共享的.
    private static int id=0;

    //静态代码块
    static{
        System.out.println("所在教室:"+classroom);
    }
    //无参数构造方法
    public Students(){
        this.id=++id;
    }
    //有参数构造方法
    public Students(String name,int age){
        this.name=name;
        this.age=age;
        this.id=++id;

    }
    //成员方法
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

    //加了static的静态方法，只能调用静态变量
    public static String getClassroom() {
        return classroom;
    }

    public static int getId() {
        return id;
    }


}
