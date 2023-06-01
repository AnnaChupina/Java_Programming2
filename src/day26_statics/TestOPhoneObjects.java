package day26_statics;

public class TestOPhoneObjects {

    public static void main(String[] args) {
        Iphone iPhone = new Iphone("iphone 12", "Black", 1000);

        System.out.println(iPhone.model);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);

        iPhone.printPhoneInfo();

        System.out.println(iPhone.brand);
        System.out.println(iPhone.OS);
        iPhone.printOperatingSystem();

    }
}
