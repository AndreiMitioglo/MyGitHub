package stringMethod;

public class _05_toLowercase_toUppercase {
    public static void main(String[] args) {

        /*
          This method are used to convert letters of Strings to Uppercase or Lowercase
        - They are non-static methods that you can call them with object of String class
        - They are return type methods, and they return the modified String object back
        - They don't  take any arguments
         */

        String s1 = "HELLO World";

        System.out.println(s1); // HELLO Word
        System.out.println("HELLO WORLD".toLowerCase()); // hello world
        System.out.println(s1.toUpperCase()); // HELLO WORLD

        System.out.println("gdgdgdggggdeSSDD45567&&Gbmmm".toLowerCase()); // converting all to lower case
        System.out.println("gdgdgdggggdeSSDDG&&89%bmmm".toUpperCase()); // converting all to upper case,
        // except the special characters

String sentence = "I paid $100.99 to buy airpods";
String s2 = sentence.toLowerCase(); // i paid $100.99 to buy airpods
String s3 = sentence.toUpperCase(); // I PAID $100.99 TO BUY AIRPODS
        System.out.println(s2.toUpperCase().toLowerCase().toUpperCase());


    }
}
