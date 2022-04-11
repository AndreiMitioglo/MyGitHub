package utilities;

public class Calculator { // it is a CLass

/*/What do we need to create a method?
            1. A proper name
    2. Decide its accessibility level (public)
    3. Decide its accessibility way (You want to call it with a class name or with object name)
    static -> You want to call it with class name
        non-static -> You want to call it with object name
    4. Decide if it returns something or not
        if it returns -> then decide what it returns
        if it does not return -> then put void
    5. Does it take any argument
        if it takes, then decide what arguments it takes and how many arguments it takes
    NOTE: If your method is not void meaning it is a return type you MUST use the return
    keyword in the body
    of the method
    NOTE: if your method returns an int, then the variable used next to the return keyword in
    the body MUST be an int
    NOTE: Every method must have a body that runs a task
    NOTE: We can have multiple methods sharing the same name in the same class only if they
    have different arguments.
    Different arguments could be either the number of arguments is different or the types of
    arguments are different
     */


    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
//------------------------------------------------------------------------------------------
    // average of 3 numbers

    public static int averageOfThreeNumbers(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    }
//-------------------------------------------------------------------------------------
    //Create a method that finds the sum of 2 int numbers and returns it

    public static int findSumIntOf2(int num1, int numb2) {
        return num1 + numb2;
    }
//---------------------------------------------------------------------------------------------------
    //Create a method that finds the sum of 2 double numbers and returns it

    public static double findSumOfDouble2(double num1, double num2) {
        return num1 + num2;
    }
//--------------------------------------------------------------------------------------------
    //Create a method that finds the absolute difference of 2 int numbers and returns it

    public static int findAbsOf2(int num1, int num2) {
        // return Math.abs(num1 - num2);
        return (num1 > num2) ? num1 - num2 : num2 - num1; // ternery way to find the abs
    }
// ---------------------------------------------------------------------------------------
    //Create a method that finds the absolute difference of 2 double numbers and returns it

    public static double findAbsOf2(double num1, double num2) {
        return Math.abs(num1 - num2);
    }
//---------------------------------------------------------------------------------------------
    //Create a method that finds the product of 2 int numbers and returns it

    public static int productInt(int num1, int num2) {
        return num1 * num2;
    }
// -----------------------------------------------------------------------------------
    //Create a method that finds the product of 2 double numbers and returns it

    public static double productDouble(double num1, double num2) {
        return num1 * num2;
    }
    // --------------------------------------------------------------------------------------
    // Checking if number is between 10 and 25

    public static void isNumberBetween10And25(int num) {
        System.out.println(num >= 10 && num <= 25);
    }
//--------------------------------------------------------------------------------------------




}