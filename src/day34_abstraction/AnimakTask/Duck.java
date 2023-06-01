package day34_abstraction.AnimakTask;

public class Duck extends Animal implements Playable, Flyable, Swimable{
    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Duck " + getName()+ " is eating bread");
    }

    @Override
    public void play() {
        System.out.println("Duck "+ getName()+ " like to play with fish");
    }

    @Override
    public void fly() {
        System.out.println("Duck" + getName()+ " like to fly");
    }

    @Override
    public void swim() {

    }
}
