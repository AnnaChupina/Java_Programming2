package day35_polymorphism;

import day23_arrayList.AverageNumber;
import day31_inheritance.animal_methodOverriding.Lion;
import day34_abstraction.AnimakTask.*;
import day35_polymorphism.TransportationTask.*;

public class PolimorphismPractice {
    public static void main(String[] args) {
        Animal tiger = new Tiger("Sher Khan", "Bengal", 'M' ,5,"Large", "Orange");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        //  tiger.hunt();

        Animal animal = new Eagle("John", "American eagle", 'M', 3, "small", "blue" );

        //  animal.fly();
        animal.eat();
        animal.sleep();
        animal.drink();

        Flyable obj1 = new Eagle("John", "American eagle", 'M', 3, "small", "blue");
       //   obj1.eat()
        //  obj1.drink();
       //   obj1.sleep();
        obj1.fly();
        System.out.println(obj1.canFly);

        Lion lion = null;

        Parrot parrot = null;

        Shark shark = null;

        Dolphin dolphin = null;

        Eagle eagle = null;

        Duck duck = null;

        Dog dog= null;

        Cat cat = null;

        CydeoCar cydeoCar = null;



        Flyable [] birds = {parrot, eagle, duck};

        Swimable[] fish = {shark, dolphin, duck};

        Playable[] friendlyAnimals = {dog, cat, duck};

        boolean aiAnimal = dog instanceof  Animal;

        System.out.println(aiAnimal);

        System.out.println("-----------------------------");

        Car car = new Tesla("Tesla","Model Y", "White", 2022,55000);
        boolean isTesla = car instanceof Tesla;
        boolean isAudi = car instanceof Audi;
        boolean isElectricCar = car instanceof Electric;
        boolean hasAutoPark = car instanceof AutoPark;
        boolean hasAutoPilot = car instanceof AutoPilot;

        System.out.println("isTesla = " + isTesla);;
        System.out.println("isAudi = " + isAudi);
        System.out.println("isElectricCar = " + isElectricCar);
        System.out.println("hasAutoPark = " + hasAutoPark);
        System.out.println("hasAutoPilot = " + hasAutoPilot);




    }
}
