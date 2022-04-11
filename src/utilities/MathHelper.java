package utilities;

public class MathHelper {  // it's a Class

    // Create a method that takes 3 ints and returns the max

    public static int maxOfThree(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3)); // 10

    }

    // method overloading
    public static double maxOfThree(double num1, double num2, double num3) {
        return Math.max(num1, Math.max(num2, num3)); // 6.8

    }

    // Create a method that take 3 byte numbers and return the smallest
    public static byte minOfThree(byte num1, byte num2, byte num3) {
        return (byte) Math.min(num1, Math.min(num2, num3)); // casted cuz return int
    }
//---------------------------------------------------------------------------------
   /*
 Please create a method that takes an int as an argument and returns true if it is even
  returns false if it is odd

   return type
   isEven
    static
   public
 */


    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
//-----------------------------------------------------------------------------

    //Create a method called isOdd() that takes one int parameter and returns true if the number is odd,
// false otherwise
    public static boolean isOdd(int number) {
        return number % 2 == 1; // or number % 2 != 0
    }
    //---------------------------negative-------------------------------------------------
    //Create a method that takes one int as an argument and returns if the number is positive.
//If the number is positive, it will return true.
//Otherwise, it will return false.

    public static boolean isPositive(int number) {
        return number > 0;
    }

    //----------------------positive------------------------------------------------------
    public static boolean isNegative(int number) {
        return number < 0;
    }
    //public static boolean isPositive(int num){
    //return num != 0 && num == Math.abs(num);  2nd way


// -------------------------zero--------------------------------------------------------
    public static boolean isZero(int number) {
        return number == 0;
    }
}