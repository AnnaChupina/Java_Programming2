package day07_ifStatements;

public class NestedIntro {

    public static void main(String[] args) {

        int score = -300;

        if (score >= 0 && score <= 100) {


            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid score");
        }

        System.out.println("____________________________");
        int day = 100;
        if (day >= 1 && day <= 7) {

        } else {
            System.out.println("Invalid date");
        }
    }
}





