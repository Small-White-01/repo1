package paymoney;
import java.util.ArrayList;
public class demo {
    public static void main(String[] args) {
        Manager M=new Manager("zhangsan",1000);
        ArrayList<Employee> elist=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            elist.add(new Employee(i+1+"员工",0));
        }
        ArrayList<Integer> cashlist=M.send(100,5);
        for (int i = 0; i < elist.size(); i++) {
            elist.get(i).recieve(cashlist);

        }


        }
    }

