package day29_inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setInfo("Max", "Husky", 'M', 6, "Large", "white");

        Cat cat1 = new Cat();
        cat1.setInfo("Felicia", "domestic", 'F', 2, "medium", "White");

        Tiger tiger1 = new Tiger();
        tiger1.setInfo("Shere Khan", "Bengal", 'M', 5,"Large", "Orange");

        System.out.println(cat1);
        System.out.println(dog1);
        System.out.println(tiger1);

        System.out.println("---------------------------------");
        
        dog1.eat();
        dog1.sleep();
        dog1.drink();

        cat1.eat();
        cat1.sleep();
        cat1.drink();
        
        tiger1.eat();
        tiger1.sleep();
        tiger1.drink();

        System.out.println("-----------------------------------");

        dog1.bark();
      // cat1.bark();
      // tiger1.bark();

        cat1.meow();
      // dog1.meow();
      // tiger1.meow();

        tiger1.hunt();
       // cat1.hunt();
       // dog1.hunt();

        System.out.println("--------------------------------------");

        System.out.println(dog1.getName());
        System.out.println(dog1.getColor());

      //  dog1.gernder = 'K';
     //   dog1.age = -100;


        System.out.println(dog1.getColor());

        dog1.setGernder('F');
        dog1.setAge(8);
        System.out.println(dog1);


    }

}
