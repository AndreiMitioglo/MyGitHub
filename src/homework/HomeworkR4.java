package homework;

import utilities.CharacterHelper;

public class HomeworkR4 {



        /*  TASK 1
        Requirement:
-Create a method called noSpace()
-This method will take one String argument and it will return a new String with all spaces removed from the original String

Test Data 1: “”
Expected Result 1: “”

Test Data 2: “Java”
Expected Result 2: “Java”

         */

    public static String noSpace(String str) {
        return str.replaceAll(" ", "");
    }

        /* TASK 2
        Requirement:
-Create a method called replaceFirstLast()
-This method will take one String argument and it will return a new String with first and last characters replaced

NOTE: if the length is less than 2, then return empty String
NOTE: Ignore all before and after spaces (get actual String only)

Test Data 1: “”
Expected Result 1: “”

Test Data 2: “A”
Expected Result 2: “”

         */

    public static String replaceFirstLast(String str) {
        if (str.length()<2) return "";
        else {
            String first = str.charAt(0) + ""; // str.substring(0,1);
            String middle = str.substring(1, str.length()-1);
            String last = str.substring(str.length()-1) ;
            return last + middle + first;
        }
    }


/*
Requirement:
-Create a method called hasVowel()
-This method will take one String argument and it will return a boolean checking if String has any vowel or not

NOTE: Vowels are = a, e, o, u, I
NOTE: Ignore cases

Test Data 1: “”
Expected Result 1: false


 */

    public static boolean hasVowel(String str) {
        boolean isVowel = false;
        for (int i = 0; i < str.length(); i++) {
            if (CharacterHelper.isVowel(str.charAt(i))) isVowel = true;
        }
        return isVowel;

    }





    public static void main(String[] args) {
        System.out.println(replaceFirstLast("Hello"));
        System.out.println(hasVowel("1234"));
    }



}