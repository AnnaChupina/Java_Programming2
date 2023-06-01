package day32_finalKeyword.PersonTask;

import day30_inheritance.typesOfInheritance.Employee;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {

        Person person = new Person("Daniel", 'M', LocalDate.of(1991, 1, 25));
        System.out.println(person);

        System.out.println("-----------------------------------");

        Enployee employee = new Enployee("Emily", 'F', LocalDate.of(1989, 2,5), "Accounter", 90000);

        System.out.println(employee);

        employee.breath();

    }
}
