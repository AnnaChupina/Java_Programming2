package day06_ifStatements;

public class SingleIfStatement {

    public static void main(String[] args) {

        int number = 156;

         boolean isEven = number % 2 == 0;

         if (isEven) {
             System.out.println("Even  umber");
         }

         if(!isEven) {
             System.out.println("odd number");
         }

        System.out.println("____________________");
          if (number % 2 == 0) {
              System.out.println("Even number");
          }
          if (number % 2 != 0) {
              System.out.println("Odd number");
          }
    }

}
