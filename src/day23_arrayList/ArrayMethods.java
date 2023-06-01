package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMethods {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        array[0]  = 100;
        System.out.println(Arrays.toString(array));

        System.out.println("---------------------------------");

        ArrayList<String> groceriasList = new ArrayList<>();
        groceriasList.add("Eggs");
        groceriasList.add("paper Towels");
        groceriasList.add("Apples");
        groceriasList.add("Coocing oil");


        System.out.println(groceriasList);

        // groceriasList[2] = "oranges";
        groceriasList.set(2, "Oranges");

        System.out.println(groceriasList);

        groceriasList.add(2,"Oranges");

        System.out.println(groceriasList);

        groceriasList.remove(0);
        System.out.println(groceriasList);

        groceriasList.remove("paper Towels");
        System.out.println(groceriasList);

        System.out.println("--------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);  // 1
        numbers.add(20);  // 2
        numbers.add(30);  // 3
        numbers.add(40);  // 4
        numbers.add(50);  // 5

        boolean r1 = numbers.remove(Integer.valueOf(10));

        System.out.println(numbers);
        System.out.println(r1);

        numbers.clear();

        System.out.println(numbers);
        System.out.println(numbers.size());

        System.out.println("--------------------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasil");
        names.add("Vasil");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println(names.indexOf("Vasil"));
        System.out.println(names.lastIndexOf("Vasil"));

        System.out.println(names.lastIndexOf("Sumeye"));

        boolean hasMuhtar = names.contains("Muhtar");
        boolean hasAli = names.contains("Ali");

        System.out.println("hasMuhtar = " + hasMuhtar);
        System.out.println("hasAli = " + hasAli);

        System.out.println("----------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;
        System.out.println(list2 == list1);

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(10);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l1.equals(l2));
        
        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);
        
        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        System.out.println("-------------------");
        System.out.println(n1.equals(n2));

        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());
        











    }
}
