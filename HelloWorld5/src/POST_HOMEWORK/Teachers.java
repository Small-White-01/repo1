package POST_HOMEWORK;
import java.util.Random;
import java.util.Scanner;
public class Teachers extends Thread {

    String name="班主任";
    Homework hw;

    public Teachers(Homework hw){
        this.name=name;
        this.hw=hw;

    }


    @Override
    public void run() {
        while(true){
            synchronized (hw){
                if(hw.count==0) {
                    try {

                        hw.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                try {
                    Thread.sleep(2000);
                    System.out.println(this.name+"批改作业中");
                    hw.count--;

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hw.notify();















            }


        }
        }


    }

