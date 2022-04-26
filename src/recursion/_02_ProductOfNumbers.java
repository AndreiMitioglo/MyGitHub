package recursion;

public class _02_ProductOfNumbers {

    /*
    Write a public static recursive method that takes an int n argument
    and returns the product of all numbers starting from 1 to int n
    EXAMPLE:
    if n = 5
    1*2*3*4*5 = 120

    result = 120
     */

    public static int recursiveProd(int n){

        if(n > 1) return n * recursiveProd (n-1);
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(recursiveProd(5)); // 120
        System.out.println(recursiveProd(0)); // 1
    }
}
