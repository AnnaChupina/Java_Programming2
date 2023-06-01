package utilities;

import day27_accessModifiers.AccessModifiers;
import day27_accessModifiers.Date;

import java.util.zip.DataFormatException;

public class Test {
    public static void main(String[] args) {

        System.out.println(Date.d);
        System.out.println(Date.e);
        System.out.println(Date.f);

        Date.method4();
        Date.method3();

        Date obj = new Date();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();

        System.out.println("-------------------");

        System.out.println(AccessModifiers.publicDate);  // public always accessible in different packeges
  //    System.out.println(AccessModifiers.protectedData);  // protected is NOT always accessible in different packeges
  //    System.out.println(AccessModifiers.defaultDate);    // default is never be accessible in different packages
  //    System.out.println(AccessModifiers.privetDate);   // privet is not accessible in different packeges

  //    new AccessModifiers();

        AccessModifiers.publicMethod();
        //   AccessModifiers.protectedMethod();
        //  AccessModifiers.defaultMethod();
        // AccessModifiers.privateMethod();



    }





}
