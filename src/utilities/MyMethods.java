package utilities;

public class MyMethods {

    // Write a program that going to find max of 4 numbers and print it out

    public static void printMaxOf4Numbers(int n1, int n2, int n3, int n4) {
        System.out.println(Math.max(Math.max(Math.max(n1, n2), n3), n4));

    }
    // Write a program that going to find max of 4 numbers and RETURN it.

    public static int findMaxOf4(int n1, int n2, int n3, int n4) {
        return Math.max(Math.max(Math.max(n1, n2), n3), n4); // -> inlocuieste Systemout.println






    }
}
