package day36_polymorphism;

public class TestEqualMethod {

    public static void main(String[] args) {

        Circle circl1 = new Circle(5);

        Circle circle2 = new Circle(5);

        Circle circle3 = new Circle(50);

        System.out.println(circl1==circle2); // false

        System.out.println(circl1.equals(circle2));  // true

        System.out.println(circl1.equals(circle3));  //  false

        System.out.println("-----------------------------------------------------");

        IPhone iphone1 = new IPhone ("Apple" , "Iphone 12", "Meium", "Black", 900);

        IPhone iphone2 = new IPhone ("Apple" , "Iphone 12", "Meium", "Blue", 900);

        System.out.println(iphone1.equals(iphone2));


    }
}
