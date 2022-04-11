package arrays;

import java.util.Arrays;

public class _02_Practice_String_Array {

    public static void main(String[] args) {

        /*
        TASK-1
        Create a String array and store below data
        Name of the array will be students

         Alex
        Tom
        John
        James
        Jordan
        Lionel
          Adam

        1. Print the array
        2. Sort the array and print it again

        EXPECTED:
        Unsorted array = [Alex, Tom, John, James, Jordan, Lionel, Adam]
        Sorted array = [Adam, Alex, James, John, Jordan, Lionel, Tom]
 */

        String[] students = {"Alex", "Tom", "John", "James", "Jordan", "Lionel", "Adam"};
        System.out.println("Unsorted array = " + Arrays.toString(students));
        Arrays.sort(students);

        System.out.println("Sorted array = " + Arrays.toString(students));
//=============================================================================
        /*
TASK-2
Print the first and the last names after it is sorted

EXPECTED:
First name is = Adam
Last name is = Tom
 */

        System.out.println("First name is = " + students[0]);
        System.out.println("Last name is = " + students[students.length - 1]);

//===============================================================================
/*
TASK-3
[Adam, Alex, James, John, Jordan, Lionel, Tom]

Count how many names starts with A

EXPECTED:
2
 */
        //String[] students = {"Alex", "Tom", "John", "James", "Jordan", "Lionel", "Adam"  };

        //    for each loop

        int counterA = 0;
        for (String student : students) {
            if (student.charAt(0) == 'A') counterA++;

        }
        System.out.println(counterA);
//===================================================================================
/*
  /*
        TASK-4
[Adam, Alex, James, John, Jordan, Lionel, Tom]

Count how many names starts with A-a or E-e;

EXPECTED:
5
 */

        // for each loop
        int counter = 0;
        for (String student : students) { // elements.toLowerCase() == "a"  or elements.toLowerCase().contains("a";
            if (student.toLowerCase().contains("a") || student.toLowerCase().contains("e")) counter++;

        }
        System.out.println(counter);
        //=================================================================
/*
TASK-5
[Adam, Alex, James, John, Jordan, Lionel, Tom]

Count how many names has at least 5 characters 5,6,7,8,9,.....

EXPECTED:
3
 */
        //String[] students = {"Alex", "Tom", "John", "James", "Jordan", "Lionel", "Adam"  };
        int count = 0;
        for (String student : students) {
            if (student.length() >= 5) count++;
        }
        System.out.println(count);

//=====================================================================
// String[] students = {"Alex", "Tom", "John", "James", "Jordan", "Lionel", "Adam"  };
// check if Array contains Jennifer
        boolean hasJennifer = false;
        for (String student : students) {
            if (student.equals("Jennifer"))  {
                hasJennifer = true;
                break;
            }
        }
        System.out.println(hasJennifer); // false
    }
}