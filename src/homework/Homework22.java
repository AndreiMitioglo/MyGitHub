package homework;

import java.util.Arrays;

public class Homework22 {
 /*
     Requirement:
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
        for (int i = 1; i < n; i++) {
            newArr[0] = 0;
            newArr[1]= 1;
            newArr[i] = n2;
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;

        }
        return newArr;


    /*
        Requirement:
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

    public  static int fibonacciSeries2(int n){
      String fibonacci = "";
        int n1=0, n2=1, n3;
        for (int i=0; i<=n; i++){

            n3= n1 + n2;
            n2= n3;
            n1= n2;
          fibonacci+=n2 + ",";
        }
        return fibonacci;
    }


    public static void main(String[] args) {

       // System.out.println(fibonacciSeries1(5));

        System.out.println(fibonacciSeries2(5));

    }
}
