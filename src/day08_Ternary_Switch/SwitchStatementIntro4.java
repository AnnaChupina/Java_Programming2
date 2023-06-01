package day08_Ternary_Switch;

public class SwitchStatementIntro4 {

    public static void main(String[] args) {

        int age = 84;
        String group = "";

        if( age >=1 && age <=2) {
            group = "infant";
        }
        if ( age >=3 && age <=5) {
            group = "Toddler";
        }
        if( age >=6 && age <=9) {
            group = "Kid";
        }
        if ( age >=10 && age <=12) {
            group = "Pre-Teen";
        }
        if( age >=13 && age <=17) {
            group = "Teenager";
        }
        if ( age >=18 && age <=20) {
            group = "Young Adult";
        }
        if( age >=21 && age <= 39) {
            group = "Teenager";
        }
        if ( age >=40 && age <=49) {
            group = "Young Middle-Aged Adult";
        }
        if( age >=50 && age <=54) {
            group = "Middle-Aged Adult";
        }
        if ( age >=55 && age <=64) {
            group = "Very Young Senior Citizen";
        }
        if ( age >=65 && age <=74) {
            group = "Young Senior Citizen";
        }
        if( age >=75 && age <=84) {
            group = "Senior Citizen";
        }
        if ( age >=85) {
            group = "Old Senior Citizen";
        }

    }

}
