package jmore;
import java.util.ArrayList;
public class jextend {
    public static void main(String[] args) {
        //创建新员工
        Accountant Ac=new Accountant("aaa",22);
        System.out.println(Ac.getAge()+"的"+Ac.getName()+"，工号："+Ac.getId()+"，工资为："+Ac.getSalary());
        System.out.println("*******************");
        Seller S1=new Seller("bbb",23);
        System.out.println(S1.getAge()+"的"+S1.getName()+"，工号："+S1.getId()+"，工资为："+S1.getSalary());
        System.out.println("*******************");
        Seller S2=new Seller("ccc",24);
        System.out.println(S2.getAge()+"的"+S2.getName()+"，工号："+S2.getId()+"，工资为："+S2.getSalary());

        //员工进入列表（相应部门）
        ArrayList<Accountant> Alist=new ArrayList<>();
        Alist.add(Ac);
        ArrayList<Seller> Slist=new ArrayList<>();
        Slist.add(S1);
        Slist.add(S2);


        //会计人员工作
        Ac.work();
        //销售人员工作
        for (int i = 0; i <1000 ; i++) {
            S1.work();
        }
        for (int i = 0; i < 500; i++) {
            S2.work();
        }
        System.out.println("----------------");


        //发工资
        //System.out.println(S1.name+"的工资为"+S1.getSalary());
        //System.out.println(S2.name+"的工资为"+S2.getSalary());
        Ac.paywork();//发工资
        for (int i = 0; i < Alist.size(); i++) {
            Alist.get(i).getMoney();
            System.out.println("会计人员"+Alist.get(i).name+"的存款有："+Alist.get(i).getCunkuan());
        }
        for (int i = 0; i <Slist.size() ; i++) {
            Slist.get(i).getMoney();
            System.out.println("销售人员"+Slist.get(i).name+"的存款有："+Slist.get(i).getCunkuan());
        }





    }
}
