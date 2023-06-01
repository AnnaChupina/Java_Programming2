package day06_ifStatements;

public class OperatorPrecedence {

    public static void main(String[] args) {
        System.out.println((5 + 2) * 3);
        System.out.println( 7 + 3 - 2 /2);
        System.out.println( 10> 9 == 8 < 7 &&  "Java" == "Pyton" || 'a' == 'A');
        //                   true  == false &&       false       ||   false
        //                        false     &&       false       ||   false
        //                                 false                 ||    false
        System.out.println();




    }
}
