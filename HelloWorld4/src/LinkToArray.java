import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.LinkedList;
public class LinkToArray<E> {
    //链表增删快查询慢
    //数组集合增删慢查询快


    //可以先创建链表，查询时再用array
    public ArrayList<E> linkToArray(List<E> li){

        ArrayList<E> arrr=new ArrayList<>();
        arrr.addAll(li);
        return arrr;
    }
    public ArrayList<E> linkToArray(List<E> ...vaarray){
        ArrayList<E> arrr=new ArrayList<>();
        //ArrayList<E>[] all=new ArrayList<E>[10];不能用泛型数组，不能保证每个ArrayList[]都是同一类型
        for(List<E> i:vaarray){


            arrr.addAll(i);


        }

        return arrr;
    }
}
