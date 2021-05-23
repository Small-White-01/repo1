package Threadingclass;

public class demoThread01 {
    //如果只想重写 run() 方法，而不重写其他 Thread 方法，那么应使用 Runnable 接口。这很重要，
    // 因为除非程序员打算修改或增强类的基本行为，否则不应为该类创建子类。
    public static void main(String[] args) {
        runnerbleclass r=new runnerbleclass();
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);
        t1.start();
        t2.start();
        t3.start();





    }
}
