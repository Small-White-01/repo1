package BAOZI;

public class BaoZiPu extends Thread{
    Baozi bz;

    public BaoZiPu(Baozi bz){
        this.bz=bz;

    }

    @Override
    public void run() {
        while(true){
            synchronized (bz){
                if(bz.count>10){
                    try {
                        bz.wait();//进入waitset
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {


                    try {
                        System.out.println("包子铺正在制作包子"+"，现在有"+bz.count+"个"+bz.name+"包子");
                        bz.count++;
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

//                    bz.bool=true;
                    bz.notify();//唤醒waitset中的对象(从前往后)
                }
            }

        }
    }
}
