//import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Date;
public class demodate {
    public static void main(String[] args) {
    //GregorianCalendar gr=new GregorianCalendar();
   // System.out.println(gr.getTime().toString());

        Date d=new Date();
        System.out.println(d);
        String format = new SimpleDateFormat().format(d);
        System.out.println(format);

    }
}