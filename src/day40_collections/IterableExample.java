package day40_collections;

import java.util.*;

public class IterableExample {

    public static void main(String[] args) {

        List<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3,  4, 65 , 44, 6, 84, 84, 55, 5, 1, 4));

        /*
        for (Integer each : list) {
            if(each < 5){
                list.remove(each);
            }
        }
        System.out.println(list);
*/

        for (int i = 0; i < list.size(); i++) {
           if(list.get(i) < 5){
               list.remove(i);
           }
        }
        System.out.println(list);

        System.out.println("-------------------------------");

        List<Integer>list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3,  4, 65 , 44, 6, 84, 84, 55, 5, 1, 4));

        Iterator<Integer> it = list2.iterator();
        while(it.hasNext()){
            Integer each = it.next();
            if(each < 5){
                it.remove();
            }
        }
        System.out.println(list2);

        System.out.println("----------------------------------------------");
// remove all elements that less than 5, without "while"

        List<Integer>list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1, 2, 3,  4, 65 , 44, 6, 84, 84, 55, 5, 1, 4));

        for( Iterator <Integer> i = list3.iterator(); i.hasNext() ;){
            Integer each = i.next();
            if (each < 5){
                i.remove();
            }
        }
        System.out.println(list3);

        System.out.println("----------------removeIt-ArrayList-----------------------------");

        List<Integer>list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1, 2, 3,  4, 65 , 44, 6, 84, 84, 55, 5, 1, 4));

        list4.removeIf( each -> each < 5);

        System.out.println(list4);

        System.out.println("----------------removeIt-LinkedList-----------------------------");

        List<Integer>list5 = new LinkedList<>();
        list5.addAll(Arrays.asList(1, 2, 3,  4, 65 , 44, 6, 84, 84, 55, 5, 1, 4));

        list5.removeIf( p -> p < 5);
        System.out.println(list5);


    }
}
