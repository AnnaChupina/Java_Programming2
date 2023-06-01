package day19_array;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AverangeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int total = input.nextInt();

        int[]  numbers = new int [total];
        int sum = 0;


        for (int i = 0; i < numbers.length; i++) {
            System.out.println(":enter a number: ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }
        double average =(double) sum / total;
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println(Arrays.toString(numbers));
        System.out.println("sum: " + sum);
        System.out.println("average: " + df.format(average));





    }
}


