package jiekou;
//不再是子类与父类的叫法了，而是实现类与接口名称的叫法
public class Achieve implements CCCinterface{

    public Achieve(){
        System.out.println("创建Achieve对象成功");
        System.out.println("Achieve对象端口号为"+AAAinterface.PORT);
        System.out.println();
        AAAinterface.jingtai();
    }
    @Override
    public void method() {
        System.out.println("方法成功");
    }
//
//    @Override
//    public void method1() {
//        System.out.println("方法1成功");
//    }
//
//    @Override
//    public void method2() {
//        System.out.println("方法2成功");
    }

