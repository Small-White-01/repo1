package jmore1;
import java.util.ArrayList;
import jmore1.Students;
public class demo04ARP2 {
    public static void main(String[] args) {
        ArrayList<Students> list=new ArrayList<>();
        String[] arrayn={"aaa","bbb","ccc","ddd"};
        int[] arraya={1,23,4,44};
        for (int i = 0; i < 4; i++) {
            list.add(new Students(arrayn[i],arraya[i]));
        }

//        for (int i = 0; i <list.size() ; i++) {
//            list.get(i).getter();
//
//        }
        //int的包装类的使用,效果与Integer相同
//        Integer[] array={1,23,4};
//        System.out.println(array[0]);1
//        System.out.println(array[1]);23
//        System.out.println(array[2]);4

    }


}
