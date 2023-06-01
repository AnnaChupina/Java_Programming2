package day05_operators;

public class RelationalOperators {

    public static void main(String[] args) {

        int a = 1000;
        int b = 200;
    //    System.out.println( a > b );
        boolean aIsGreater = a > b ;

        System.out.println(aIsGreater);

        System.out.println("____________________________");

        int score = 65;

        boolean passed = score >= 60;

        System.out.println(passed);

        System.out.println("__________________________");

        int age = 21;

        boolean eligebleToBuyAlcohol = age >= 21;

        System.out.println(eligebleToBuyAlcohol);

        System.out.println("____________________");

        System.out.println(100 < 2000);
        System.out.println(100 < 20);

        System.out.println("____________________");

      //  System.out.println("Java" <= "C#");  // >, <, >=, <= can only be applicable for numbers

        System.out.println('a' < 'b');
       //                   65  >  66







    }

}
