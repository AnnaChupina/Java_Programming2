package day26_statics;

public class ConstructorCalls {
    public ConstructorCalls(){
        System.out.println("Default constructor");
    }

    public ConstructorCalls(int a){
        this();
        // ConstructorCalls();   1) has tobe called only with special word "this()"
        System.out.println("Constructor with int argument");
      // this();  3) has to be at the first step
    }

    public ConstructorCalls( double b){

        System.out.println("Constructor with double argument");
    }

    public ConstructorCalls( String c){
        this(2.5);
        //this ();

        System.out.println("Constructor with string argument");
    }


    public static void main(String[] args) {
        method1();
        System.out.println("------------------");
        method2();


    }


    public static void method1(){
        System.out.println("Method 1");
       // ConstructorCalls();
        // this(); 2) only constructor can call another constructor
    }
    public static void method2(){
        System.out.println("Method 2");
    }


}
