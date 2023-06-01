package day06_ifStatements;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 100;

        boolean isEven = number%2 == 0; // When we divide a number by 2, if the reminder is 0, meansthe nubmer is even

        //   boolean isOdd = number%2 != 0;

        boolean isOdd = !isEven;

        System.out.println(number + " is an even number: " + isEven);
        System.out.println(number + " is an odd number: " + isOdd);





    }

}
/* 1. Warmup task:
	1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20

			output:
				20 is an even number: true
				20 is an odd number: false

		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)
 */