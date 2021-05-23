package Threadingclass;

public class MyThread extends Thread{
    public MyThread(){}
    public MyThread(String name){
        super(name);
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("线程执行"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(Thread.currentThread().getName());
    }
}
