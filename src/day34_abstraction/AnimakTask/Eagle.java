package day34_abstraction.AnimakTask;

public class Eagle extends Animal implements Flyable, WildAnimal{
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Parrot " + getName() + " is eating snake");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void hunt() {

    }
}
