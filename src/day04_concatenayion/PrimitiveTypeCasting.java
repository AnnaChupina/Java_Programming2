package day04_concatenayion;

public class PrimitiveTypeCasting{
    public static void main(String[] args) {

        //-------------------Implicit Casting------------
        byte a = 15;
        short b = a;
        // short b = (short)a;
        System.out.println(b);

        int c = a; //implicit casting

        long d = 3000;
        float f = d; //implicit casting

        //-------------------Explicit Casting------------

        int x = 100;

        byte y = (byte)x;

        float z = 20.8f;

        short q = (short)z; // z = 20.8
        System.out.println("q = " + q);
        double n1 = 2.5;
        byte n2 = (byte)n1;
        System.out.println(n2);
        System.out.println("______________________________________________");

        int num = 500;
        byte result = (byte) num; // explicit casting
        System.out.println(result);

        int r = 50000;
        short t = (short) r;
        System.out.println(t);










    }
}
