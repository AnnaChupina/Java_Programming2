package day26_statics;

public class ConstructorCalls2 {   // Default

    public ConstructorCalls2(){

        System.out.println("Default");
    }

    public ConstructorCalls2(int a){  // Default, int arg
        this();  // calling the default constructor
        System.out.println("int a");
    }

    public ConstructorCalls2(String a){   // Default, int arg, string arg
        this(10);
        System.out.println("string arg");
    }

    public static void main(String[] args) {

        ConstructorCalls2 obj1 = new ConstructorCalls2();

        System.out.println("-----------------------");

        ConstructorCalls2 obj2 = new ConstructorCalls2(10);

        System.out.println("--------------------");

        ConstructorCalls2 obj3 = new ConstructorCalls2("Java");

    }


}
