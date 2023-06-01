package day36_polymorphism;

import day29_inheritance.animalTask.Animal;
import day29_inheritance.animalTask.Cat;
import day29_inheritance.animalTask.Dog;
import day30_inheritance.phoneTask.IPhone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day33_abstraction.employeeTask.*;
import day35_polymorphism.TransportationTask.AutoPilot;
import day35_polymorphism.TransportationTask.Electric;
import day35_polymorphism.TransportationTask.Tesla;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

      //  Dog dog = new Dog();

      //  Cat cat =new Dog();

        Animal animal = new Dog();  // imolicit casting

        System.out.println("-------------------------------------");

        Animal animal1 = new Dog();  // upcstimng ==> Polymorphism
        animal1.setInfo("Max", "Husky", 'M', 6, "Large", "white");

        animal1.eat();
        animal1.sleep();
        animal1.drink();

        ((Dog)animal1).bark();  //  downcasting

        //  Dog dog1 = (Dog)animal;  //  downcasting
        //  dog1.bark();

        //  ((Cat)animal1). scratch();  // Dog can not be converted to Cat, because there is not "IS A" relationship


        System.out.println("-------------------------------------");

        Phone phone = new Nokia("XR20", "Small", "Gold", 350);

        phone.call(911);
        phone.text(910);
        ((Nokia) phone).selfDefense();

       // ((IPhone)phone).faceTime(123456); Nokia can not be converted to Iphone, because there is not "IS A" relationship

        ((Nokia)phone).selfDefense();

        System.out.println("-------------------------------------");

        Employee employee = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        employee.work();

        System.out.println( ((Developer) employee).getProgrammingLanguage() );

       // Driver driver = (Driver) employee;

        System.out.println("-------------------------------------");

        Electric electric = new Tesla("Tesla", "Model Y", "Blue", 2020, 55000);

        electric.charge();
        ((Tesla)electric).selfDrive();
        ( (AutoPilot)electric).selfDrive();

        System.out.println("------------------------------------------");

        Employee employee1 = new Teacher("James", 45, 'M',"T2", "Mathteacher", 75000);

        Employee employee2= new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        Employee employee3 = new Driver("Aaron", 48, 'M', "D1", "Truck driver", 90000);

        Employee employee4 = new Tester("Emily", 35, 'F', "E1" , "Manual Tester", 80000);










    }
}
