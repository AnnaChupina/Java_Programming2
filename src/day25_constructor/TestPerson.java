package day25_constructor;

import java.time.LocalDate;

public class TestPerson {
    public static void main(String[] args) {

        Person p1 = new Person("Anna",35,'F', LocalDate.of(1987,7,23), true,true );
        Person p2 = new Person("Olga", 34, 'F', LocalDate.of(1990,5,1), true,true);
        Person p3 = new Person("Oleg", 39, 'M', LocalDate.of(1990,5,1), true,true);
        Person p4 = new Person("John", 34, 'F', LocalDate.of(1990,5,1), true,true);
        Person p5 = new Person("Nikita", 34, 'M', LocalDate.of(1990,5,1), true,true);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        System.out.println("--------------------");

        p1.likeToDrink("Fanta");
        p2.food("Hot dogs");
        p3.sleeping(true);



    }
}
