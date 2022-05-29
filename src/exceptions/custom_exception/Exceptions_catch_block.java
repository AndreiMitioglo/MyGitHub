package exceptions.custom_exception;

public class Exceptions_catch_block {
    public static void main(String[] args) {

         int number = 38;
        String[] names = {"Alex", "John", "Max"};

        try{
             System.out.println(number / 0);
             System.out.println(names[5]);

          //  System.out.println("abc".charAt(15));
            System.out.println("Next");
        }
        catch(java.lang.Exception e){  // Exception is parent of all exceptions

            e.printStackTrace(); // ArithmeticException / ArrayIndexOutOfBoundsException
        }

        System.out.println("End of the program");

    }
}

