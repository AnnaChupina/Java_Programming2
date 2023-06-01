package day14_forLoop;

public class StringReverse {
    public static void main(String[] args) {

        String str = "Javaz";
        //            0123
        // "avaJ"
        String reverse="";

        for(int i = str.length()-1; i>=0; i--){
            reverse += ""+str.charAt(i);
        }
        System.out.println(reverse);

        System.out.println("______________________");

        String name ="Anna Chupina";
        String result = reverse(name);
        System.out.println(result);

    }

    public static String reverse(String str){
        String reverse = "";

        for(int i = str.length()-1; i>=0; i--) {  // i: index numbers of the string starting from last index to index 0
            reverse += "" + str.charAt(i);  // to get each characters of the string from last index to index zero

        }
        return reverse;

    }

}
