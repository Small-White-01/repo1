package jmore;

public class Accountant extends Financial{
    int cunkuan=0;
    public Accountant(){
        super();
    }
    public Accountant(String name,int age){
        super(name,age);
    }
    public void work(){
        System.out.println("记账");
    }
    public void paywork(){
        System.out.println("发工资，公司财产余额："+super.cash);


        if(super.cash<0){
            System.out.println("公司已破产");
            return;
        }
    }
    public void getMoney(){
        cunkuan+=super.getSalary();
        super.cash-=super.getSalary();
        System.out.println("已发工资，"+"还剩："+super.cash);
    }
    public double cashonly(){
        return  super.cash;
    }

    public int getCunkuan() {
        return cunkuan;
    }
}
