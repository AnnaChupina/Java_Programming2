package day12_customMethods;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String first = input.next();          //String first = "cyDEo";
        // if I thing that it can include spaces input.next().trim()
        // or input.nextLine().trim().replace(" ", ""); delete spaces inside name
        System.out.println("Enter your last name");
        String last = input.next();             //String last = "SCHOOL";

        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        // getting first character of first name + the remaining characters of the first name;

        last = last.substring (0,1).toUpperCase() + last.substring(1).toLowerCase();

        String full_name = first +" " + last;
        System.out.println(full_name);

        System.out.println(first);
        System.out.println(last);






    }
}


/*Warmup tasks:
	1. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School


 */