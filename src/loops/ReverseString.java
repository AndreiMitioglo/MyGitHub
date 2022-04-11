package loops;

import utilities.ScannerHelper;

public class ReverseString {
    public static void main(String[] args) {
/*
Write a program that reads a name from user
Reverse the name and print it back

Test data:
Kaly

Expected output:
ylaK

Test data:
Abraham

Expected output:
maharbA
 */

        String name = ScannerHelper.getANameFromUser();
//
//        for(int i = name.length()-1; i >= 0; i--){
//            System.out.print(name.charAt(i));

                String reversedName = "";  // create a  empty beginning String
            for(int i = name.length()-1; i >= 0; i--){
                 reversedName += name.charAt(i); // add each char(i) //  n + h + o + J
            }
                System.out.print("The reverse name is = " +  reversedName); // not Sout.prinln();

    }
}
