package day19_array;

public class minNumber {
    public static void main(String[] args) {

        int[] mm = {10, 50, 60, -80};
        int min = mm[0];

        for (int i = 1; i < mm.length; i++) {

            if (mm[i] < min){
            min = mm[i];
            }
        }
        System.out.println(min);
    }
}
