package utilities;

import java.util.Arrays;

public class ArraysUtility {

    public static int[] merge(int[] arr1, int [] arr2){

        int[] arr3 = new int[arr1.length + arr2.length];  // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2
        int k = 0;  // for third array's index number
        for (int i = 0; i < arr1.length; i++, k++) {  // i: for first array's index numbers
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {   // i: for second array's index numbers
            arr3[k] = arr2[i];
        }
        return arr3;
    }
    public static double[] merge(double[] arr1, double [] arr2){

        double[] arr3 = new double[arr1.length + arr2.length];  // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0;  // for third array's index number
        for (int i = 0; i < arr1.length; i++, k++) {  // i: for first array's index numbers
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {   // i: for second array's index numbers
            arr3[k] = arr2[i];
        }
        return arr3;
    }


    public static char[] merge(char[] arr1, char [] arr2){

        char[] arr3 = new char[arr1.length + arr2.length];  // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0;  // for third array's index number
        for (int i = 0; i < arr1.length; i++, k++) {  // i: for first array's index numbers
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {   // i: for second array's index numbers
            arr3[k] = arr2[i];
        }
        return arr3;
    }

    public static String[] merge(String[] arr1, String [] arr2){

        String[] arr3 = new String[arr1.length + arr2.length];  // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0;  // for third array's index number
        for (int i = 0; i < arr1.length; i++, k++) {  // i: for first array's index numbers
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {   // i: for second array's index numbers
            arr3[k] = arr2[i];
        }
        return arr3;
    }



    public static int [] reverse(int[] array){
        int [] reverse= new int [array.length];
        for (int i = array.length -1, j =0; i >=0 ; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;

    }

    public static double [] reverse(double[] array){
        double [] reverse= new double [array.length];
        for (int i = array.length -1, j =0; i >=0 ; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;

    }

    public static char [] reverse(char[] array){
        char [] reverse= new char [array.length];
        for (int i = array.length -1, j =0; i >=0 ; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;

    }
    public static String [] reverse(String[] array){
        String [] reverse= new String [array.length];
        for (int i = array.length -1, j =0; i >=0 ; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;

    }

    public static int[] addElement(int[] array, int element){
        int[] new_array = Arrays.copyOf(array, array.length +1);
        new_array[new_array.length-1] = element;
         return new_array;
    }
    public static double[] addElement(double[] array, double element){
        double[] new_array = Arrays.copyOf(array, array.length +1);
        new_array[new_array.length-1] = element;
        return new_array;
    }
    public static char[] addElement(char[] array, char element){
        char[] new_array = Arrays.copyOf(array, array.length +1);
        new_array[new_array.length-1] = element;
        return new_array;
    }
    public static String[] addElement(String[] array, String element){
        String[] new_array = Arrays.copyOf(array, array.length +1);
        new_array[new_array.length-1] = element;
        return new_array;
    }

    public static boolean contains (int[] array, int element){
        boolean contain = false;
        for (int i : array) {
            if(i==element){
                return true;
            }
        }
        return true;
    }
    public static boolean contains (double[] array, double element){
        boolean contain = false;
        for (double i : array) {
            if(i==element)
            {return true;}
        }
        return true;
    }
    public static boolean contains ( String [] array, String element){
        boolean contain = false;
        for (String i : array) {
            if(i.equals(element)){
                return  true;
            }
        }
        return true;
    }
    public static boolean contains ( char [] array, char element){
        boolean contain = false;
        for (char i : array) {
            if(i==element){
                return true;
            }
        }
        return true;
    }
    public static int[]  remove(int[] array, int index){
        int[] array2 = new int[array.length-1];

        for (int i=0; i<array.length;i++) {
            if(i == index){
                continue;
            }
            if(i < index){
                array2[i]=array[i];
            }else{
                array2[i-1]=array[i];
            }

        }
        return array2;
    }
    public static double[]  remove(double[] array, int index){
        double[] array2 = new double[array.length-1];

        for (int i=0; i<array.length;i++) {
            if(i == index){
                continue;
            }
            if(i < index){
                array2[i]=array[i];
            }else{
                array2[i-1]=array[i];
            }

        }
        return array2;
    }
    public static char[]  remove(char[] array, int index){
        char[] array2 = new char[array.length-1];

        for (int i=0; i<array.length;i++) {
            if(i == index){
                continue;
            }
            if(i < index){
                array2[i]=array[i];
            }else{
                array2[i-1]=array[i];
            }

        }
        return array2;
    }
    public static String[]  remove(String[] array, int index){
        String[] array2 = new String[array.length-1];

        for (int i=0; i<array.length;i++) {
            if(i == index){
                continue;
            }
            if(i < index){
                array2[i]=array[i];
            }else{
                array2[i-1]=array[i];
            }

        }
        return array2;
    }

    public static int[] removeDup(int[] array){
        for (int j = 0; j<array.length; j++) {

            for (int i=j+1; i < array.length; i++) {

                if (!(array[j] == array[i])) {
                    continue;
                } else {
                    array =  ArraysUtility.remove(array, i);
                }
            }
        }
        return array;
    }
    public static String[] removeDup(String[] array){
        for (int j = 0; j<array.length; j++) {

            for (int i=j+1; i < array.length; i++) {

                if (!(array[j].equals(array[i]))) {
                    continue;
                } else {
                    array =  ArraysUtility.remove(array, i);
                }
            }
        }
        return array;
    }





}
