package day19_array;

import java.util.Arrays;

public class ArrayPractice1 {

    public static void main(String[] args) {
        String[] myGroup = new String [5];

        myGroup [0] = "Gulcin";
        myGroup [myGroup.length-1] ="Aseel";
        myGroup [2] ="Sumeve";
        myGroup [1] = " Abdullah";
        myGroup [3] = "khashayar";

        System.out.println();

        System.out.println(Arrays.toString(myGroup));

        myGroup[1] = "Kuzzat";



        System.out.println("-----------------------");

        for (int i = myGroup.length-1; i >=0; i--) {
            System.out.println(myGroup[i]);


            for (int i1 = 0; i1 < myGroup.length; i1++) {
                
            }
                

        }

    }
}
