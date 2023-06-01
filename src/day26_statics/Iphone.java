package day26_statics;

public class Iphone {

    public static String brand = "Apple"; // static: "Apple" is the brand of all the iphone object

    public String model;  // instance: different models for iphone objects

    public String color;
    public int price;
    public static String OS = "iOS";  // static: operating system is the same for all the iphone objects
    public static String madeIn = "China";

    public static boolean hasBattery = true;

    public static boolean isPouchScreen = true;

    public static boolean isExpensiveToFix = true;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void printPhoneInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Price:" + price);
    }

    public static void printOperatingSystem() {
        System.out.println("Operating system: " + OS);
    }

  /*
    public static void printPhoneInfo(){  // static only accepts statics
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }
   */



}
/*
brand, model, color, price,OS, madeIn, hasBattary, isPouchSceen
*/