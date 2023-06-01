package day12_customMethods;

public class Test {
    public static void main(String[] args) {
        int number= 300;

       /* CustomMethodWithParameter.oddOrEven(number);

        String firstName = "Vasyl",
                lastName = "Dabriaski";
        CustomMethodPractice.inicials(firstName,lastName);
          */
        String word1 = "oak", word2= "red";



        if(word1.length()==3&& word2.length()==3){
            String merge = "" + word1.charAt(0)+word2.charAt(0)+word1.charAt(1)+word2.charAt(1)+word1.charAt(2)+word2.charAt(2)+"";
            System.out.println(merge);

        }else{
            System.out.println("cannot merge");
        }



    }
}
