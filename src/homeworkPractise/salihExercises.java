package homeworkPractise;

import utilities.ScannerHelper;

public class salihExercises {
    public static void main(String[] args) {





        // ----------- Task 2----------------

        /*
Create a method which will take an int for age and String as a name
  if the age is older than 30 and first letter is uppercase print out "Age and letter checks out"
  if the age is older than 30 and first letter is lowercase print out "Age checks out but letter doesn't"
  if the age is equal or younger than 30 and first letter is uppercase print out "Age doesn't check out but letter does"
  if the age is equal or younger than 30 and first letter is lowercase print out "Nothing checks out"
 */
//

    // public static void CheckNameAndAge ( String name, int age){

//          int age = ScannerHelper.getNumberFromUser();
//         String name = ScannerHelper.getANameFromUser();
//        char firstChar = name.charAt(0);
//
//        if (age > 30 && (firstChar >= 'A' && firstChar <= 'Z'))
//            System.out.println("Age and letter checks out");
//        else if (age > 30 && (firstChar >= 'a' && firstChar <= 'z'))
//            System.out.println("Age checks out but letter doesn't");
//        else if (age <= 30 && (firstChar >= 'A' && firstChar <= 'Z'))
//            System.out.println("Age doesn't check out but letter does");
//        else System.out.println("Nothing checks out");


//        public static void checkAgeAndName(String name, int age){
//            if(age > 30){
//                if(Character.isUpperCase(name.charAt(0))){
//                    // age is > 30 and firs letter is uppercase
//                    System.out.println("Age and letter checks out");
//                }
//                else{
//                    // age is > 30 and firs letter is lowercase
//                    System.out.println("Age checks out but letter doesn't");
//                }
//            }
//            else{
//                if(Character.isUpperCase(name.charAt(0))){
//                    // age is <= 30 and firs letter is uppercase
//                    System.out.println("Age doesn't check out but letter does");
//                }
//                else{
//                    // age is <= 30 and firs letter is lowercase
//                    System.out.println("Nothing checks out");
//  ===================== Task 3 ===================================
/*
        Requirement:
        check the number is in between 1 to 10 (1 and 10 are included)
        They will get some points based on numbers they
        entered. So, their points will be calculated as below
        1st  number will be multiplied by 15 and added as points
        2nd number will be multiplied by 10 and added as points
        3rd number will be multiplied by 5 and added as points
        If user enters any number that is not in the range,
        then user will not get any points from that number

        Test data:        15  10   5   1   1
        3 7 2 1 8         3   7    2   1   8
        Expected result:
        59
         */
        int point = 0, n1 = 3, n2 = 7, n3 = 2, n4 = 1, n5 = 8;

        if (n1 >= 1 && n1 <= 10)
            point += n1 * 15;
        else point += n1;
        if (n1 >= 2 && n2 <= 10)
            point += n2 * 10;
        else point += n2;
        if (n3 >= 1 && n3 <= 10)
            point += n3 * 5;
        else point += n3;
        if (n4 >= 2 && n4 <= 10)
            point += n4 * 1;
        else point += n4;
        if (n5 >= 1 && n5 <= 10)
            point += n5 * 1;
        else point += n5;

        System.out.println(point); // 134

        // ============== Task 4 =======================

        /*

        Create a method which will take an String as name and age
•if user age getting dividided by their name’s length without
any leftovers we will print out “Your age and name gets
along!” otherwise print out “Your age and name needs time :(”
•if name first letter is a vowel then print out “Starting with
vowels” otherwise print out “Starting with consonants I see”
•if the name ends with a consonant print out “Nice finish”
otherwise “Seen better”
•NOTE: If the given name and age is the same as yours print
out  “IMPOSTER!!!” nothing else (Ignore cases
         */

    }


}
