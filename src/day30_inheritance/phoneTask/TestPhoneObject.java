package day30_inheritance.phoneTask;

public class TestPhoneObject {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone(" IP 12", "large", "Black", 1000.5);
        Samsung samsung = new Samsung("Galaxy S22", "Medium", "White", 1100);
        Nokia nokia = new Nokia("Brick", "Small", "Pink", 50);


        iPhone.call(911);
        samsung.call(911);
        nokia.call(911);


        iPhone.text(911);
        samsung.text(911);
        nokia.text(911);

        System.out.println("------------------------");

        iPhone.faceTime(13165);
        // samsung.faceTime(136516);
        // nokia.faceTime(136516);

        samsung.freeze();
        //iPhone.freeze();
        //nokia.freeze();

        nokia.selfDefense();
       // IPhone.selfDefense();
       // samsung.selfDefense();

        System.out.println("-------------------------");

        System.out.println(iPhone);
        System.out.println(nokia);
        System.out.println(samsung );
    }
}
