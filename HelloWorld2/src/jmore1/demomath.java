package jmore1;

public class demomath {
    public static void main(String[] args) {
        System.out.println(Math.ceil(3.14));//4.0
        System.out.println(Math.ceil(3.5));//4.0
        System.out.println(Math.floor(3.14));//3.0
        System.out.println(Math.floor(3.6));//3.0
        System.out.println(Math.abs(-3.14));//3.14
        System.out.println(Math.round(3.14));//3
        System.out.println(Math.round(3.5));//4


        System.out.println(Math.PI);


        //practise,-10.8~5.9中，绝对值大于6或小于2.1的整数个数
        double min=-10.8;
        double max=5.9;
        int num=0;
        for (int i = (int)min; i <max ; i++) {
            if(Math.abs(i)>6||Math.abs(i)<2.1){
                num++;

            }

        }
        System.out.println("整数个数为:"+num);




    }
}
