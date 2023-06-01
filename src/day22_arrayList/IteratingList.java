package day22_arrayList;

import java.util.ArrayList;

public class IteratingList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3,255);
        int a = 1;
        numbers.remove(a);
        System.out.println("aaaaaaaaaaaaaaaaaaa");

       // numbers.add(300,2000);

        System.out.println(numbers);

        System.out.println("-----------------------");

        for( int i =0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("----------------------");

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }

        System.out.println("------------------------------");

        for (Integer number : numbers) {
            
        }


        }


    }

