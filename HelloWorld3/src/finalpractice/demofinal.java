package finalpractice;

public class demofinal {



    //一旦final，不再变化
    //final成员变量，无法setter改变数值
    //final成员方法，后代子类无法修改此方法
    //final类,无法再用子类继承
    String name="kk";
    int num=10;
    public class finalcalss {
        public void prin(){
            System.out.println(demofinal.this.name);

        }

    }
    public demofinal(){}

    public int getNum() {
        return num;
    }

    public demofinal(String name, int num){
        this.name=name;
        this.num=num;

    }
    public void setNum(int num) {
        this.num = num;
    }
    /*final对象，由于对象是引用类型，存储的是地址值，（与基本类型存储的数值不一样），
     final后，无法再改变地址值，但里面的内容*/
}
