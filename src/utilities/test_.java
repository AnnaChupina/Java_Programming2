package utilities;

import java.util.Arrays;

public class test_ {
    public static void main(String[] args) {

        int[] array = {10, 20, 40, 40};

        for (int j = 0; j < array.length; j++) {

            for (int i = j + 1; i < array.length; i++) {
                if (!(array[j] == array[i])) {
                    continue;
                } else {
                    array = ArraysUtility.remove(array, i);
                }
            }

        }
        System.out.println(Arrays.toString(array));

        int[] array2 = {10, 40, 550, 40};
        array2 = ArraysUtility.removeDup(array2);
        System.out.println(Arrays.toString(array2));
        System.out.println("==---------------");

           String [] str = {"Anna","Anna", "Valera"};
           str = ArraysUtility.removeDup(str);
           System.out.println(Arrays.toString(str));


    }
}