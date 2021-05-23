package jmore1;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class demo04ARP4 {
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>();

        Random r=new Random();
        for (int i = 0; i < 20; i++) {
            int num=r.nextInt(200);
            list1.add(num);
        }

        System.out.println(list1);
        List<Integer> list2=getoushu(list1);

        System.out.println(list2);




    }

    public static ArrayList<Integer> getoushu(ArrayList<Integer> list) {
        ArrayList<Integer> list2=new ArrayList<>();
        for (int i = 0; i < list.size() ; i++) {
            int n = list.get(i);
            Boolean b = n % 2 == 0 ? true : false;
            if (b) {
                list2.add(n);
            } else {
                continue;
            }
        }
        return  list2;
    }
}
