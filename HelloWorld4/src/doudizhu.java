import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;

//无序牌组
public class doudizhu {
    public static void main(String[] args) {
        ArrayList<String> ar=new ArrayList<>();
        //准备牌
        String[] arr1={"A","2","3","4","5","6","7","8","9","10","J","Q","K" };
        String[] arr2={"红心","黑桃","钻石","梅花"};
        for (String s1 :arr1) {//简便for循环
            for (String s2 :arr2) {
                ar.add(s1+s2);
            }
        }
        ar.add("大王");
        ar.add("小王");
        //洗牌
        Collections.shuffle(ar);
        System.out.println(ar);
        Collection co=ar;
        Iterator it=co.iterator();
        //发牌
        ArrayList<String> p1=new ArrayList<>();
        ArrayList<String> p2=new ArrayList<>();
        ArrayList<String> p3=new ArrayList<>();
        ArrayList<String> p4=new ArrayList<>();
        for (int i=0 ; i <co.size() ; i++) {
            String str=(String) it.next();
            if(i>=51){p4.add(str);}
            else if(i%3==0){p1.add(str);}
            else if(i%3==1){p2.add(str);}
            else if(i%3==2){p3.add(str);}

        }

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);


    }
}
