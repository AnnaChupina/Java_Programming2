package day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCaracters {

    public static void main(String[] args) {


        String str = "aaaabbbbddddccccc";

        String result = "";   // a3b4d4c5

        for (String each : str.split("")) {
           int friquency = Collections.frequency(Arrays.asList(str.split("")), each);

           if(!result.contains(each)){
               result +=each + friquency;
           }
        }
        System.out.println(result);






    }
}
