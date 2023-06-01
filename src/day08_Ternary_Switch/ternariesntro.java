package day08_Ternary_Switch;

public class ternariesntro {

    public static void main(String[] args) {

        int score = 85;
        String result = "";

        if (score>= 60){
            result = "Passsed";
        }else{
            result = "Failed";
        }
        System.out.println(result);

        System.out.println("________________________");

        result = (score>=60) ? "Passed" : "Failed";
        System.out.println(result);

        System.out.println("___________________________");

        int age = 34;

        /*
        String r;
        if (age>= 21){
            r= "Eligible";
        }else{
            r= "Not eligible";
        }
        System.out.println(r);
        */
        String result3 = (age>=21) ? "Eligible" : "Not eligible";
        System.out.println(result3);



    }

}
