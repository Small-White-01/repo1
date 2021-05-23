package jiekou;

public interface CCCinterface extends AAAinterface,BBBinterface{
    //public static final int PORT=30; 继承了A、B接口，静态变量与静态方法直接由父接口本接口调用AAAinterface.PORT
    public default void method1(){};
    //public static void jingtai(){};AAAinterface.jingtai()

}
