package day10_string;
import java.util.Scanner;

public class StringMerthods1 {

    public static void main(String[] args) {

        String str = "Cydeo";
        // index:     01234

        char firstChar = str.charAt(0);
        char second = str.charAt(1);
        char third = str.charAt(2);
        char fourth = str.charAt(3);
        char fifth = str.charAt(4);
        char g = str.charAt(str.length()-1);

        // char sixth = str.charAt(5);

        System.out.println("firstChar = " + firstChar);
        System.out.println("secondCgar = " + second);
        System.out.println("thirdCgar = " + third);
        System.out.println("ourthCgar = " + fourth);
        System.out.println("fifthCgar = " + fifth);

        System.out.println("_________________________");

        String sentence = "Java Programming Language";
        String ss = "ddd";
        int lff = ss.length();
        System.out.println(lff);
        int length = sentence.length();
        System.out.println(length);
        int lastIndex = length -1;
        System.out.println(lastIndex);

        System.out.println("___________________");
        String s1 = "Wooden Spoon";
        char f = s1.charAt(0);

        int lastIndexNum = s1.length() -1;
        char l = s1.charAt(lastIndexNum);

        System.out.println(f + " : " + l);

        System.out.println("______________________");

        String name1 = "Umran";
        String name2 = new String ("Umran");

        System.out.println(name1 ==name2);

        System.out.println(name1.equals(name2));


        System.out.println("__________________");

        String r1 = "Java";
        String r2 = "Java";
        String r3 = new String ("Java");

        System.out.println(r1==r2); // true
        System.out.println(r1==r3); // false
        System.out.println(r2==r3);// false

        System.out.println(r1.equals(r3)); // true

        System.out.println("_____________________");

        /*Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println("Are you a US citizen? yes/no");
        String answer = input.next();

        if(age >=21 && answer.equals("yes") = "yes"){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }*/







    }
}
