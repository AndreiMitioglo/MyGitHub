package projects;

import java.util.ArrayList;
import java.util.Iterator;
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

//    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> a) {
//        ArrayList<Integer> b = new ArrayList<>();
//        for (Integer number : a) {
//            if (number >= 0) b.add(number);
//        }
//        return b;
//    }


    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers) {
        Iterator<Integer> it = numbers.iterator();
        // I am not assigning next() into a variable cuz I am calling it ONCE
        while (it.hasNext()) if (it.next() < 0) it.remove();
        return numbers;
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
        //length --> length()
        //1 digit, 1 uppercase, 1 lowercase and 1 special char --> inside a loop Character class methods for checking
        //should NOT have any space --> contains();

        int dg = 0, up = 0, lo = 0, spe = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) dg++;
            else if (Character.isUpperCase(password.charAt(i))) up++;
            else if (Character.isLowerCase(password.charAt(i))) lo++;
            else spe++;
        }

        return (password.length() >= 8 && password.length() <= 16) // --> length validation
                && (dg > 0 && up > 0 && lo > 0 && spe > 0) //--> 1 digit, 1 uppercase, 1 lowercase and 1 special char validation
                && !(password.contains(" ")); // --> space check validation

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





    /*
    //Solution without regex
    public static boolean validateEmail(String str){
        if(str.contains(" ") || !str.contains("@") || !str.contains(".") || str.length() < 8 ||
                (str.indexOf("@") != str.lastIndexOf("@"))) return false;

        return str.substring(0, str.indexOf("@")).length() >= 2 &&
                str.substring(str.indexOf("@")+1, str.indexOf(".")).length() >= 2 &&
                str.substring(str.lastIndexOf(".")+1).length() >= 2;
    }
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

      /*
      TASK-4 - validateEmailAddress() method
    •Write a method that takes a “String email” as an argument and checks if
    the given email is valid or not
    •This method will return true if given email is true, or false if given email is
    not valid
    •A VALID EMAIL:
    -should NOT have any space
    -should not have more than one “@” character
    -should be in the given format <2+chars>@<2+chars>.<2+chars>
                                    ab@gm.co        --> L = 7, lDot = 5
                                    0123456789      --> L - lDot >= 3
     */

        public static boolean validateEmailAddress(String email) {
            // +validation of . --> after the @ sign there shouldn't be more than 1 .
            // +validation of @ --> only 1 @ AND and email contains
            // +validation of first part --> (0, index of @ ) >= 2
            // validation of second part --> (index of @ + 1, last index of . ) >= 2
            // validation of first part --> (last index of . + 1) >= 2
            int cD = 0, iAt = email.indexOf("@"), lAt = email.lastIndexOf("@"), lDot = email.lastIndexOf(".");
            for (int i = lAt + 1; i < email.length(); i++) if (email.charAt(i) == '.') cD++;
            return cD == 1 && (iAt == lAt && email.contains("@")) && lAt >= 2 && lDot - lAt >= 3 && email.length() - lDot >= 3;
        }


    public static void main(String[] args) {
        String[] str = {"foo", "", " ", "foo bar", "java is fun", "ruby"};

        System.out.println(countMultipleWords(str));
        ;
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


    }
}



