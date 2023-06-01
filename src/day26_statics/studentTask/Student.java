package day26_statics.studentTask;

public class Student {

    public String name;
    public int age;
    public char gemder;
    public String id;

    public Student(String name, int age, char gemder, String id) {
        this.name = name;
        this.age = age;
        this.gemder = gemder;
        this.id = id;
    }

    public void study() {
        System.out.println(name + " is studing");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gemder=" + gemder +
                ", id='" + id + '\'' +
                '}';
    }
}

