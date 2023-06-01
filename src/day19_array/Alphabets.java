package day19_array;

import java.util.Arrays;

public class Alphabets {
    public static void main(String[] args) {
        char [] ascending = new char[26];
        char[] descending = new char[26];
        for (int i = 0, j ='A', k ='Z'; i < ascending.length; i++, j++, k --) {
            ascending[i]=(char) j;  // A ~ Z
            descending [i] = (char) k;   // Z ~ a
        }

        System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(descending));


        System.out.println("------------------------------------------");

        char [] charracters = new char [65535];

        for (int i = 0; i < charracters.length; i++) {
           charracters[i] = (char)i ;
        }

        System.out.println(charracters);



    }

}
