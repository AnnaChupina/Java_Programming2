package day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentdGroup {    // StudentsGroup HAS A Student

    public String groupName;
    public int gruopId;
    public ArrayList<Student> students = new ArrayList<>();

    public StudentdGroup(String groupName, int gruopId) {  // creates the StudentGroup objects by setting the groupName and groupId
        this.groupName = groupName;
        this.gruopId = gruopId;
       // students = new ArrayList<>();  // size : 0
    }



    public void addStudent(Student student){
        students.add(student);
    }  // Takes one student object, and adds it to the arrayList of student// s


    public void addStudent (Student [] students){
        this.students.addAll(Arrays.asList(students));
    }
    public void addStudent(String name, int age, char gender, String id){
        //   Student student = new Student();
        students.add(new Student(name,age,gender,id));
    }  // takes name, age, gender id of student info, creates student object by using the given info, then adds the student object to the arrayList

    public void removeStudent(String id){
        students.removeIf(p -> p.id.equals(id));

    }  // Takes the ia and then removes the student object with the specified id from arrayList of students


    public String toString() {
        return "StudentdGroup{" +
                "groupName='" + groupName + '\'' +
                ", gruopId=" + gruopId +
                ", number of students=" + students.size() +
                '}';
    }




}
/*
2. Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constructor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement

 */