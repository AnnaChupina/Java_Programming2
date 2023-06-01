package day06_ifStatements;
import java.util.Scanner;
public class ChooseLanguage {
    public static void main(String[] args) {
        //Enter your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!\nPlease enter your personal information\nEnter your first name");
        String firstName = scan.nextLine();

        System.out.println("Enter your last name");
        String lastName = scan.nextLine();
        String email;
        String street;

        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        email = scan.next();

        System.out.println("Enter your street");
        street = scan.nextLine();

        // continue for city
        scan.nextLine();

        System.out.println("Enter your city");
        String city = scan.nextLine();

        System.out.println("Enter your state");
        String state = scan.nextLine();

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();

        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();

        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Enter your height");
        double height = scan.nextDouble();

        System.out.println("Enter your weight");
        double weight = scan.nextDouble();

        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();

        scan.close();

        String contact = "work phone number: " + workPhoneNumber+ ", personal phone number: " +  personalPhoneNumber + ", email: " + email;

        String fullName = firstName + " " + lastName;

        String address = street+ ", " +city + ", "  + state + " "+ zipCode;

        System.out.println("Patient personal information\nFull name: " + fullName + "\nAddress: "+ address+"\nContact: "+ contact + "\nAge: " + age+ "\nHeight: " +height+ "\nWeight: " + weight+ "\nMarried: " + isMarried);




    }
}

