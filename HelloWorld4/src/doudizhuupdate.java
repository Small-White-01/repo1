import java.util.*;
//相对于doudizhu，玩家存储的是int，通过hashmap键值对找到牌，属于有序牌组

public class doudizhuupdate {
    public static void main(String[] args) {
        HashMap<Integer,String> poker_dict=new HashMap<>();
        ArrayList<Integer> arr_index=new ArrayList<>();
        List<String> l1=List.of("3","4","5","6","7","8","9","10","J","Q","K","A","2");
        List<String> l2=List.of("红心","黑桃","钻石","梅花");

        int index=1;


        for(String s1:l1){
            for(String s2:l2){
                poker_dict.put(index,s1+s2);
                arr_index.add(index);
                index++;
            }
        }
        poker_dict.put(index,"大王");
        arr_index.add(index);
        index++;


        poker_dict.put(index,"小王");
        arr_index.add(index);
        index++;


        Collections.shuffle(arr_index);
        Collection co=arr_index;
        Iterator it=co.iterator();
        ArrayList<Integer> p1=new ArrayList<>();
        ArrayList<Integer> p2=new ArrayList<>();
        ArrayList<Integer> p3=new ArrayList<>();
        ArrayList<Integer> p4=new ArrayList<>();
        for (int i=0 ; i <co.size() ; i++) {
            Integer in=(Integer) it.next();
            if(i>=51){p4.add(in);}
            else if(i%3==0){p1.add(in);}
            else if(i%3==1){p2.add(in);}
            else if(i%3==2){p3.add(in);}

        }
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(p4);

        getPoker(p1,poker_dict);
        getPoker(p2,poker_dict);
        getPoker(p3,poker_dict);
        getPoker(p4,poker_dict);
    }
    public static void getPoker(ArrayList<Integer>poker,HashMap<Integer,String> h) {
        for (Integer in : poker) {
            System.out.print(h.get(in) + "\t");
        }
        System.out.println();
    }




}
