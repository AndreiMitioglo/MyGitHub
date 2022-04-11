package utilities;

public class CharacterHelper {
    // ----------- Task 1 --------------------

    /*
    Create a method called isSpace()
-It should be public and static
-It should be a return type and must return a boolean
-It should take a char argument
-It should return true if the given char is space, return false if the given char is not a space.
     */
    public static boolean isSpace(char character) { // taking char returning boolean
        return character == ' '; // 32 ASCII table
    }

    // -------------Task 2----------------------
    public static boolean isDigit(char character) {
        return character >= 48 && character <= 57; // or character >= '0' && character <= '9';
    }

    // -----------Task 3 ---------------------

    public static boolean isUppercase(char character) {
        return character >= 65 && character <= 90; //   character >= 'A' && character <= 'Z';
    }

    // -----------Task 4---------------------

    public static boolean isLowercase(char character) {
        return character >= 97 && character <= 122;
    }

    // ------------Task 5-------------------

    public static boolean isLetter(char character) {
        return isLowercase(character) || isUppercase(character); // if is in the same class
                                        // no need to call with class name
    }

//  ------------ Task 6 -------------------------

    public static boolean isVowel(char character) {
        return  character == 'A' || character == 'E' || character == 'O' || character == 'U' ||
                character == 'I' || character == 'a' || character == 'e' ||
                character == 'o' || character == 'u' || character == 'i';
    }

//  -------- Task 7 --------------------------

    /*
    TASK-7
-Create a method called isConsonant()
-It should be public and static
-It should be a return type and must return a boolean
-It should take a char argument
-It should return true if the given char is a consonant letter, return false if the
given char is not a consonant letter
NOTE: Consonant letters are any number represented from 65 to 90 and
from 97 to 122 in the ASCII Table but not vowels (A,E,O,U,I,a,e,o,u,i) or
specials etc
     */
    public static boolean isConsonant(char character) {
     return isLetter(character) && !isVowel(character) ;
    }




}
