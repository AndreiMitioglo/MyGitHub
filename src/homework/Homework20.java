package homework;

import collections.arraylist.IntegerArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework20 {
    /*
        Requirement: Task 1
    -Create a method called hasLowerCase()
    -This method will take a String argument, and it will return boolean true if there is lowercase letter and false if it doesn’t.

    Test Data 1: “”
    Expected Result 1: false

    Test Data 2: “JAVA”
    Expected Result 2: false

    Test Data 3: “125$”
    Expected Result 3: false

    Test Data 4: “hello”
    Expected Result 4: true

     */
    public static boolean hasLowerCase(String str) {
        boolean haslowerCase = false;
        for (int i = 0; i < str.length(); i++)
            if (Character.isLowerCase(str.charAt(i))) {
                haslowerCase = true;
                break;
            }
        return haslowerCase;
    }



  /*
      Requirement: TASK 2
    -Create a method called noZero()
    -This method will take one Integer ArrayList argument and it will return an ArrayList with all zeros removed from the original Integer ArrayList.

    NOTE: Assume that ArrayList size will be at least 1.

    Test Data 1: [1]
    Expected Result 1: [1]

    Test Data 2: [1, 1, 10]
    Expected Result 2: [1, 1, 10]

    Test Data 3: [0, 1, 10]
    Expected Result 3: [1, 10]

    Test Data 4: [0, 0, 0]
    Expected Result 4: []


   */

    public static ArrayList noZero(ArrayList<Integer> arr) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++)
            if (arr.get(i) != 0) arr1.add(arr.get(i));
        return arr1;
    }


 /*
    Requirement: TASK 3
    -Create a method called numberAndSquare()
    -This method will take an int array argument and it will return a multidimensional array with all numbers squared.

    NOTE: Assume that array size is at least 1.

    Test Data 1: [1, 2, 3]
    Expected Result 1: [[1, 1], [2, 4], [3, 9]]

    Test Data 2: [0, 3, 6]
    Expected Result 2: [[0, 0], [3, 9], [6, 36]]

    Test Data 3: [1, 4]
    Expected Result 3: [[1,1], [4, 16]]


  */


    /* TASK 4
    Requirement:
-Create a method called containsValue()
-This method will take a String array and a String argument, and it will return a boolean. Search the variable inside of the array and return true if it exists in the array. If it doesn’t exist, return false.
NOTE: Assume that array size is at least 1.
NOTE: The method is case-sensitive

Test Data 1: [“abc”, “foo”, “java”], “hello”
Expected Result 1: false

Test Data 2: [“abc”, “def”, “123”], “Abc”
Expected Result 2: false

Test Data 3: [“abc”, “def”, “123”, “Java”, “Hello”], “123”
Expected Result 3: true

Hint: Use binarySearch() for easy solution

 */
    public static boolean containsValue(String[] array, String argument) {
//    boolean containsValue = false;
//    for (String s : array ) {
//        if (s.equals(argument)) containsValue= true;
//    }
//    return containsValue;

        return Arrays.binarySearch(array, argument) >= 0;
    }





    /* Task 5
    Requirement:
    -Create a method called reverseSentence()
    -This method will take a String argument and it will return a String with changing the place of every word. All words should be in reverse order. Make sure that there are two words inside the sentence at least. If there is no two words return “There is not enough words!”.

    NOTE: After you reverse, only first letter must be uppercase and the rest will be lowercase!

    Test Data 1: “Hello”
    Expected Result 1: “There is not enough words!”

    Test Data 2: “Java is fun”
    Expected Result 2: “Fun is java”

    Test Data 3: “This is a sentence”
    Expected Result 3: “Sentence a is this”

    Hint: Use split() for easy solution
    Note: Make the new first word’s first letter upper case and make the old first word’s first letter lower case

 */

    public static String reverseSentence(String str) {
        boolean countains2Words = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.trim().charAt(i))) countains2Words = true;
        }
        String reverse = "";
        String[] split;
        if (countains2Words) {
            split = str.split(" ");
               for(int i = split.length-1; i >= 0; i--)
                   reverse+=split[i]+" ";

        } else System.out.println("There is not enough words!");

//        return  reverse.toUpperCase().substring(reverse.indexOf(0),reverse.indexOf(1)) + (reverse.substring(reverse.indexOf(1), reverse.indexOf(reverse.length()-2)))
//                + reverse.toUpperCase().substring(reverse.indexOf(reverse.length()-3));

return reverse;
    }


/*
    Requirement: TASK 6
    -Create a method called removeStringSpecialsDigits()
    -This method will take a String as argument, and it will return a String without the special characters or digits.
    NOTE: Assume that String length is at least 1.
    NOTE: Do not remove spaces.

    Test Data 1: “123Java #$%is fun”
    Expected Result 1: “Java is fun”

    Test Data 2: “Selenium”
    Expected Result 2: “Selenium”

    Test Data 3: “Selenium 123#$%Cypress”
    Expected Result 3: “Selenium Cypress”

 */

     public static String removeStringSpecialsDigits(String str){
// String s = "";
// for (int i=0; i<str.length(); i++){
//     if (Character.isLetter(str.charAt(i)) || Character.isWhitespace(str.charAt(i))) s+= str.charAt(i);
// }
//     return s;
     str= str.replaceAll("[^a-zA-Z ]","");
     return str;
 }

/*
    Requirement: TASK 7
    -Create a method called removeArraySpecialsDigits()
    -This method will take a String array as argument, and it will return a String array without the special characters or digits from the elements.
    NOTE: Assume that array size is at least 1.

    Test Data 1: [“123Java”, “#$%is”, “fun”]
    Expected Result 1: [“Java”, “is”, “fun”]

    Test Data 2: [“Selenium”, “123$%”, “###”]
    Expected Result 2: [“Selenium”, “”, “”]

    Test Data 3: [“Selenium”, “123#$%Cypress”]
    Expected Result 3: [“Selenium”, “Cypress”]

 */

  public static String[] removeArraySpecialsDigits(String[] arr){
      String[] removed = new String[arr.length];

      for (int i=0; i< arr.length; i++) {
          String a = "";
          for (int j=0; j< arr[i].length(); j++){

              if (!Character.isDigit(arr[i].charAt(j))&& Character.isLetter(arr[i].charAt(j)) ) a+=arr[i].charAt(j);
          }
          removed[i]=a;
      }
      return removed;
  }



      /*TASK 8
      Requirement:
    -Create a method called removeAndReturnCommons()
    -This method will take two String ArrayList and it will return all the common words as String ArrayList.
    NOTE: Assume that both ArrayList sizes are at least 1.

    Test Data 1: [“Java”, “is”, “fun”], [“abc”, “xyz”, “123”]
    Expected Result 1: []

    Test Data 2: [“Java”, “is”, “fun”], [“Java”, “C#”, “Python”]
    Expected Result 2: [“Java”]

    Test Data 3: [“Java”, “C#”, “C#”], [“Python”, “C#”, “C++”]
    Expected Result 3: [“C#”]

   */

     public static ArrayList<String> removeAndReturnCommons(ArrayList<String> arr1, ArrayList<String> arr2){
         ArrayList<String> arr3 = new ArrayList<>();

    for (int i = 0; i< arr1.size(); i++){

        for (int j = 0; j <arr2.size() ; j++) {
            if (arr1.get(i).equals(arr2.get(j))) {
                arr3.add(arr1.get(i));
            }
        }
    }

        return arr3;
     }

    /*
    Requirement: TASK 9
    -Create a method called noXInVariables()
    -This method will take an ArrayList argument, and it will return an ArrayList with all the x or X removed from elements.
    If the element itself equals to x or X or contains only x letters, then remove that element.
    NOTE: Assume that ArrayList size is at least 1.

    Test Data 1: [abc, 123, #$%]
    Expected Result 1: [abc, 123, #$%]

    Test Data 2: [xyz, 123, #$%]
    Expected Result 2: [yz, 123, #$%]

    Test Data 3: [x, 123, #$%]
    Expected Result 3: [123, #$%]

    Test Data 4: [xyXyxy, Xx, ABC]
    Expected Result 4: [yyy, ABC]

 */

public static ArrayList noXInVariables(ArrayList arr){

        for (int i=0; i< arr.size(); i++){
            if(arr.get(i).toString().contains("x")) arr.remove(arr.get(i));
        }
    return arr;

    }





    public static void main(String[] args) {
      String str = " JAVA";
        System.out.println(hasLowerCase(str));
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(10);

        System.out.println((noZero(arr)));



        String[] s = {"abc", "foo","123", "Hello"};
        String s1 = "123";

       // System.out.println(containsValue(s,s1));


        System.out.println(containsValue(s, s1));

       // System.out.println(reverseSentence("Java is fun"));
        System.out.println(removeStringSpecialsDigits("Selenium 123#$%Cypress"));

        String[] b ={"123Java", "#$%1is", "fun"};
        System.out.println(Arrays.toString(removeArraySpecialsDigits(b)));


        ArrayList<String> d= new ArrayList<>();
        d.add("Java");
        d.add("C#");
        d.add("C#");


        ArrayList<String> c= new ArrayList<>();
        c.add("Python");
        c.add("C#");
        c.add("C++");


        System.out.println(removeAndReturnCommons(d,c));

        ArrayList<Object> a = new ArrayList<>();
        a.add("xyz");
        a.add("123");
        a.add("#$%");
        a.add("x");

        System.out.println(noXInVariables(a));

    }

}
