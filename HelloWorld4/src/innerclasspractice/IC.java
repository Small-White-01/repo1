package innerclasspractice;

public class IC {
    String name="kk";
    int num=10;
    //创建成员内部类
    public class innerclass {
        int num=30;
        public void prin(int num){//调用外部类变量需要通过方法实现
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(IC.this.name);

        }

    }
    public void indirect_toinnerclass(){
        innerclass in=new innerclass();
        System.out.println(in.num);
    }


    //创建局部内部类
    public void outer(){
        int num=10;//默认final不变
        //num=20;无法改变num，

        //局部变量在方法内，调用时在栈内存中，运行完随方法消失而消失
        //而new出来的i在堆内存中，待最后垃圾回收时才消失，所引用的值必须保证不变，否则会报错
        class Inner{


            public void method(){
                System.out.println(num);
            }
        }
        Inner i=new Inner();
        i.method();
    }
    public IC(){}

    public int getNum() {
        return num;
    }

    public IC(String name, int num){
        this.name=name;
        this.num=num;

    }
    public void setNum(int num) {
        this.num = num;
    }

}


