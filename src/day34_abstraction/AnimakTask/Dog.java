package day34_abstraction.AnimakTask;

public class Dog extends  Animal implements Playable,Swimable{
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dog " + getName() + " is eating dog food");
    }

    @Override
    public void play() {
        System.out.println("Dogs "+ getName()+" like to play with stick");

    }

    @Override
    public void swim() {

    }
    public void bark(){
        System.out.println("Dog " + getName() + " " + " is barking");
    }
}
