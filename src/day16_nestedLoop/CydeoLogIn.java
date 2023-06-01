package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String u = input.next();

        System.out.println("Enter your password");
        String p = input.next();

        if (u.equals("Cydeo") && p.equals("Cydeo123")){
            System.out.println("Logged in");
        }else{
            for (int i = 1; i <3; i++) {
                if(i!=2){

                System.err.println("Incorrect, please re-enter");
                }else{
                    System.err.println("Incorrect! This is you last attend");
                }
                System.out.println("Enter your username: ");
                u = input.next();
                System.out.println("Enter your password: ");
                p = input.next();

                if (u.equals("Cydeo") && p.equals("Cydeo123")) {
                    System.out.println("Logged in");
                    break;
                }

            }
            if( ! (u.equals("Cydeo") && p.equals("Cydeo123") ) ){
                System.err.println("Your account now is locked");
            }
        }



        input.close();
    }

    public static void cydioLogIn(String u, String p){
        if (u.equals("Cydeo") && p.equals("Cydeo123")) {
            System.out.println("Logged in");
        }else{
            System.out.println("Invalid credentials");
        }
    }

}
