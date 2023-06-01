package day12_customMethods;

public class hw1_emailDomain {
    public static void main(String[] args) {
        domain("artanna@mail.ru");
        capitalization("saSS", "AlexxX");
        monthName(4);
        day(5);
        monthDay("December");
        eligibleToVote(15, true);
        salary(45,40);

    }

    public static void domain(String email){
        System.out.println((email.substring(email.indexOf("@")+1, email.indexOf("."))));
    }
    public static void capitalization( String firstName, String lastName){
        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

         System.out.println(firstName+" "+ lastName);
    }

    public static void monthName(int monthName){
        switch (monthName) {
            case 1:
                System.out.println("Jenuary");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid number");
        }
    }

    public static void day(int day){
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Number");
        }




        }

    public static void monthDay(String month) {
        month = month.substring(0, 1).toUpperCase() + month.substring(1).toLowerCase();
        int dayMonth = 30;

        if (month.contains("Jenuary") || month.contains("March") || month.contains("May") || month.contains("July") ||
                month.contains("August") || month.contains("October") || month.contains("December")) {
            dayMonth = 31;
        } else if (month.contains("February")) {
            dayMonth = 28;
        }

        System.out.println(month + " has " + dayMonth + " days");
    }

    public static void eligibleToVote(int age, boolean isAmerican){
        if (age >=21 && isAmerican){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }
    }

    public static void salary( double hourlyRate, int weeklyHours){
        System.out.println("You make $" + hourlyRate + " per hour\nYou work "+ weeklyHours+
                " hours in a week\nYour gross income is $"+ hourlyRate*weeklyHours*52);
    }
//You make $45.0 per hour
//            You work 40 hours in a week
//            Your gross income is $93600.0



    }




