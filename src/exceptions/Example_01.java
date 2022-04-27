package exceptions;

public class Example_01 {
    public static void main(String[] args) {
        /*
        Handle the exception below and report with a message
         */

        String[] names = {"Alex", "John", "Max"};
        try {
            System.out.println(names[-5]);
        } catch (Exception e) {

//            System.out.println(e); // java.lang.ArrayIndexOutOfBoundsException: -5
//            System.out.println(e.getMessage()); // -5
            e.printStackTrace();
        }
        System.out.println("End of the program");
    }
}
