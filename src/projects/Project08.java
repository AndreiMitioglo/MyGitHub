package projects;

import java.util.ArrayList;
import java.util.Locale;

public class Project08 {
    /*
    TASK-1 - countMultipleWords() method
•Write a method that takes a String[] array as an argument and counts
   how many strings in the array has multiple words
•This method will return an int which is the count of multiple words
•NOTE: be careful about these as they are not multiple words ->“”,    “   “,    “    abc”,  “abc   “
     */


    public static int countMultipleWords(String[] str) {
        int count = 0;
        for (String word : str) {
            if (word.trim().contains(" ")) count++;
        }
        return count;
    }

/*
TASK-2 - removeNegatives() method
•Write a method that takes an “ArrayList<Integer> numbers” as an argument and
removes all negative numbers from the given list if there are any
•This method will return an ArrayList with removed negatives
 */

    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> a) {
        ArrayList<Integer> b = new ArrayList<>();
        for (Integer number : a) {
            if (number >= 0) b.add(number);
        }
        return b;
    }

    /*
    TASK-3 - validatePassword() method
•Write a method that takes a “String password” as an argument and checks if the given password is valid or not
•This method will return true if given password is valid, or false if given password is not valid
•A VALID PASSWORD:
	-should have length of 8 to 16 (length of 7 or 17 should return false)
	-should have at least 1 digit, 1 uppercase, 1 lowercase and 1 special char
	-should NOT have any space
     */

    public static boolean validatePassword(String password) {
        boolean validate = false;
        if (!password.isEmpty() && (password.length() >= 8 && password.length() <= 16)) {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i)) && Character.isLowerCase(password.charAt(i)) &&
                        Character.isDigit(password.charAt(i)) && (!Character.isWhitespace(password.charAt(i)))) {
                    validate = true;
                }
                if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i)))
                    validate = true;

            }
            return validate;

        }
        return false;

    }

    /*
    TASK-4 - validateAddress() method
•Write a method that takes a “String ” as an argument and checks if the given  is valid or not
•This method will return true if given  is true, or false if given  is not valid
•A VALID :
	-should NOT have any space
	-should not have more than one “@” character
	-should be in the given format <2+chars>@<2+chars>.<2+chars>
     */


//    public static boolean validateAddress(String ) { // not working
//
//        int count = 0;
//        boolean validate = false;
//        for (int i = 2; i < .length(); i++) {
//            if (.contains("@")) count++;
//
//        if ((!.contains(" ")) && count <= 1) {
//            if (((.charAt(i)>=65 && .charAt(i)<=90) || (.charAt(i)>=97 && .charAt(i)<=122)) &&
//            (.charAt(i+1)>=65 && .charAt(i+1)<=90) || (.charAt(i+1)>=97 && .charAt(i+1)<=122)) &&
//            (.charAt(i)= 46)
//            validate = true;
//        } return false;
//
//        }

 //    }

    public static boolean validateEmailAddress(String email) {
        return (((email.indexOf("@") == email.lastIndexOf("@")  && email.contains("@")))
    && (email.indexOf(".") == email.lastIndexOf(".") && email.contains("."))
    && (email.length() - email.indexOf(".")+1 >= 2) && (email.lastIndexOf(".")- email.indexOf(".") >2)
            &&(email.indexOf("@") >1));
    }


        public static void main(String[] args){
  String[] str ={"foo",""," ", "foo bar","java is fun","ruby"};

    System.out.println(countMultipleWords(str));;
    ArrayList<Integer> a = new ArrayList<>();
   a.add(2);
   a.add(-5);
   a.add(6);
   a.add(7);
   a.add(-10);
   a.add(-78);
   a.add(0);
   a.add(15);

    System.out.println(countMultipleWords(str));



    System.out.println(removeNegatives(a));

//String password = "Abcd123!";
//String password = "abcd1234";
//String password = "Abcd123!";

    //System.out.println(validatePassword(password));

String email = "@gmail.com";
            System.out.println(validateEmailAddress(email));

}

}

