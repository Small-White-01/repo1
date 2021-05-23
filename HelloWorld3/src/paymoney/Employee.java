package paymoney;
import java.util.ArrayList;
import java.util.Random;
public class Employee extends User{
    public Employee(){}
    public Employee(String name,int cash){
        super(name,cash);
    }

    public void recieve(ArrayList<Integer> list){
        if(list.size()==0){
            System.out.println("没有红包");
            return;
        }
        int index=new Random().nextInt(list.size());
        cash+=list.get(index);
        list.remove(index);
        System.out.println(name+"拿到的红包："+cash);
        if(list.size()==0){
            System.out.println("红包已派完");
            return;
        }

    }
    public void aa(){}
}
