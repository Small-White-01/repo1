package Multi;

public class demomulti1 {
    public static void main(String[] args) {
        //多态：对象的向上转型，如猫视为动物
        //优点：左边代码固定不变，只需变右边的即可，相当于父类分配对象到子类去做不同事情
        //缺点：子类特有方法，视为父类的对象不能调用，此时需要对象的向下转型（强制类型转换），变回子类
        //对象即是父类也是子类，多态
        Fu obj=new Zi();
        System.out.println(obj.num);//调用父类变量
        obj.method();//调用子类方法(若覆盖了父类方法)，没有再往上调用父类方法(父类方法必须存在)
        //obj.method1();报错，父类相应方法必须存在
    }

}
