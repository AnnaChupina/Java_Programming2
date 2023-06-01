package day05_operators;

public class LogicalOperators {

    public static void main(String[] args) {

        double salary = 60000;
        int creditScore = 650;
        int age = 25;


        boolean eligibkleForLoan = salary >= 30000 && creditScore >=650 && age >=18;

        System.out.println(eligibkleForLoan);

        char grade = 'B';
        boolean passedExam = grade == 'A' || grade == 'B' || grade=='C' || grade == 'D';

        System.out.println(passedExam);
        System.out.println("____________________________");

        System.out.println(!true);
        String a = "yes";
        boolean yes = a == "yes"; //true
        boolean no = !yes; // false

        System.out.println("yes = " + yes);
        System.out.println("no = " + no);

        System.out.println("____________________________");

        int score = 65;
        boolean passed = score >=60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

        System.out.println("____________________________");

        System.out.println( true ==!false && false == !true && true !=!true);
        //                       true     &&      true      &&       true

    }

}
