package day10_string;

import java.util.Scanner;
import java.lang.String;


public class StringIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "Java";

        System.out.println();
        input.close();
        System.out.println("__________________");

        String s1 = "Cat";
        String s2 = "Dog";

        String s3 = "Cat";
        String s4 = "Cat";

        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s3==s4);

        System.out.println("__________________");

        String str1 = new String("Java"); // Cfreates two objects: 1. String pool, 2. in HEAP (outside a pool);
        String str2 = new String("Java");
        System.out.println( str1==str2); // never the same

        System.out.println("_________________________");

        String t1 = "Pyton";
        String t2 = new String("Python");
        System.out.println(t1==t2);



    }


}
