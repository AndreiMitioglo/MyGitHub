package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework22 {
 /*
     Requirement: TASK 1
    -Create a method called fibonacciSeries1()
    -This method will take an int argument as n, and it will return n series of Fibonacci numbers as an int array.

    REMEMBER: Fibonacci series = 1, 1, 2, 3, 5, 8, 13, 21

    Test Data 1: 3
    Expected Result 1: [1, 1, 2]

    Test Data 2: 5
    Expected Result 2: [1, 1, 2, 3, 5]

    Test Data 3: 7
    Expected Result 3: [1, 1, 2, 3, 5, 8, 13]


  */


    public static int[] fibonacciSeries1(int n) {
        // 0 1 1 2 3 5
        int n0 = 0, n1 = 1, n2 = 0;
        int[] newArr = new int[n];
        for (int i = 1; i < newArr.length; i++) {

            newArr[i] = n1;
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;

        }
        return newArr;

    }


    /*
    public static int fibonacciSeries2Way2(int n){
    // 0 1 1 2 3 5
    int n0 = 0, n1 = 1, n2 = 0;
    for (int i = 1; i < n - 1; i++) {
        n2 = n0 + n1;
        n0 = n1;
        n1 = n2;
    }
    return n2;
}
=================================================

//  public static int[] fibonacciSeries1(int n){
//        /*
//          int[] fib;
//            if (n >= 0)fib = new int[n];
//            else fib = new int[0];
//         */
//    int[] fib = new int[n];
//
//        if (n > 0) fib[0] = 0;
//        if (n > 1) fib[1] = 1;
//
////        fib[2] = fib[1] + fib[0];
////        fib[3] = fib[2] + fib[1];
////        fib[4] = fib[3] + fib[2];
//
//    // n = 4 ==> [0, 1, 1, 2]
//
//        for (int i = 0; i < n - 2; i++) {
//        // n = 4
//        // i = 0 => 3rd number is found
//        // i = 1 => 4th number is found
//        fib[i + 2] = fib[i + 1] + fib[i];
//    }
//
//        return fib;
//}




    /*
        Requirement: TASK 2
    -Create a method called fibonacciSeries2()
    -This method will take an int argument as n, and it will return the nth series of Fibonacci number as an int.

    REMEMBER: Fibonacci series = 1, 1, 2, 3, 5, 8, 13, 21

    Test Data 1: 2
    Expected Result 1: 1

    Test Data 2: 4
    Expected Result 2: 3

    Test Data 3: 8
    Expected Result 3: 21


     */

    public static int fibonacciSeries2(int n) {
        int n0 = 0, n1 = 1, n2 = 0;
        int[] newArr = new int[n];
        for (int i = 1; i < n; i++) {
            newArr[0] = 0;
            newArr[1] = 1;
            newArr[i] = n2;
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;

        }
        return newArr[n - 1];
    }
    /*
    public static int fibonacciSeries2(int n){
        return fibonacciSeries1(n)[n -1];
    }
     */


    /*
        Requirement: TASK 3
    -Create a method called findUniques()
    -This method will take 2 int array argument and it will return an int array which has only the unique values
    from both given arrays.
    NOTE: If both arrays are empty, then return an empty array.
    NOTE: if one of the array is empty, then return unique values from the other array.

    Test Data 1: [], []
    Expected Result 1: []

    Test Data 2: [], [1, 2, 3, 2]
    Expected Result 2: [1, 2, 3]

    Test Data 3: [1, 2, 3, 4], [3, 4, 5, 5]
    Expected Result 3: [1, 2, 5]

    Test Data 4: [8, 9], [9, 8, 9]
    Expected Result 4: []

     */

    public static int[] findUniques(int[] a, int[] b) {
        System.out.println("Task 3");
        String str = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if ((a[i] != b[j]) && !str.contains(a[i] + "")) str += a[i];
            }
        }
        int[] c = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            c[i] = Integer.valueOf(i);

        }
        return c;
    }


    /*
    Requirement: TASK 4
-Create a method called isPowerOf3()
-This method will take an int argument and it will return true if given
int argument is equal to 3 power of the X. Otherwise, it will return false.


Numbers that are power of 3 = 1, 3, 9, 27, 81, 243….

Test Data 1: 1
Expected Result 1: true

Test Data 2: 2
Expected Result 2: false

Test Data 3: 3
Expected Result 3: true

Test Data 4: 81
Expected Result 4: true

 */
    public static boolean isPowerOf3(int n) {
//        if (n == 1) return true;
//        return n % 3 == 0;

        // 27.0
        // 27 / 3 = 9
        // 9 / 3 = 3
        // 3 / 3 = 1.0

        // 15
        // 15 / 3 = 5
        // 5 / 3 = 1
        if (n < 1 ) return false;
        double doubleNum = n;
        while (doubleNum % 3 == 0){
            doubleNum /= 3;
        }
        return doubleNum == 1.0;
    }



/*
    Requirement: Task 5
    -Create a method called firstDuplicate()
    -This method will take an int array argument and it will
    return an int which is the first duplicated number.
    NOTE: All elements will be positive numbers.
    NOTE: If there are no duplicates, then return -1
    NOTE: If there are more than one duplicate, then return
    the one for which second occurrence has the smallest
    index.
    Test Data 1: []
    Expected Result 1: -1

    Test Data 2: [1]
    Expected Result 2: -1

    Test Data 3: [1, 2, 2, 3]
    Expected Result 3: 2

    Test Data 4: [1,  2, 3, 3, 4, 1]
    Expected Result 4: 3
 */

    public static int firstDuplicate(int[] arr) {
        String str = "";
        int max = Integer.MIN_VALUE;
        if (arr.length <= 1) return -1;
        else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (((arr[i] == arr[j])) && (arr[j] > max)) {
                        str += arr[j];
                    }
                    max = arr[j];
                }
                break;
            }
            return Integer.parseInt(str);

        }


    }
/*
    //TASK 5
    public static int firstDuplicate(int[] array) {
        if (array.length <= 1) return -1;
        else {

            ArrayList<Integer> newListWithDuplicate = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {//1, 2, 3, 3, 4, 1
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i) == list.get(j)) newListWithDuplicate.add(list.get(i));
                }
                Collections.sort(newListWithDuplicate);
            }
            return newListWithDuplicate.get(newListWithDuplicate.size() - 1);
        }
}
 */



    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibonacciSeries1(5)));

        System.out.println(fibonacciSeries2(5));
        int[] a = new int[7];
        int[] b = new int[4];
        a[0] = 1;
        a[1] = 2;
        a[2] = 2;
        a[3] = 4;
        a[4] = 4;
        a[5] = 5;
        a[6] = 4;

        b[0] = 3;
        b[1] = 4;
        b[2] = 5;
        b[3] = 5;

            System.out.println(Arrays.toString(findUniques(a, b)));
            // System.out.println(Arrays.toString(findUniques(a,b)));

        System.out.println(isPowerOf3(28));

        System.out.println(firstDuplicate(a));
        }
    }
