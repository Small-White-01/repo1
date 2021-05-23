package POST_HOMEWORK;
import java.util.Random;
public class Students extends Thread{
    String name;
    Homework hw;


    public Students(){}
    public Students(String name,Homework hw){
        this.name=name;
        this.hw=hw;

    }

    @Override
    public void run() {
        while(true) {
            synchronized (hw) {
                if(hw.count==hw.total_count){
                    try {
                        hw.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                    try {
                        Thread.sleep(new Random().nextInt(1000-500));//写作业
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(this.name + "交" + hw.name + "作业中");
                    hw.count++;
                    System.out.println(this.name + "交第"+hw.count+"份作业成功");
                    hw.notify();




            }
        }




            }

        }




