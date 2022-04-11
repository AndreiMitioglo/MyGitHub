package controlStatement;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Practise01 {
    public static void main(String[] args) {

        /*
Write a Java program that ask user to enter 2 diff
integers
Print all the numbers between given 2 integers starting from
biggest to smallest (given numbers are included)
HOWEVER, do not print any number less than 10

5 9 -> 9 8 7 6 5

8 4 -> 8 7 6 5 4
 */
/*
\ 1. Ask user to enter 2 numbers
        2. Store number in int variables
        3. Compare numbers and find biggest and smallest
        4. Start a loop with below info
            StartPoint : max number
            EndPoint   : min number
            Update     : decrement
 */
        int num1 = ScannerHelper.getNumberFromUser();

        int num2 = ScannerHelper.getNumberFromUser();

        if (Math.max(num1, num2) >= 10) {
            for (int i = Math.max(num1, num2); i >= Math.min(num1, num2); i--) {  // from bigger to smallest (decrement);
                System.out.println(i);
                if (i == 10) break;  // break the loop at 10 ... descending from big to small
            }
        }
    }
}