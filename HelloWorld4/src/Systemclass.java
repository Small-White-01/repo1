import java.util.ArrayList;
import java.util.Arrays;

public class Systemclass {

    public static void main(String[] args) {
        //测试程序效率
//        long be=System.currentTimeMillis();
//        for (int i = 0; i <10000 ; i++) {
//            System.out.println(i);
//
//        }
//        long af=System.currentTimeMillis();
//        System.out.println("共"+(af-be)+"毫秒");

        //arraycopy数组的覆盖
        int[] arr1={1,2,3};
        int[] arr2={4,5,6};
        System.out.println("复制前："+ Arrays.toString(arr2));//遍历数组
        System.arraycopy(arr1,1,arr2,2,1);//不能超出数组范围
        System.out.println("复制后："+ Arrays.toString(arr2));
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2[i]);
//
//        }
//
//        ArrayList<Integer> a1=new ArrayList<>();
//        ArrayList<Integer> a2=new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            a1.add(i+1);
//
//        }
//        for (int i = 5; i <10 ; i++) {
//            a2.add(i+1);
//
//        }
//        System.out.println(a1);
//        System.out.println(a2);
//
//        System.out.println("-------------");
//        System.arraycopy(a1,2,a2,4,4);//arraycopy: source type java.util.ArrayList is not an array
//        System.out.println(a2);








    }
}
