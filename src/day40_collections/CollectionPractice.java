package day40_collections;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        Collection <Integer> collection1 = new ArrayList<>();
        collection1.add(100);
        collection1.addAll(Arrays.asList(100, 200, 200, 300, 400, 500, 600, 700));

        System.out.println(collection1);

        System.out.println( ((ArrayList) collection1).get(2));

        //System.out.println( ((Stack)collection1).pop() );

        System.out.println("-------------------------------");

        Collection<Integer> collection2 = new HashSet<>();
        collection2.addAll(Arrays.asList(100, 200, 200, 300, 400, 500, 600, 700));

        System.out.println(collection2);

        // System.out.println(  ((ArrayList)collection2).get(4)   );

        System.out.println( new ArrayList<>(collection2).get(4) );

        List<Integer> l = new ArrayList<>(collection2);




    }
}
