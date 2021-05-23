package jmore1;
import jmore1.Students;
public class demostatic {
    public static void main(String[] args) {
        Students su=new Students();
        su.setName("aaa");
        su.setAge(12);
        //System.out.println(su.getName()+"学号为"+su.getId());
        System.out.println(su.getName()+"学号为"+su.getId());

        Students su2=new Students("bbb",33);
        System.out.println(su2.getName()+"学号为"+su2.getId());
        ConeStudent s2=new ConeStudent();
    }
}
