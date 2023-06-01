package day27_accessModifiers;

public class AccessModifiers {

    public static int publicDate = 200;

    protected  static int protectedDate = 300;

     static int defaultDate = 400;

    private static int privetDate = 500;

    public AccessModifiers(){

    }

    public static void publicMethod(){
        System.out.println("Public");
    }

    protected static void protectedMethod(){
        System.out.println("Protected");
    }
    static void defaultMethod(){
        System.out.println("default");
    }
    private static void privetMethod(){
        System.out.println("Private");
    }

    public static void main(String[] args) {

        System.out.println(publicDate);  // public and protected is acceessible within the same class
        System.out.println(protectedDate);  // protected is accessible within the same class
        System.out.println(defaultDate);  // default is accessible within the same class
        System.out.println(privetDate);   // privet is accessible within the same class

        publicMethod();
        protectedMethod();
        defaultMethod();
        privetMethod();

    }


}
