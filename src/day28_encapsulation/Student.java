package day28_encapsulation;

import java.sql.SQLOutput;

public class Student {
    private int age;
    private String name;

    public String getName() {
        if (name == null) {
            System.err.println("Name has not been set");
        }
        return name;
    }

    public void setName(String name) {
        boolean hasDigit = false;

        for (char each : name.toCharArray()) {
            if(Character.isDigit(each)){
                hasDigit = true;
            break;
            }
        }
        if(hasDigit){
            System.err.println("Invalid name: " + name);
            System.exit(1);
        }

        this.name = name;
    }

    public int getAge(){
        return age;
    }


    public int setAge() {   // read only
        if ( age == 0){
            System.err.println("Age has not been set");
            System.exit(1);
        }
        return age;
    }

    public void setAge( int age){  // write only

        if( age < 1 || age > 100 ){     // if the age is invalid
            System.err.println("Invalid Age: " + age);
           // return;       // exiting the method
            System.exit(1);  // programm gets terminated
        }
        this.age = age;
    }





}
