package Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistclass {
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();//不加泛型,能存放各种类型数据不安全，而且不能for遍历，只能判断各种对象类型再输出
        ar.add("aaaa");
        ar.add(2);
        ar.add("bbb");
        Iterator it=ar.iterator();//object类
        StringBuilder sb=new StringBuilder();
        while(it.hasNext()){
            Object o=it.next();
            if(o instanceof String){
                String s=(String)o;
                System.out.println(s);
            }else if(o instanceof Integer){
                int num=((Integer) o).intValue();
                sb.append(num);//sb.append(o)  -->2
                System.out.println(sb);
            }

        }
    }
}
