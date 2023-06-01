package day14_forLoop;

public class ForLoopPractice {
    public static void main(String[] args) {

        for (int i=10; i>5; i--){
            System.out.println("Hello Cydeo");
        }


        System.out.println("_____________");

        int result=0;
        for(int i = 1; i<=100; i++){
            result +=i;

        }
        System.out.println(result);

        for(char az = 65; az<=90; az++){
            System.out.print(az + " ");
        }
        System.out.println();
        for(char aa = 'A'; aa<='Z'; aa++){
            System.out.print(aa + " ");
        }
        System.out.println();
        for (char za=122; za>=97; za--){
            System.out.print(za + " ");
        }

    }
}
/* summ numbers from 1 to 100
 alfabets A-Z
 alfabets Z-A
 */