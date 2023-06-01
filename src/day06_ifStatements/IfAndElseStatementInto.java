package day06_ifStatements;

public class IfAndElseStatementInto {
    public static void main(String[] args) {

        int age = 8;

        if ( age >= 21 ){
            System.out.println("Eligible");
        }
        if ( age < 21 ){
            System.out.println("Not eligible");
        }

        System.out.println("__________________");

        if ( age >= 21 ){
            System.out.println("Eligible");
        }else { // otherwise
            System.out.println("Not eligible");
        }

    }
}
