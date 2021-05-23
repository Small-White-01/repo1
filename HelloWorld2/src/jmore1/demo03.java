package jmore1;
import jmore1.Person1;
public class demo03 {
    public static void main(String[] args) {
        Person1[] array=new Person1[3];
        String[] arrayn={"aaa","bbb","ccc"};
        int[] arraya={12,34,122};
        for (int i = 0; i < array.length; i++) {
            array[i]=new Person1(arrayn[i],arraya[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(array[i].getName()+":"+array[i].getAge());
        }
    }
}
