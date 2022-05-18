package homework;

import utilities.CharacterHelper;

import java.util.Arrays;

public class Homework19 {
  /*  TASK 1
    Requirement:
    -Create a method called noDigit()
    -This method will take one String argument and it will return a new String with all digits removed from the original String

    Test Data 1: “”
    Expected Result 1: “”

    Test Data 2: “Java”
    Expected Result 2: “Java”


 */

    public static String noDigit(String str) {

//    str = str.replaceAll("[0-9]", "");
//    return str;


        String s1= "";
        for (int i=0 ; i<str.length(); i++){
            if (!Character.isDigit(str.charAt(i))) s1 += str.charAt(i);
        }
        return s1;
    }
 /*  TASK 2
     Requirement:
    -Create a method called noVowel()
    -This method will take one String argument, and it will return a new String with all vowels removed from the original String

    Test Data 1: “”
    Expected Result 1: “”

    Test Data 2: “xyz”
    Expected Result 2: “xyz”

  */


    public static String noVowel(String str){

//    str= str.replaceAll("[aeiouAEIOU]", "");
//    return str;

        String s2 = "";
        for (int i=0 ; i<str.length(); i++){
            if (!CharacterHelper.isVowel(str.charAt(i))) s2 += str.charAt(i);
        }
        return s2;

    }

    /* Task 3
     -Create a method called sumOfDigits()
    -This method will take one String argument, and it will return an int sum of all digits from the original String.

    NOTE: Return zero if there is no digits in the String

    Test Data 1: “”
    Expected Result 1: 0

    Test Data 2: “Java”
    Expected Result 2: 0

    Test Data 3: “John’s age is 29”
    Expected Result 3: 11

    Test Data 4: “$125.0”
    Expected Result 4: 8

 */

    public static int sumOfDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) sum += Integer.valueOf(str.charAt(i)+"");
        }

        if (sum == 0) return 0;
        else return sum;

    }


/* TASK 4
Requirement:
-Create a method called hasUpperCase()
-This method will take one String argument, and it will return boolean true if there is an uppercase letter and false otherwise.

Test Data 1: “”
Expected Result 1: false

Test Data 2: “java”
Expected Result 2: false

Test Data 3: “John’s age is 29”
Expected Result 3: true

Test Data 4: “$125.0”
Expected Result 4: false

 */

    public static boolean hasUpperCase(String str) {


        boolean isUpperCase = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                isUpperCase = true;
                break;

            }

        }
        return isUpperCase;

    }

    /* Task 5
        Requirement:
    -Create a method called middleInt()
    -This method will take three int arguments, and it will return the middle int.

    Test Data 1: 1, 1, 1
    Expected Result 1: 1

    Test Data 2: 1, 2, 2
    Expected Result 2: 2

    Test Data 3: 5, 5, 8
    Expected Result 3: 5

    Test Data 4: 5, 3, 5
    Expected Result 4: 5

    Test Data 4: -1, 25, 10
    Expected Result 4: 10


     */
    public static int middleInt(int a, int b, int c){
        int max = Math.max(a, Math.max(b,c));
        int min = Math.min(a, Math.min(b,c));

        if(a != max && a != min) return a;
        else if (b != max && b != min) return b;
        else return c;


    }
    /*
    Requirement:
    -Create a method called no13()
    -This method will take an int array as argument and it will return a new array with all 13 replaced with 0.

    NOTE: Assume length will always be more than zero.

    Test Data 1: [1, 2, 3 ,4]
    Expected Result 1: [1, 2, 3 ,4]

    Test Data 2: [13, 2, 3 ]
    Expected Result 2: [0, 2, 3 ]

    Test Data 3:[13, 13, 13 , 13, 13]
    Expected Result 3: [0, 0, 0, 0, 0]

     */

    public static int[] no13(int[] arr){

        int[] a = new int[arr.length];
        for (int i=0; i< arr.length; i++){
            if(arr[i] !=13) a[i]= arr[i];
            else a[i]=0;
        }
        return a;
    }

/* TASK 7

    Requirement:
    -Create a method called arrFactorial()
    -This method will take an int array as argument, and it will return the array with every number replaced with their factorials.

    NOTE: Assume length will always be more than zero.
    NOTE: 0! is equals to 1

    Test Data 1: [1, 2, 3, 4]
    Expected Result 1: [1, 2, 6, 24]

    Test Data 2: [0, 2, 4 , 1]
    Expected Result 2: [1, 2, 24, 1]

    Test Data 3:[5 , 0, 6]
    Expected Result 3: [120, 1, 720]


 */


    public static int[] arrFactorial(int[] arr){
        int[] factorial = new int[arr.length];

        for (int i=0; i<arr.length; i++){
            int fact = 1;
            for(int j=2; j<= arr[i]; j++){
                fact *= j;

            }
            factorial[i]= fact;
        }
        return factorial;

    }


    /* TASk 8
    Requirement:
    -Create a method called categorizeCharacters()
    -This method will take String as an argument and return a String array as letters at index of 0, digits at index of 1 and specials at index of 2.
    NOTE: IGNORE SPACES

    NOTE: Assume length will always be more than zero.

    Test Data 1: “     ”
    Expected Result 3: [ , , ]

    Test Data 2: “abc123$#%”
    Expected Result 2: [abc, 123, $#%]

    Test Data 3: “12ab$%3c%”
    Expected Result 3: [abc, 123, $%%]

 */

    public static String[] categorizeCharacters(String str) {
        String[] arr1 = new String[3];
        String letter = "";
        String digit = "";
        String special = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) letter += str.charAt(i);
            else if (Character.isDigit(str.charAt(i))) digit += str.charAt(i);
            else if (!(Character.isLetterOrDigit(str.charAt(i)) && Character.isWhitespace(str.charAt(i))))
                special += str.charAt(i);
            arr1[0]=letter;
            arr1[1]=digit;
            arr1[2]=special;

        }
        return arr1;

    }




    public static void main(String[] args) {
        String str= "123Hello World 345";
        System.out.println(noDigit(str));
        String s2 = "TechGlogal";
        System.out.println(noVowel(s2));

        String s3 = "John’s age is 29 #";
        System.out.println(sumOfDigits(s3));
        System.out.println(hasUpperCase(s3));

        System.out.println(middleInt(5,5,5));
        System.out.println(middleInt(-1, 25, 10));
        System.out.println(middleInt(1,2,2));

        int[] arr = {0,2,4,1};
        System.out.println(Arrays.toString(no13(arr)));

        System.out.println(Arrays.toString(arrFactorial(arr)));
        System.out.println(Arrays.toString(categorizeCharacters(s3)));
    }
}



