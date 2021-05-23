package POST_HOMEWORK;

import java.util.Random;

public class StudentsRunnable extends Thread implements Runnable {
    String name;
    Homework hw;
    int num=0;

    public StudentsRunnable() {
    }

    public StudentsRunnable(String name, Homework hw) {
        this.name = name;
        this.hw = hw;

    }

    @Override
    public void run() {
        while (this.num<20) {
            synchronized (hw) {

                try {
                        Thread.sleep(new Random().nextInt(100 - 50));//写作业
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                System.out.println(this.name + "交" + hw.name + "作业中");
                this.num++;
                hw.count++;
                System.out.println(this.name + "交第" + this.num + "份作业成功");
                hw.notify();



                }

            }System.out.println(this.name+":taskdone!");
        }}


