package day16_nestedLoop;

public class frequencyOfACharacter {

    public static void main(String[] args) {
        
        String str = "ccccaaabbbcccc";
        char ch = 'c';
        
        int count = 0;

        for (int i = 0; i < str.length(); i++) {  // index numbers of string str
            if(str.charAt(i) == ch){   //if the character of the string is equal to the given charcter, it means  the given charcter has appeared in the string
                count ++;

            }
            
        }

        System.out.println(count);
        
    }
    
}
