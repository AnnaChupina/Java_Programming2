package day29_inheritance.animalTask;

public class Animal {
    private String name;
    private String breed;
    private char gernder;
    private int age;
    private String size;
    private String color;

    public static boolean isAnimal;
    static {
        isAnimal = true;
    }

    public void setInfo(String name, String breed, char gernder, int age, String size, String color) {
        setName(name);
        setBreed(breed);
        setGernder(gernder);
        setAge(age);
        setSize(size);
        setColor(color);
    }

    public void eat()
    {
        System.out.println(name + " is eating");
    }
    public void drink()
    {
        System.out.println(name + " is drinking");
    }
    public void sleep()
    {
        System.out.println(name + " is sleeping");
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gernder=" + gernder +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGernder() {
        return gernder;
    }

    public void setGernder(char gernder) {
        this.gernder = gernder;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
