package day07_ifStatements;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class MultiBranchIf {

    public static void main(String[] args) {

        int num = 100;

        String result = "";

        if(num > 0){
            result = "Positive";
        }
        if(num < 0){
            result = "Negative";
        }
        if (num==0){
            result = "Zero";
        }
        System.out.println(result);

        System.out.println("_________________________________");
        String result2 =";";

        if(num > 0) {
            result2 = "Positive";
        }else if(num < 0) {
            result2 = "Negative";

        }else{
            result2 = "Zero";
            }
        System.out.println(result2);
        }







    }






