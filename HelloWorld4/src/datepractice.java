import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class datepractice {
    //计算一个人活了多少天;
    public static void main(String[] args)throws ParseException {
        Scanner sc=new Scanner(System.in);
        String birth=sc.next();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date dbirth=sdf.parse(birth);
        System.out.println(dbirth);

        long dbirthnum=dbirth.getTime();
        long dnum=new Date().getTime();
        long last=dnum-dbirthnum;

        System.out.println("生存了："+last/1000/60/60/24);
//        Date d=new Date();
////        long before=d.getTime();
//        System.out.println(before);
//        for (int i = 0; i <99 ; i++) {
//            System.out.println(i);
//        }
////        long after=d.getTime();
////        System.out.println(after);
//
//        System.out.println("功耗时间："+(after-before)+"毫秒");

    }




}
