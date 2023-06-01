package day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {


    public static void main(String[] args) {

        String[] group1 = {"James", "Daniel", "Anna", "Emy"};  // 4 names
        String[] group2 = {"John", "Olga", "Nely"};  // 3 names
        String[] group3 = {"Ivan", "Mary", "Anastia", "Oleg", "igor"};  // 5 names
        String[] group4 = {"Victor", "Kolia"};  // 2 names

        String[][] groups = {group1, group2, group3, group4};

        //                    0        1      2        3

        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);
            }
        }

        System.out.println("----------------------");

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);

            }
        }

        System.out.println("---------------------");

        for (int i = groups.length - 1; i >= 0; i--) {
            String [] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));
            for (String each : eachGroup) {
                System.out.println(each);
            }

        }
        System.out.println("---------------------");

        System.out.println(Arrays.toString(groups));  // toString()  ==> for single arrays ONLY

        System.out.println(Arrays.deepToString(groups) );  // deepToString()  ==> for multi-dimensional dimentional arrays ONLY

    }
}
