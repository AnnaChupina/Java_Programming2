package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person[] people = { new Person(), new Person(), new Person(), new Person(), new Person()};
        people[0].setInfo("Daniel", 'M', LocalDate.of(1989,2,25));
        people[1].setInfo("Tania", 'F', LocalDate.of(1966,2,25));
        people[2].setInfo("Olga", 'F', LocalDate.of(1979,2,25));
        people[3].setInfo("Oleg", 'M', LocalDate.of(1999,2,25));
        people[4].setInfo("Dan", 'M', LocalDate.of(1929,2,25));



        ArrayList<Person> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(people));

        // print nane & date of birth of each person object

        // remove all the person objects that has the age > 55


    }
}
