package day25_constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;
    public boolean isMarried;
    public boolean isEmployeed;

    public Person(String name, int age, char gender, LocalDate dateOfBirth, boolean isMarried, boolean isEmployeed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.isMarried = isMarried;
        this.isEmployeed = isEmployeed;
    }

      public void  likeToDrink (String toDrink) {

           System.out.println(name + " like to drink " + toDrink);
       }

       public void food(String food){
           System.out.println( name + " like to eat " + food);
       }

       public  void sleeping (boolean slip){
        System.out.println(name + " is slipp today is " + slip);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth.format(DateTimeFormatter.ofPattern("MMMM/d/y")) +
                ", isMarried=" + isMarried +
                ", isEmployeed=" + isEmployeed +
                '}';
    }

}


/*
name
age
gender
dateOfBirth
isMarried
isEmployeed


add a constructor that can set all the fields once an object is created
toString(), eat(food), sleeping(), dink(String drink)

5 person objects
 */