package day09_scanner;
import java.sql.SQLOutput;
import java.util.Scanner;

public class NextLineMethodPractice {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter yout full name");

        String full_name = input.nextLine();

        System.out.println("Enter your School name");
        String school_name = input.nextLine();

        System.out.println("Enter your gender:");
        String gender = input.next();

        System.out.println("Enter your agr: ");
        int age = input.nextInt();

        input.nextLine();   // Clear the scanner
        // we have to give extra nextLine () method after the other method of scanner

        System.out.println("Enter your street name: ");
        String street = input.nextLine();






    }
}
