package day33_abstraction;

import day32_finalKeyword.PersonTask.Person;

import java.time.LocalDate;

public final class CydeoDevStudent extends Person {
    private final String id;
    private String batchName;
    private int batchNumber;
    public static final String programmingLanguage;

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        if(batchName.equalsIgnoreCase("Zero to Hero") || batchName.equalsIgnoreCase("Alumni Dev")){
            this.batchNumber = batchNumber;
        } else{  // otherwise: if the batch name is invalid
            System.err.println("Invalid batch Name: " + batchName + "\n No such a batch in Cydeo");
        }
    }

    public int getBatchNumber() {

        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber<=0){
            System.err.println("Invalid value of batch Number: " + batchNumber + "\nBatch number can not be negative or zero");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {
        super(name, gender, dateOfBirth);
        if(getAge()<18){   //  if age is set to less than 18
            System.err.println("Cydeo Developer student must be at least 18 years old");
            System.exit(1);
        }
        this.id = id;
        setBatchName(batchName);
        setBatchNumber(batchNumber);
    }
    static {
        programmingLanguage = "Java";
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating " + programmingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking " + programmingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " does not need to sleep");
    }

    @Override
    public String toString() {
        return "CydeoDevStudent{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", DOB=" + getDateOfBirth() +
                ", id='" + id + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }
}
