import java.util.GregorianCalendar;
import java.util.Calendar;

public class Calendarpractice {
    public static void main(String[] args) {
        Calendar gr=Calendar.getInstance();//返回calendar子类对象
        System.out.println(gr.get(Calendar.DATE));
        System.out.println(gr.get(Calendar.MONTH)+1);//获取当前月份

        gr.set(2088,12,7,2,4,2);
        System.out.println(gr.getTime());

        gr.add(Calendar.YEAR,-2);
        System.out.println(gr.getTime());

    }
}
