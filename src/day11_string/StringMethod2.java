package day11_string;

import java.sql.SQLOutput;

public class StringMethod2 {

    public static void main(String[] args) {

        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";
        sentence = sentence.replace("Python", "Java");
        System.out.println(sentence);

        //--------------------------------------------------------------
        String word = "java";
        word = word.replace('a','e'); // jeve
        System.out.println(word);

        //-------------------------------------------------------------
        String sentence2 = "I love Java, Java is cool";
        sentence2 = sentence2.replaceFirst("Java", "Python");
        System.out.println(sentence2);
        //-------------------------------------------------------------

        String sentence3 = "Java is fun, Java is cool, Java is amazing";
        sentence3=sentence3.replaceFirst(", Java", ", Python");
        System.out.println(sentence3);
        //-------------------------------------------------------------

        String sentence4 = "I love Java Programming";
        sentence4 = sentence4.substring(7,10+1); // Java
        System.out.println(sentence4);

        //-------------------------------------------------------------

        String sentence5 = "Today is Sunday, Tomorrow is Monday";
        //                  0123456789...
        String today = sentence5.substring(9,14+1);
        System.out.println((today));
        //-------------------------------------------------------------

        String email = "CydeoSchoolJavaProgramming@gmail.com";
        int beginning = email.indexOf('@') + 1;
        int last = email.lastIndexOf('.');
        String domain = email.substring(beginning, last);
        System.out.println(domain);

        //-------------------------------------------------------------
        String sentence6 = "I love Java programming";
        //String r1 = sentence6.substring(7, sentence6.length());
        String r1 = sentence6.substring(7);
        System.out.println(r1);
        //-------------------------------------------------------------
        String sentence7 = "Today is Sunday, Tomorrow is Monday";

        String tomorrow = sentence7.substring(sentence7.lastIndexOf(' ') +1 );
        System.out.println(tomorrow);
       //-------------------------------------------------------------
        String sentence8 = "I study at Cydeo School";
        String schoolName = sentence8.substring(11);
        System.out.println(schoolName);
        System.out.println("-------------------------------------------------------------");

        String str = "Python";
        String result = (str + "\n").repeat(10);
        System.out.println(result);














    }
}
