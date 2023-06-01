package day07_ifStatements;

public class MonthName {
    public static void main(String[] args) {

        int number = 2;

        String month ="";

        if(number >= 1 && number <= 12){
            if(number ==1)  month = "Jenuary";
            else if(number ==2) month = "February";
            else if(number ==3) month = "March";
            else if(number ==4) month = "April";
            else if(number ==5) month = "May";
            else if(number ==6) month = "June";
            else if(number ==7) month = "July";
            else if(number ==8) month = "August";
            else if(number ==9) month = "September";
            else if(number ==10) month = "October";
            else if(number ==11) month = "Novebber";
            else month = "December";

        }else
            month = "no such a month";
        System.out.println(month);







    }


}
/*
String result = "";

        if(number ==1) {
            result = "Jenuary";

        }
        if(number ==2) {
            result = "February";

        }
        if(number ==3) {
            result = "March";

        }
        if(number ==4) {
            result = "April";

        }
        if(number ==5) {
            result = "May";

        }
        if(number ==6) {
            result = "June";

        }
         if(number ==7) {
            result = "July";

        }
        if(number ==8) {
            result = "August";

        }
        if(number ==9) {
            result = "September";

        }
        if(number ==10) {
            result = "October";

        }
        if(number ==11) {
            result = "November";

        }
        if(number ==12) {
            result = "December";

        }

        System.out.println(result);
 */