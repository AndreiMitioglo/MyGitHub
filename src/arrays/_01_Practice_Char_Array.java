package arrays;

import utilities.CharacterHelper;

import java.util.Arrays;

public class _01_Practice_Char_Array {
    public static void main(String[] args) {
        System.out.println("\n\t  -------- Task 1 --------");

/*
TASK-1
Create a char array and store values below
#
$
5
A
b
H
Print the array
 */
        char[] characters = {'#', '$', '5', 'A', 'b', 'H'};
        System.out.println(Arrays.toString(characters)); //[#, $, 5, A, b, H]
        System.out.println(characters); // location // #$5AbH

//=========================================================================
        System.out.println("\n\t  -------- Task 2 --------");

/*
TASK-2
Print the size of the array with a message

EXPECTED:
The size of the array is = 6
 */

        System.out.println("The size of the array is = " + characters.length);// The size of the array is = 6

        //============================================================================
        System.out.println("\n\t  -------- Task 3 --------");

/*
TASK-3
Print each element using fori loop

EXPECTED:
#
$
5
A
b
H
 */
        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }

//=====================================================================
        System.out.println("\n\t  -------- Task 4 --------");

/*
TASK-4
Print each element using for each loop

EXPECTED:
#
$
5
A
b
H
*/
        for (char element : characters) {
            System.out.println(element);
        }

        //==========================================================================
        System.out.println("\n\t  -------- Task 5 --------");
/*
TASK-5
Print each element that are letters

EXPECTED:
A
b
H
 *///   char[] characters = {'#', '$', '5', 'A', 'b', 'H'};
        for (char i = 0; i < characters.length; i++) {
            if (CharacterHelper.isLetter(characters[i])) System.out.println(characters[i]);
        }

         for (char element : characters) {
             if (CharacterHelper.isLetter(element)) System.out.println(element);
         }

        //===========================================================
        System.out.println("\n\t  -------- Task 6 --------");
/*
TASK-6
Count how many uppercase characters you have in the array

EXPECTED:
2
 */
        //char[] characters = {'#', '$', '5', 'A', 'b', 'H'};
        int counter = 0;
        for (char i = 0; i < characters.length; i++) {
            if (Character.isUpperCase(characters[i]))
                counter++;

        } System.out.println(counter);

        int counter1 = 0;
        for (char element : characters) {
           if  (Character.isUpperCase(element));
           counter1++;
            System.out.println(counter1);
        }


        }
}
