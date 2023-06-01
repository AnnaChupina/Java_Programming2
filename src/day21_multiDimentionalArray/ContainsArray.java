package day21_multiDimentionalArray;

public class ContainsArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};
        int element = 2;
        boolean contain = false;
        for (int i : array) {
            if(i==element)
            {contain = true;
            }
        }
        System.out.println(contain);

        String [] ar = {"anna","vasia"};
        String el = "anna";
        boolean contain2 = false;
        for (String i : ar) {
            if(i.equals(el)){
                contain2 = true;
            }
        }
        System.out.println(contain2);
        
        char [] ch = {'A', 'D'};
        char ell = 'A';
        boolean contain3 = false;
        for (char i : ch) {
            if(i==ell){
                contain3 = true;
            }
        }
        System.out.println(contain3);



    }
}
