package NotebookPractice;

import java.security.Key;

public class Notebook {

    public void open(){
        System.out.println("开机");

    }
    public void close(){
        System.out.println("关机");
    }

    public void useDevice(USBinterface m){
        m.open();
        if(m instanceof Mouse){
            Mouse mouse=(Mouse) m;
            mouse.click();
        }else if(m instanceof Keyboard){
            Keyboard keyb=(Keyboard) m;
            keyb.input();
        }
        m.close();


    }
}
