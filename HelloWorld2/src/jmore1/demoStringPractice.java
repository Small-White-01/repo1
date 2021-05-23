package jmore1;
import java.util.Scanner;
import java.util.ArrayList;
//输入字符串，统计各个字符出现次数
public class demoStringPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sum(sc);
    }


    public static void sum(Scanner sc){
        String str =sc.next();
//        ArrayList<String> list=new ArrayList<>();
//        ArrayList<String> list2=new ArrayList<>();
//        for (int i = 0; i <str.length() ; i++) {
//            list.add(str.charAt(i)+"");
//
//        }
//        for (int i = 0; i <list.size() ; i++) {
//            int num=0;
//            for (int j = i+1; j <list.size() ; j++) {
//                //Boolean b=list.get(i)==list.get(j)?true:false;
//                if(list.get(i).equals(list.get(j))){//不能用==，比较的是地址
//                    num++;
//
//                    list.remove(j);
//                }
//
//            }
//            num++;
//            list2.add(list.get(i)+":"+num);
//
//        }
//
        int upper=0;
        int lower=0;
        int digital=0;
        int other=0;
        char[] carr=str.toCharArray();
        for (int i = 0; i < carr.length; i++) {
            if(carr[i]>='A'&&carr[i]<='Z'){
                upper++;
            }else if(carr[i]>='a'&&carr[i]<='z'){
                lower++;

            }else if(carr[i]>='0'&&carr[i]<='9'){
                digital++;
            }else{
                other++;}
        }
        System.out.println("upper:"+upper);
        System.out.println("lower:"+lower);
        System.out.println("digital:"+digital);
        System.out.println("other:"+other);
//
//            list.add(carr[i]+":"+num);
//        }
//        System.out.println(list2);

    }
}
