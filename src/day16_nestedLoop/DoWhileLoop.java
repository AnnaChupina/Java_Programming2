package day16_nestedLoop;

public class DoWhileLoop {

    public static void main(String[] args) {
        boolean condition = false;

        for(; condition;){
            System.out.println("Hello Cydeo   --- For Loop");
        }
        System.out.println("------------------------");

        while(condition){
            System.out.println("Hello world  --- while Loop");
        }
        System.out.println("-----------------");

        do{
            System.out.println("Hello Cydeo  --- do...while");

        }while(condition);


    }
}
