package finalpractice;

public class demo01 {
    public static void main(String[] args) {

        demofinal d1=new demofinal("bbb",20);
        System.out.println(d1);
        d1=new demofinal("aaa",10);
        System.out.println(d1);
        final demofinal d=new demofinal("ccc",30);
        d.setNum(40);
        System.out.println(d.getNum());
        //d=new demofinal()报错
    }
}
