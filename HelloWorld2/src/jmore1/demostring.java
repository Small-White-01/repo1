package jmore1;
//字符串其实是由字符数组形成，底层原理是由字节数组(二进制)形成
public class demostring {
    public static void main(String[] args) {
        //直接创建字符串
        System.out.println("----------------------");
        String s=new String("ABC");
        System.out.println(s);

        //根据字符数组创建字符串
        System.out.println("----------------------");
        char[] carr={'A','B','C'};
        String s2=new String(carr);//字符数组转化为字节数组，字符串直接指向字节数组
        System.out.println(s2);

        //根据字节数组创建字符串
        System.out.println("----------------------");
        byte[] barr={65,98,99};//ascii二进制编码
        String s3=new String(barr);
        System.out.println(s3);

        //string比较方法
        System.out.println("----------------------");
        System.out.println(s==s2);//地址比较
        System.out.println(s.equals(s2));//内容比较
        System.out.println(s.equals(s3));
        System.out.println(s.equalsIgnoreCase(s3));//忽略大小写,如密码使用


        //string获取方法
        System.out.println("----------------------");
        System.out.println(s.length());
        System.out.println(s.concat(s2));//字符串拼接
        System.out.println(s.charAt(1));//索引
        System.out.println(s.indexOf('B'));//"B"也可，本来字符串其实是由字符数组形成,所以'B'也行

        //string截取方法
        System.out.println("----------------------");
        String str1="hello world";
        String str2;
        System.out.println(str1.substring(6));
        System.out.println(str1.substring(6,8));

        //string转化为字符数组
        System.out.println("----------------------");
        char[] chararray=str1.toCharArray();
        for (int i = 0; i < chararray.length; i++) {
            System.out.println(chararray[i]);

        }


        //string转化为字节数组
        System.out.println("----------------------");
        byte[] barray= str1.getBytes();
        for (int i = 0; i < barray.length; i++) {
            System.out.println(barray[i]);

        }

        //string字符替换
        System.out.println("----------------------");
        String newstr=str1.replace("or","@");
        System.out.println(newstr);

        //string分割字符串split，regex为正则表达式
        System.out.println("----------------------");
        String[] sarray=str1.split(" ");
        for (int i = 0; i < sarray.length; i++) {
            System.out.println(sarray[i]);

        }
        String n="aaa.bbb.ccc";//无法分割，由于正则.需要\\转义
        String[] narray=n.split("\\.");
        System.out.println(narray[0]);

    }
}
