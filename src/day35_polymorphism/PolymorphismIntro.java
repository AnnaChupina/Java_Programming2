package day35_polymorphism;

import day31_inheritance.animal_methodOverriding.Lion;
import day31_inheritance.shape_methodOverriding.Circle;
import day32_finalKeyword.carTasj_methodOverriding.Audi;
import day32_finalKeyword.carTasj_methodOverriding.Honda;
import day32_finalKeyword.carTasj_methodOverriding.Tesla;
import day33_abstraction.employeeTask.*;
import day34_abstraction.AnimakTask.*;
import day35_polymorphism.TransportationTask.Car;

import java.util.Arrays;

public class PolymorphismIntro {

    public static void main(String[] args) {
        Dog dog = new Dog("Max", "Husky", 'M', 4, "Small", "White");

        Cat cat = new Cat("Izi", "Husky", 'M', 2, "Small", "White");

        Tiger tiger = null;

        Eagle eagle = null;

        lion lion1 = null;

        Parrot parrot = null;

        Dolphin dolphin = null;

        Shark shark = null;

        Duck duck = null;


        Animal[] animals = {dog, cat, tiger, lion1, eagle, parrot, dolphin, shark, duck};
        // Animal animal = new Tesla ("Molel Y", "Blue", 2022, 60000);
        // there is not "IS A" relationship between Animal and Tesla

        Animal animal =  new Dog("Max", "Husky", 'M', 4, "Small", "White");
        animal.eat();
        animal.drink();
        animal.sleep();

       // animal.play();
       // animal.bark();


        System.out.println("-----------------------------------------");

        String str = "Java";

        Integer n = 100;

        Boolean r = false;

        Double d = 10.5;

        Circle circle = new Circle(4);

        Honda honda = new Honda("Accord", "Grey", 201, 24000);

        Audi audi = new Audi("Q6", "Silver", 2021, 50000);

        Tesla tesla = new Tesla("Model 3", "White", 2022,65000);

        Teacher teacher = new Teacher("James", 45, 'M',"T2", "Mathteacher", 75000);

        Developer developer= new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        Driver driver = new Driver("Aaron", 48, 'M', "D1", "Truck driver", 90000);

        Tester tester = new Tester("Emily", 35, 'F', "E1" , "Manual Tester", 80000);


        Object[] objects = {str,n, r, d, honda, audi, tesla, teacher, developer, driver, tester};

        System.out.println(Arrays.toString(objects));

        Employee[] employees = {teacher, developer, driver, tester};

        Employee obj = new Teacher("James", 45, 'M',"T2", "Mathteacher", 75000);
        obj.work();

        System.out.println("-----------------------------------------------------------");







    }
}