package jmore;

public class Seller extends Employee{
    double salary=super.getSalary();
    private int num=0;
    static int mannum;
    int cunkuan;
    public Seller(){
        super();
        System.out.println("创建销售人员成功");
        mannum++;
    }
    public Seller(String name,int age){
        super(name,age);
        System.out.println("创建销售人员成功");
        mannum++;

    }
    @Override
    public void work(){
        super.cash+=100;
        this.num++;
        salary++;
    }

    @Override
    public double getSalary() {
        System.out.println("本月业绩："+"卖出了"+this.num+"件");
        return salary;
    }
    public static int getMannum() {
        return mannum;
    }
    public void getMoney(){
        super.cash-=salary;
        cunkuan+=salary;
        System.out.println("已发工资，"+"还剩："+super.cash);
    }

    public double getCunkuan(){
        return cunkuan;
    }
}
