package day07_ifStatements;

public class IfStatementWithCurlyBraces {

    public static void main(String[] args) {

        int age=18;
        if(age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }

        System.out.println("___________________");

        if(age>=21) System.out.println("Eligible");
        else System.out.println("Not");

        System.out.println("______________________");

        int itemNum = 1;
        if(itemNum == 1){
            System.out.println("Eggs");
            System.out.println("Orange");
        }else{
            System.out.println("Apple");
            System.out.println("Cherry");
        }

    }

}
