package day34_abstraction.AnimakTask;

public class Parrot extends  Animal implements Playable, Flyable{
    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    @Override
    public void eat() {
        System.out.println("Parrot " + getName() + " is eat seeds");
    }

    @Override
    public void play() {
        System.out.println("Parrot " + getName()+ " is playing with mirror");
    }

    @Override
    public void fly() {
        System.out.println("Parrot " + getName()+ " like to fly");
    }
}
