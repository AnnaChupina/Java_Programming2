package day15_whileLoop;

import java.util.Scanner;

public class MinumumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int min = 2147483647;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a nimber: ");
            int num = input.nextInt();

            if(num < min){
                min = num;
            }

        }
        System.out.println("Minimum number: " + min);
        input.close();




    }

}
