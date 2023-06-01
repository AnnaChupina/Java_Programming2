package day26_statics.studentTask;

public class TestObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Vasil", 21, 'M', "A16");
        Student student2 = new Student("Gena", 24, 'M', "B34");
        Student student3 = new Student("Semion", 22, 'F', "C56");
        Student student4 = new Student("Masha", 25, 'M', "D43");
        Student student5 = new Student("Stepa", 24, 'M', "E27");

        Student[] students = {student2, student3,student4, student5};


        StudentdGroup group1= new StudentdGroup("Java Turtles", 1);
        group1.addStudent(student1);

        group1.addStudent(students);
        group1.addStudent("Klara", 34,'M', "F35");

        System.out.println(group1);
        group1.removeStudent("D43");
        group1.removeStudent("E27");
        System.out.println(group1);


        for (Student each : group1.students) {
            System.out.println(each.name + " : " + each.id);

        }


        StudentdGroup group2= new StudentdGroup("Java Turtles", 1);
        StudentdGroup group3= new StudentdGroup("Java Turtles", 1);
        StudentdGroup group4= new StudentdGroup("Java Turtles", 1);


        StudentdGroup[] groups = {group1,group2,group3, group4};


    }
}
/*
3. Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list


 */