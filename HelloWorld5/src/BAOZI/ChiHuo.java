package BAOZI;

public class ChiHuo extends Thread{
    Baozi bz;

    public ChiHuo(Baozi bz){
        this.bz=bz;
    }


    @Override
    public void run() {
        while (true){
            synchronized (bz){
                if(bz.count==0){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    try {
                        Thread.sleep(2000);
                        System.out.println("吃货正在吃包子");
                        bz.count--;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    bz.notify();
//                    bz.bool=false;




                }
            }
        }
    }
}
