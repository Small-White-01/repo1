package paymoney;

public class User {
    String name;
    int age;
    int cash;

    public User(){}
    public User(String name,int cash){
        this.name=name;
        this.cash=cash;
    }


    public void checkCash(){
        System.out.println(this.cash);
    }
}
