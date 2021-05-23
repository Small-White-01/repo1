import java.util.ArrayList;
public class StringBuilderclass {
    public static void main(String[] args) {
        //字符串缓冲区，字符串数据存储在一个数组，相对于字符串处理效率高，占用内存少
        StringBuilder sb=new StringBuilder("aaaadasdasd");
        sb.append(12);//看似可以修改字符串（字符串常量不变），实则是修改数组
        sb.delete(1,3);

        System.out.println(sb);//所有的打印实则是调用toString方法
        System.out.println(sb.toString());// Create a copy, don't share the array
    }
}
