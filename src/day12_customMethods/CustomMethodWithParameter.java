package day12_customMethods;

public class CustomMethodWithParameter {
    public static void main(String[] args) {

        int num1 = 100;
        oddOrEven(num1);

        int num2 = 35;
        oddOrEven(num2);

        int num3 = 79;
        oddOrEven(num3);

        int num4 = 39;
        oddOrEven(num4);


    }

    // the method takes an artgument, and verifies if the number is odd or even number
    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }

    }

    // create a method that check if a person is eligible to buy alcohol
    public static void eligibleToAlcohol(int age) {
        if (age >= 21) {
            System.out.println("Eligible to buy alcohol");
        } else {
            System.out.println("Not eligible");
        }
    }


    // create a method that can check if a number is odd, or even or zero

    public static void isOdd(int num) {
        String result = "";
        if (num == 0) {
            result = "zero";
        } else if (num % 2 == 0) {
            result = "odd number";
        } else {
            result = "even number";
        }
        System.out.println(num + " is " + result);
    }

    // craete a method that calculate the grade of the students
    public static void score(int score) {
        char grade;
        if (score < 70) {
            grade = 'D';
        } else if (score < 80 && score >= 70) {
            grade = 'C';
        } else if (score < 90 && score >= 80) {
            grade = 'B';
        } else {
            grade = 'A';
        }
    }

}


