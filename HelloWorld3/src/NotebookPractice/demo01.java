package NotebookPractice;

public class demo01 {
    public static void main(String[] args) {
        Notebook N=new Notebook();
        USBinterface M=new Mouse();
        USBinterface K=new Keyboard();
        Keyboard K1=new Keyboard();

        N.useDevice(M);
        System.out.println("---------");
        N.useDevice(K);
        System.out.println("---------");
        N.useDevice(K1);//K1小范围对象，转为大范围USBinterface，USBinterface m=K1，相当于int-->double




    }

//    public static void useUSB(USBinterface m){
//        if(m instanceof Mouse){
//            Mouse mouse=(Mouse) m;
//        }else if(m instanceof Keyboard){
//            Keyboard keyb=(Keyboard) m;
//        }
//        m.open();
//        m.work();
//        m.close();
//    }


}
