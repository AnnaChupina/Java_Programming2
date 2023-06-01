package day10_string;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ShippingAdress {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String full_name = input.nextLine();

        System.out.println("Enter your building number");
        String buildingNumber = input.next();

        input.nextLine(); // to clear the scanner

        System.out.println("Enter your Street name");
        String street_name = input.nextLine();

        System.out.println("Enter your city name");
        String city = input.nextLine();

        System.out.println("Enter your state");
        String state = input.nextLine();

        input.nextLine();

        System.out.println("Enter your zip code");
        String zip = input.next();






        System.out.println("full_name = " + full_name);
        System.out.println("building number =  " + buildingNumber);
        System.out.println("street name = " + street_name);
        System.out.println("city= "+ city);
        System.out.println("state = " + state);

        System.out.println("__________________");
        System.out.println("Your shipping address is:");
        System.out.println("\t" + full_name);
        System.out.println("\t" + buildingNumber + " " + street_name);
        System.out.println("\t" + city + ", " + state + " " + zip);
        input.close();









    }
}
/*
Warmup tasks:
	1. Create a class named ShippingAddress and ask the user to:
	        1.1 Enter your full name ( nextLine() )
	        1.2 Enter your building number ( next() )
	        1.3 Enter your Street name ( nextLine() )
	        1.4 Enter your city name ( nextLine() )
	        1.5 Enter your state ( nextLine() )
	        1.6 Enter your zip code ( next() )

	        1.7 Display the shipping address
	                Ex:
	                    Your shipping address is:
	                        John Smith
	                        7925 Jones Branch Dr
	                        McLean, VA 22012

 */