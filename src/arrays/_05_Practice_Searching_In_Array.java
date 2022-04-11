package arrays;

import java.util.Arrays;

public class _05_Practice_Searching_In_Array {

    public static void main(String[] args) {

        System.out.println("\n----------------Task 1 ------------");

/*
TASK-1
Check the collection you have above and print true if it contains Mouse
Print false otherwise
 */

        String[] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "iPad"};

        boolean hasMouse = false;
        for (String object : objects) {
            if (object.equals("Mouse")) {
                hasMouse = true;
                break;  // break if find zero, the first 1
            }

        }  System.out.println(hasMouse);

        System.out.println("\n----------------Task 2 ------------");

/*
TASK-2
Check the collection you have above and print true if one of the element is board
Print false otherwise

RESULT:
false
*/

// String[] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "iPad"};

        boolean isOneTheCollectionBoard = false;
        for (String object : objects) {
            if (object.equals("board")) {
                isOneTheCollectionBoard = true;
                break;
            }

        }  System.out.println(isOneTheCollectionBoard);

        System.out.println("\n----------------Task 3 ------------");

        Arrays.sort(objects); // My array is sorted "Keyboard", "Mouse","Mouse", "Remote", "iPad"
        //                       0         1       2        3       4

        System.out.println(Arrays.binarySearch(objects, "iPad") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Mouse") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Apple") >= 0); // false
        System.out.println(Arrays.binarySearch(objects, "Keyboard") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Key") >= 0); // false


        System.out.println("\n------------- Task 4 ------------");
/*
TASK-4
Create an int array to store below data
{5, -2, 0, -7, 0, 5, 8, 45, 53}

Check if collection has 5
Check if collection has 0
Check if collection has 45
Check if collection has 3

RESULT:
true
true
true
false
 */
        int[] num = {5, -2, 0, -7, 0, 5, 8, 45, 53};
        Arrays.sort(num); // -7, -2, 0, 0, 5, 5, 8 ,45, 53

        System.out.println(Arrays.binarySearch(num, 5)); // 4 index of 5 in the array

        System.out.println((Arrays.binarySearch(num, 5) >=0)); // true
        System.out.println((Arrays.binarySearch(num, 0) >=0)); // true
        System.out.println((Arrays.binarySearch(num, 45) >=0)); // true
        System.out.println((Arrays.binarySearch(num, 3) >=0)); // false






    }
}