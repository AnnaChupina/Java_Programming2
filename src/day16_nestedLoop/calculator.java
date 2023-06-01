package day16_nestedLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer="yes";

        while (answer.contains("yes")){
            System.out.println("Enter the first number");
            Double num1 = input.nextDouble();

            System.out.println("Enter a math operator -, +, *, /");
            char oper = input.next().charAt(0);

            while( !(oper== '-' || oper == '+' || oper=='*' || oper =='/')){
            System.err.println("Invalid operator, please re-enter");
             oper = input.next().charAt(0);
        }
            System.out.println("Enter the second number");
            Double num2 = input.nextDouble();
            switch(oper){
            case '-':
                System.out.println(num1-num2);
                break;
            case '+':
                System.out.println(num1+num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            }

            /*
            DOUBLE RESULT = (oper == '+')? num1 = num2 " (oper == '-')? num1 - num2  : (oper=='*")? num1* num2 : num1/num2;
             */

            System.out.println("Would you like to continue?  Yes/No");
            answer = input.next().toLowerCase();

            while(!(answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid entry! Would you like to enter another number?  Yes/No");
                answer = input.next().toLowerCase();
            }

        }





       input.close();
    }
}

