package NotebookPractice;

public class Keyboard implements USBinterface{


    public void input() {
        System.out.println("敲击");
    }
    @Override
    public void open(){
        System.out.println("打开键盘设备");
    }
    @Override
    public void close(){
        System.out.println("关闭键盘设备");
    }
}
