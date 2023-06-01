package day38_exceptions;

import java.io.FileInputStream;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException,  java.io.FileNotFoundException {

        /*
        System.out.println("Program 1 started");

      //  System.out.println(100/0);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Program 1 ended");

        System.out.println("----------------------------");

        System.out.println("Program 2 started");

        //  System.out.println(100/0);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Program 2 ended");

         */

        System.out.println("Program 1 started");

        Thread.sleep(5000);

        System.out.println("Program 1 ended");

        System.out.println("------------------------------");

        System.out.println("Program 2 started");

        Thread.sleep(1000);

        System.out.println("Program 2 ended");

        System.out.println("------------------------------");

        System.out.println("Program 3 started");

        //FileInputStream file = new FileInputStream("");
        Thread.sleep(1000);

        System.out.println("Program 3 ended");

    }
}
