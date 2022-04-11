package stringMethod;

import utilities.ScannerHelper;

import java.util.Scanner;

public class _12_contains {
    public static void main(String[] args) {
    /*

    Method Task: It is used to find out if a String contains another string or character
-It is non-static, and we can call it with an object
-it is a return type, and it returns a boolean
-It takes a String argument
     */


/*
Ask user to enter an address
If address contains "chicago" in any way, then print "You are in the club"
else, print "You are not in the club"

Chicago, CHICAGO, cHIcaGO
 */

String address = ScannerHelper.getAStringFromUser();

if (address.toLowerCase().contains("chicago"))

    System.out.println("You are in the club");

else System.out.println("You are not in the club");
//-----------------------------------2nd way ternery ------------------------------------
        System.out.println(address.toLowerCase().contains("chicago") ? "You are in the club" : "You are not in the club");
        System.out.println(address.toUpperCase().contains("CHICAGO") ? "You are in the club" : "You are not in the club");


    }
}
