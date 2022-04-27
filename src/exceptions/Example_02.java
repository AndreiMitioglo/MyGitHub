package exceptions;

public class Example_02 {
    public static void main(String[] args) {

        int number = 45;

        try{
            System.out.println(number/3);
            System.out.println(number /  0);

           // System.out.println("abc".charAt(15)); // StringIndexOutOfBoundsException
        }
        catch(Exception e){  // Exception is parent of all exceptions

            e.printStackTrace(); // ArithmeticException
        }
        System.out.println("End of the program");
    }
}
