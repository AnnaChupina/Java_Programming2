package day06_ifStatements;

public class Gradelavel2 {
    public static void main(String[] args) {

            int gradeLevrel =12;
            String result = "" ; // temporary value


            if(gradeLevrel >= 1 &&gradeLevrel <= 5) {
                result = "Elementary School";
            }
            if (gradeLevrel >= 6 && gradeLevrel <= 8 ) {
                result = "Middle school";
            }
            if (gradeLevrel >= 9 && gradeLevrel <= 12) {
                result = "High school";
            }
            if(gradeLevrel >=13 && gradeLevrel <= 16) {
                result =  "Coledge";
            }
            if (gradeLevrel >=17 && gradeLevrel <= 18) {
                result = "Grad school";
            }
        System.out.println(result);

    }

}
