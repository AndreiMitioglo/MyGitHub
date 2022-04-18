package homework;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Homework17 {
        /* TASK 1
            Write a method that takes a String sentence as an argument a returns the String
             with the ‘_’ instead of spaces between words.
        NOTE: You must use regex

    Example program1:
    String str = “   hello  ”;
    Program: hello

         */

    public static String s(String str){

     return str.trim().replace(' ', '_');
}


/*  TASK 2
    Write a method that takes a String as an argument a returns how many vowels are in the String.
    NOTE: You must use regex

    Example program1:
    String str = “hello”;
    Program: 2

 */

    public static int vowel(String str){
        str= str.replaceAll("[^aeiouAEIOU]","");

        return str.length();
    }

/*  TASK 3
    Write a method that takes a String as an argument and returns a String array with all the words in the String.
    NOTE: Make as dynamic as possible.
    NOTE: You must use regex

    Example program1:
    String str = “hello”;
    Program: [hello]

 */

      public static String[] sArray(String str){


    str = str.trim().replaceAll("[^a-zA-Z0-9 ,]", " ");

    String[] s = str.split(" ");

    return s;

  }

/* Task 4
    Write a method that takes a String email as an argument and checks if the
     given email matches the given email requirements.
    This method would return a true or false boolean
    A valid email consists of no spaces, must include one @ symbol.
    Format: <2+chars>@<2+chars>.<2+chars>
    NOTE: Do not use any type of loop. Use Regex

    Example program1:
    String email = “abc@gmail.com”;
    Program: true

 */

public static boolean validateEmail(String email){

  return  Pattern.matches("[a-zA-Z]{2}@[a-zA-Z]{2}.[a-zA-Z]{2}", email);

}



/* TASK 5
    Write a method that takes a String that contains numbers and letters as an argument.
     This method should separate the numbers and letters into two String arrays and prints them out.
    NOTE: Do not use any type of loop. Use Regex

    Example program1:
    String str = “abc123”;
    Program:  Numbers: [a,b,c]
           Letters: [1,2,3]

 */

    public static void  separateString(String str){
        String str1 = str.replaceAll("[a-zA-Z]", "");
        String[] a = str1.split("");



        String str2 = str.replaceAll("[0-9]", "");
        String[] b = str2.split("");

        System.out.println("Letters : " + Arrays.toString(b));
        System.out.println("Number : " + Arrays.toString(a));
    }












    public static void main(String[] args) {
//// String str = " hello ";
// String str= "java is fun";
//        System.out.println(s(str));
//

//
//        String s="";
//        System.out.println(vowel(s));

        String str = "Hello, nice to meet you!";

        System.out.println(Arrays.toString(sArray(str)) );

//        String str = "lo@gs.o";
//        System.out.println(validateEmail(str));

//        String str = "abc123";
//        separateString(str);

    }
}

