package day14_forLoop;

import java.util.Scanner;

public class ForLoopPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;


/*
        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number");
            sum += input.nextInt();

        }
        System.out.println("sum = " + sum);



 */
        //write a programm that can ask the enter a number for five times, print the maximum number

        //write a programm that can ask the enter a number for five times, print the minimum number
        int max = 0;
        for (int i = 0; i <= 5; i++) {
            System.out.println("Enter a number");
            int f = input.nextInt();
            if(max<f){
               max=f ;
            }

        }
        System.out.println("max is: " + max);

        System.out.println("Enter a number");
        int min = input.nextInt();;
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter a number");
            int f = input.nextInt();
            if(f<min){
                min=f ;
            }

        }
        System.out.println("min is: " + min);

    }

}
