package jmore1;
import java.util.Random;
import java.util.Arrays;
public class demosort {
    public static void main(String[] args) {
        //Arrays方法
        int[] arr={1,2,3};
        String str=Arrays.toString(arr);
        System.out.println(str);
        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i));

        }
        String s="ABCDEFGabcdefg123456";
        String result="";
        char[] carr=s.toCharArray();
        Random r=new Random();
        for (int i = 0; i <6 ; i++) {
            result+=carr[r.nextInt(s.length())];

        }
        char[] cre=result.toCharArray();
        Arrays.sort(cre);
        System.out.print(cre);
        System.out.println();
        for (int i = cre.length - 1; i >= 0; i--) {
            System.out.print(cre[i]);
        }
    }
}
