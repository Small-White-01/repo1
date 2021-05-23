package jmore1;
import java.util.ArrayList;//是个集合，保存的内容是地址，可以随便改变长度，而数组不行
import java.util.List;
//ArrayList<E>中的E是泛型，泛型只能是引用类型
public class demo04 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();//不能使基本数据类型如int，只能是引用类型
        list.add("aaa");
        list.add("bbb");
        System.out.println(list);
        System.out.println("--------");
        String name=list.get(1);
        System.out.println(name);
        System.out.println("--------");
        list.remove(1);
        System.out.println(list);
        int size=list.size();
        System.out.println(size);

        System.out.println("---------------------------");
        //若要存放基本数据类型如byte int short，就要用对应的包装类(对int自动包箱)
        //byte-->Byte,int-->Integer,short-->Short,char-->character

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(1,30);
        System.out.println(list2);

    }
}
