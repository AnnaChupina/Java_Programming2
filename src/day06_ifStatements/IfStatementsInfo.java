package day06_ifStatements;

public class IfStatementsInfo {

    public static void main(String[] args) {

        int number = -100;
        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;

        if(isPositive) {
            System.out.println(number + " is positive number");
        }
        if (isNegative) {

            System.out.println( number + " is negative number");
        }


    }

}
