package day16_nestedLoop;

public class friquencyOfWord {
    public static void main(String[] args) {

        String sentcence = "java JAVA jAvA JAva";
        String word = "java";
        sentcence = sentcence.toLowerCase();
        word = word.toLowerCase();


        int count = 0;

        while (sentcence.contains(word)){
            count ++;
            sentcence= sentcence.replaceFirst(word, "");

        }

    }
}
/*

	3.  Write a program that can return the frequency of the word java from a sentence
		    Ex:
		        sentence = "java JAVA jAvA JAva"

		    output:
		        4
 */