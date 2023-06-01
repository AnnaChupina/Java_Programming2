package day16_nestedLoop;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        String u, p;
        int attemp = 3;
        do{
            System.out.println("Enter your username: ");
            u= input.next();
            System.out.println("Enter your password: ");
            p= input.next();
            attemp--;

            if(attemp == 0){
                break;
            }

        }while ( !( u.equals("Cydeo")&& p.equals("WoodenSpoon")) );   // while the credentials are invalid




     input.close();
    }
}
