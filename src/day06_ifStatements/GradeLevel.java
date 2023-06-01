package day06_ifStatements;

public class GradeLevel {

    public static void main(String[] args) {

        int gradeLevrel =12;

        if(gradeLevrel >= 1 &&gradeLevrel <= 5) {
            System.out.println("Elementary School");
        }
        if (gradeLevrel >= 6 && gradeLevrel <= 8 ) {
            System.out.println("Middle school");
        }
        if (gradeLevrel >= 9 && gradeLevrel <= 12) {
            System.out.println("High school");
        }
        if(gradeLevrel >=13 && gradeLevrel <= 16) {
            System.out.println( "Coledge");
        }
        if (gradeLevrel >=17 && gradeLevrel <= 18) {
            System.out.println("Grad school");
        }



    }



}
/*
1. Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given, Write
a program to determine and print which school type someone is in

Ex:

gradeLevel = 2
output:
Elementary School
The grade level and types are:
1 ~ 5: Elementary school
6 ~ 8: Middle school
9 ~ 12: High school
13 ~ 16: College
17 ~ 18: Grad School

Assume that the given number is 1 ~ 18
 */