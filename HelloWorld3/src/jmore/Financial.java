package jmore;

public abstract class Financial extends Employee{
    static double salary=3000;
    static int mannum;


    public Financial(){//子类构造方法中一样继承父类构造方法，super()
        //super();自动附带
        System.out.println("创建财务人员成功");
        mannum++;
    }
    public Financial(String name,int age){
        super(name,age);
        this.salary=salary;
        System.out.println("创建财务人员成功");
        mannum++;

    }
    //隐含了public abstract void work();(继承父抽象类)
//    @Override
//    public void work(){//对抽象方法具体化
//        System.out.println("记账");
//    }
    @Override
    public double getSalary() {
        return salary;
    }

    public static int getMannum() {
        return mannum;
    }
}

