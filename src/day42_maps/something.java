package day42_maps;

public class something {
}
/*
public static int SummOfDigits (String str){
    int sum = 0;
    for (int i = 0; i < str.length(); i++) {
       if(str.charAt(i)>'0'&&str.charAt(i)<='9'){
           int e = str.charAt(i) - '0';
           sum = sum + e;
       }
    }
    return sum;
}

public static void main(String[] args) {
    System.out.println(SummOfDigits("ss-12+3"));
}


public static boolean PasswordValidations(String password){
    int lowerCase = 0;
    int digit = 0;
    int upperCase = 0;
    int specSimbol = 0;
    char[] arr = password.toCharArray();
    if(password.length()<6){
        return false;
    }else{
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i]>'0' &&arr[i]<='9'){
                digit++;
            }else if( arr[i]>='a'&&arr[i]<='z'){
                lowerCase++;
            }else if(arr[i]>='A'&&arr[i]<='Z'){
                upperCase++;
            }else if(arr[i]>='!'&&arr[i]<='.'){
                specSimbol++;
            }
        }


    }
    return  digit!=0 && lowerCase!=0 && upperCase!=0 && specSimbol!=0;
}

 */