package utilities;

public class StringUtility {

    public static String reverse(String str){
        String reverse = "";     // to contain all the characters of the given string in reverce

        for(int i = str.length()-1; i>=0; i--) {  // i: index numbers of the strinf starting from last index to index 0
            reverse += "" + str.charAt(i);  // to get each characters of the string from last index to index zero

        }
        return reverse;

    }

    public static int frequency(String sentence, String word){

        sentence = sentence.toLowerCase();
        word = word.toLowerCase();


        int count = 0;

        while (sentence.contains(word)){
            count ++;
            sentence= sentence.replaceFirst(word, "");

        }
        return count;
    }
    //  return the frequency of the given word from a sentence

    public static int frequency(String str, char ch){

        int count = 0;

        for (int i = 0; i < str.length(); i++) {  // index numbers of string str
            if(str.charAt(i) == ch){   //if the character of the string is equal to the given charcter, it means  the given charcter has appeared in the string
                count ++;

            }

        }
        return count;


    }
    //     return the frequency of the given char from a sentence
    //

    public static String removeDup (String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);   // each character of the String str
            if (!result.contains("" + each)) {  /// if the string result does not contain the character of string str yet
                result += each;  // then we will add the  character to string result
            }
            //if th character is not contained yet in the string then we will add it to the new string

        }
        return result;
    }


 }



