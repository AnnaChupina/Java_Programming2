package day27_accessModifiers;

public class TestCydeoStudentObject {
    public static void main(String[] args) {


        System.out.println(CydeoStudents.schoolName);
        System.out.println(CydeoStudents.secretCode);

        CydeoStudents students1 = new CydeoStudents("Ekaterina", 29, 'F');
        CydeoStudents students2 = new CydeoStudents("Alena", 28, 'F');

        System.out.println(students1);
        System.out.println(students2);

        System.out.println(students1.schoolName);
        System.out.println(students2.schoolName);

        System.out.println(students1.secretCode);
        System.out.println(students2.secretCode);

    }
}
