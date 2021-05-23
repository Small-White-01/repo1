package Collections;

import java.util.Collection;
import java.util.ArrayList;
public class Collectionclass {
    public static void main(String[] args) {
        Collection co=new ArrayList<>();
        co.add("aaa");
        co.add(1);
        co.add("ccc");
//        for (int i = 0; i < co.size(); i++) {
//            System.out.println(co.get(i));
//
//        }
        co.remove("aaa");
        System.out.println(co);

        Object[] obj = co.toArray();

        System.out.println(co.isEmpty());
        System.out.println(co.contains("bbb"));
        co.clear();
        System.out.println(co);
    }
}
