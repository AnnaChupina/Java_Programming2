package day28_encapsulation;

public class Test {
    public static void main(String[] args) {

        Student student = new Student();
    //    student.age = -200;
    //    System.out.println(student.age);

        student.setAge(25);



        System.out.println(student.getAge());

        System.out.println("Test Complited");

          student.setName("Aaron123");

        System.out.println(student.getName());
    }

}
