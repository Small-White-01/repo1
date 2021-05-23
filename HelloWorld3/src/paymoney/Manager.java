package paymoney;

import java.util.ArrayList;
import java.util.Random;
public class Manager extends User{
    public Manager(){}
    public Manager(String name,int cash){
        super(name,cash);
    }

    public ArrayList<Integer> send(int total_cash,int count){
        ArrayList<Integer> list=new ArrayList<>();
        if(total_cash>cash){
            System.out.println("余额不足");
            return list;
        }





//        int each=total_cash/count;
//        int last=total_cash%count+total_cash/count;
        for (int i = 0; i < count-1; i++) {
            int rancash = new Random().nextInt(total_cash/count-1)+1;//(b-a)+a-->[a,b),(b-a)+a+1-->(a,b]
            if((total_cash-=rancash)>0){
                list.add(rancash);
            }

        }list.add(total_cash);
        return list;

    }
    public void aa(){}
}
