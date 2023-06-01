package day13_customMethods;

public class ReturnMethodPractice {

    public static void main(String[] args) {
        System.out.println(isOdd(3));
        System.out.println(isEven(3));
        System.out.println(max(2,3));
        System.out.println(min(4, 8));

        int num =200;
        if(isEven(num)){
            System.out.println(num + " is even number");
        }else{
            System.out.println(num + " is even number");
        }


    }

    public static boolean isOdd(int num){
        return(num % 2 !=0)? true : false;
       /* boolean isOddNum;
        if (num%2==0) {
            isOddNum = true;
        }else{
            isOddNum = false;
        }
        return isOddNum;*/
    }
    public static boolean isEven(int num){
        return !isOdd(num);
    }
    public static double max (double n1, double n2){
        double result;
        if (n1>=n2) {
            result = n1;
        }else{
            result=n2;
        }return result;
    }
    public static double min(double n1, double n2){
        return n1<n2 ? n1 :n2;
    }


/*1. Create a method named isOdd, that can return true if a number is an odd number, otherwise returns false



2. Create a method named isEven, that can return true if a number is an even number, otherwise returns false


3. Create a method named max, that can return the maximum number between two numbers


4. Create a method named min, that can return the minimum number between two numbers


5.  Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
    Ex:
        combine("one", "eight")  ==> oneight


6. Create a method named frequencyOfWord that takes two arguments:
            1. sentence (String)
            2. word (String)

    The method should return the frequency of the word from the sentence

        Ex:
            frequencyOfWord("Java java jAvA", "java")  ==> 4


7. Create a method named title that takes a string arguments

    The method returns the proper capitalized version of the given argument

    Ex:
        title("jAvA") ===> Java

 */
}