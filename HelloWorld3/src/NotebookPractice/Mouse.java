package NotebookPractice;

public class Mouse implements USBinterface{

    public void click() {
        System.out.println("点击");
    }
    @Override
    public void open(){
        System.out.println("打开鼠标设备");
    }
    @Override
    public void close(){
        System.out.println("关闭鼠标设备");
    }

}
