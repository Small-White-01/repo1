package jiekou;

public interface BBBinterface {
    public static final int PORT=40;
    public default void method1(){System.out.println("新的默认方法1");}
    public  static void jingtai(){System.out.println("静态方法1执行！");}
}
