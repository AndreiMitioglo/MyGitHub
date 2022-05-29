package exceptions.custom_exception;

public class Errors {

    /*
     Compile Time Errors are those errors which prevent the code
      from running because of an incorrect syntax such as a missing
      semicolon at the end of a statement or a missing bracket, class not found, etc.
     These errors are detected by the java compiler and an error message is displayed onto
       the screen while compiling.
     */

    public static void main(String args[]) {
              // value
    // int a = "car";  // String cannot be converted to int
      //String str = 'c';  // char cannot be converted to String
    //    int number  // ';' expected



        int a = 40, b = 60;

        // Declared variable Sum with upper case  S
        int Sum = a + b;

        // Trying to call variable Sum
        // with a lower case s  sum

  // System.out.println("Sum of variables is " + sum);    //cannot find symbol
    }



}