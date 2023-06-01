package day37_exceptions;

import day35_polymorphism.TransportationTask.Car;

public class MultiCatchBlock {

    public static void main(String[] args) {

        System.out.println("Program 1 started");

        Car car = null;
        try {

            car.drive();
        } catch( ArithmeticException e){
            System.out.println("First catch block");
            e.printStackTrace();
        } catch(ClassCastException e ){
            System.out.println("Second Catch block");
            e.printStackTrace();
        } catch(NullPointerException e){
            System.out.println("Third block");
            e.printStackTrace();
        }catch(IndexOutOfBoundsException e){
            System.out.println("Fourth catch block");
            e.printStackTrace();
        }catch( RuntimeException e){
            System.out.println("Fifth catch block");
            e.printStackTrace();
        }
        System.out.println("Program 1 ended");

 /*    can't allowed, because for each try have to be at least one catch block
        try {

        } catch(RuntimeException e){

        }try{

        }try{

        }try{

        }try{

        }

  */

    }

}
