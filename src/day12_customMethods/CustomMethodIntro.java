package day12_customMethods;

public class CustomMethodIntro {
    public static void greetings() {
        System.out.println("Hello Cydeo");
        System.out.println(("How are you taday?"));
        System.out.println("Are you ready to earn Java?");
    }

        public static void main(String[] args){

        System.out.println("Test Started");

        greetings();

        System.out.println("Test Completed");
            System.out.println("______________");
            displayMessage();



    }

    public static void displayMessage(){
        System.out.println("Hello world");
        System.out.println("I love Java");
    }


}
