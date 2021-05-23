package jmore1;
import java.util.Random;
import java.util.Scanner;
public class demo2 {
    public static void main(String[] args) {
        Random r=new Random();
        int rannum=r.nextInt(100)+1;
        String str1;
        do{
            System.out.print("input:");
            int num=new Scanner(System.in).nextInt();

            if(num<rannum){
                str1="too small";
            }else if(num>rannum){
                str1="too big";
            }else{
                str1="true";
                break;
            }
            System.out.println(str1);
            continue;
        }while(true);
        System.out.println(str1);
    }
}
