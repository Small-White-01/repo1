package jiekou;
//不再是子类与父类的叫法了，而是实现类与接口名称的叫法
public class Achieve2 implements AAAinterface{
    public Achieve2() {
        System.out.println("创建Achieve2对象成功");
        System.out.println("Achieve2对象端口号为" + AAAinterface.PORT);
    }
    @Override
    public void method() {
        System.out.println("方法成功");
    }

//    @Override
//    public void method1() {
//        System.out.println("方法1成功");
//    }
//
    @Override
    public void method2() {//默认方法也可改写
        System.out.println("新的方法2成功");
    }
}
