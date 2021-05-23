package innerclasspractice;
//内部类：如汽车必须要有发动机，人类必须要有心脏

//成员内部类
//局部内部类（包含匿名内部类）
public class Innerclassdemo01 {
    public static void main(String[] args) {
        //间接访问内部类
        IC ic=new IC();
        ic.indirect_toinnerclass();
        //直接访问外部类
        IC.innerclass in=new IC().new innerclass();
        in.prin(20);
        //访问局部内部类
        ic.outer();
        //匿名内部类,
        Iface1 iface=new Iface1() {
            @Override
            public void method() {
                System.out.println("大括号里的是匿名内部类");
            }
        };
        //也可以匿名对象
        new Iface1(){

            @Override
            public void method() {
                System.out.println("匿名内部类的匿名对象");
            }
        }.method();
    }
}
