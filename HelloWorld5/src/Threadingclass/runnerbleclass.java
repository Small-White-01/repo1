package Threadingclass;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class runnerbleclass implements Runnable{
    private int ticket=100;
    Lock r=new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            r.lock();
            if (ticket > 0) {
                try {
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket);
                    ticket--;
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();


                } finally {
                    r.unlock();
                }
            }
        }
    }


    //Object obj=new Object();
   // @Override
//    public void run() {
//        while(true) {
//                synchronized (obj) {
//                    if(ticket>0){
//
//
//
//                        try {
//                            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket);
//                            ticket--;
//                            Thread.sleep(1000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//
//                    }
//
//
//                }
//
//        }


        //System.out.println(Thread.currentThread().getName());
    //}
}
