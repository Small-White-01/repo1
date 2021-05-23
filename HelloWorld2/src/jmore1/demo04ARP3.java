package jmore1;

import java.util.ArrayList;

public class demo04ARP3 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("10");
        list.add("20");
        list.add("30");
        printArrayList(list);
    }


    public static void printArrayList(ArrayList<String> list) {
        String str1="{";
        String str2="}";
        String str3="";
        for (int i = 0; i < list.size()-1; i++) {
            str3+=list.get(i)+"@";
        }
        System.out.println(str1+str3+list.get(list.size()-1)+str2);

    }
}