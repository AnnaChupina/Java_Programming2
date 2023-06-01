package day27_accessModifiers;

public class Test {


    public static void main(String[] args) {


        //new StaticIniotializationBlock();

        System.out.println(StaticIniotializationBlock.a);
        System.out.println(StaticIniotializationBlock.b);
        System.out.println(StaticIniotializationBlock.c);


        System.out.println("---------------------------------------------------");


        System.out.println(AccessModifiers.publicDate);  // public is accessible within the same package

        System.out.println(AccessModifiers.protectedDate); // protected is accessible within the same package

        System.out.println(AccessModifiers.defaultDate); // deafult is accessible within the same package

      //System.out.println(AccessModifiers.privetDate);  // privet is not accessible within same package

        new AccessModifiers();
        AccessModifiers.publicMethod();
        AccessModifiers.protectedMethod();
        AccessModifiers.defaultMethod();
        // AccessModifiers.privateMethod();

    }
}
