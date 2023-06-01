package day17_customClass;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo( "Sumeye", 28, 'f', "Java Developer", 95000, "A123");

        Employee employee2 = new Employee();
        employee2.setInfo("anna", 23, 'F', "Back-end Developer", 98000, "D123");

        Employee employee3 = new Employee();
        employee3.setInfo("Abidullah", 33, 'M', "Front-end Developer", 99000, "C12");

        employee2.age =39;
        employee3.name = "Lucy";
        employee1.gender = 'F';


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);


        employee3.work();









    }

}
