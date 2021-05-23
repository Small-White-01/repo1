import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Comparator;
public class demopri {
    public static void main(String[] args) {
        LinkedList<String> l1=new LinkedList<>();
        LinkedList<String> l2=new LinkedList<>();

        ArrayList<String> ar=new ArrayList<>();

//        l1.add("aaa");
//        l1.add("bbb");
//        l1.add("ccc");
//        l2.add("123");
//        l2.add("456");
//        l2.add("789");
        Collections.addAll(l1,"a","b","c");
        Collections.addAll(l2,"749","456","193");
        Collections.sort(l2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(1)-o2.charAt(1);//谁减谁排前面
            }
        });

        LinkToArray<String> lta=new LinkToArray<>();
        ar=lta.linkToArray(l1,l2);
        System.out.println(ar);
    }
}
