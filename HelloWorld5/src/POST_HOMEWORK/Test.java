package POST_HOMEWORK;
import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
public class Test {
    public static void main(String[] args) {
        Calendar gr=Calendar.getInstance();
        gr.set(2021,2,18,16,38,40);
        Date d=gr.getTime();
        System.out.println("时间截止至"+d);

        Homework hw=new Homework();
        Teachers tc=new Teachers(hw);
        hw.total_count=new Scanner(System.in).nextInt();
        System.out.println("我要"+hw.total_count+"份语文作业");
        tc.start();


        ExecutorService es=Executors.newFixedThreadPool(3);//线程池
        for (int i = 0; i < 50; i++) {
            es.submit(new StudentsRunnable(i+1+"号任务",hw));
        }
        while(true){
            if(hw.count==hw.total_count){
                System.out.println("总任务完成");
                break;
            }
            if(System.currentTimeMillis()==d.getTime()){
                System.out.println("时间已截止"+",还有"+(hw.total_count-hw.count)+"未完成");
                es.shutdown();//此方法线程将不接收新任务，只完成当前50个任务，shutdownNow将中断所有任务

                break;
            }

        }











    }
}
