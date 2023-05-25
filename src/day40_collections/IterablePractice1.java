package day40_collections;

import java.util.*;

public class IterablePractice1 {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10));

        Iterator<Integer>iterator = list.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        System.out.println("--------------while--remove--------------------------");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed","ahmed", "aHmed", "John", "Ercon", "Daniel", "ahmed", "Yulliia", "Cris"));

        // remove all Ahmed (does not matter Register

        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            String each = it.next();
            if(each.equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }
        System.out.println(names);

        System.out.println("------------removeIf---------------------------------------------");

        List<String> namess = new ArrayList<>();
        namess.addAll(Arrays.asList("Ahmed","ahmed", "aHmed", "John", "Ercon", "Daniel", "ahmed", "Yulliia", "Cris"));

        namess.removeIf( p-> p.equalsIgnoreCase("ahmed"));
        System.out.println(namess);

        System.out.println("--------------------------------------------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,8));

        // find the n-th the largest number

        int n = 5;


        for (int i = 0; i < n-1; i++) {
            numbers.removeIf(p -> Collections.max(numbers)== p);
        }
        int max = Collections.max(numbers);
        System.out.println(max);

    }

}
