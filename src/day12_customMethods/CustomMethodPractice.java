package day12_customMethods;

public class CustomMethodPractice {
    public static void main(String[] args) {

     maxNum(10000,5000);

     inicials("Anna","Chupina");
    }
    // create method that can print the maximum number between two numbers, if both are equal then prints "Equal"
    public static void maxNum(double n1, double n2){
        if(n1>n2){
            System.out.println(n1 + " is maximum number");
        }else if(n2>n1){
            System.out.println(n2 + " is maximum number");
        }else {
            System.out.println("Equal");
        }
    }

    // Create a method than can display the initials of a person
    public static void inicials(String firstName, String lastName){
        String initial = firstName.charAt(0) + "." + lastName.charAt(0) + ".";

         System.out.println("initial is " + initial);
    }

}


