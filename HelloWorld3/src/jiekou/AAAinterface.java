package jiekou;
//调用接口常量需直接接口名.常量名
//接口所有方法只能供实现类调用，自己本身不能new创建对象
//抽象方法是接口中最重要的
//接口创建的抽象方法，是public abstract
//接口升级：现实中，Achieve与Achieve2实现了method，但接口升级多了两种方法，这两类已实现无法更改，
//        此时要使两种方法成为默认方法,可供实现类直接调用

//下面的如public黑色字体，是因为可省略。接口本来是公共的，public一定可省
public interface AAAinterface {
    //定义接口常量，final是不可变的意思，
    public static final int PORT=30;//常量必须全大写
    //抽象方法
    public abstract void method();
    //默认方法
    public default void method1(){System.out.println("新的默认方法1");defaultCommon();};
    public default void method2(){System.out.println("新的默认方法2");};
    //静态方法
    //一个实现类可以用多个接口，若调用静态方法可能会产生冲突，与子类只能有一个父类不一样。
    public  static void jingtai(){System.out.println("静态方法1执行！");staticCommon();}


    //私有方法，不让实现类调用，防止篡改，只供本接口默认方法与静态方法调用
    private void defaultCommon(){
        System.out.println("aaaaaaadefault");
    }
    private static void staticCommon(){
        System.out.println("bbbbbbbstatic");
    }
}
