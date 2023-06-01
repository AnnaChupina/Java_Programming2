package day15_whileLoop;

public class RemoveDuplicates2 {

    public static void main(String[] args) {

        String str = "xyzxyzzx";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if ( result.contains("" + str.charAt(i)) ){ // if the caracter is already contsained in the string
                continue;  // skip
            }
            result += str.charAt(i);


        }
        System.out.println(result);

    }


}
/*
3. Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc
 */