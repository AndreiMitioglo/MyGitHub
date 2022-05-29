package exceptions.custom_exception;

public class MultipleCatchBlocks {
    public static void main(String[] args) {

        try{
           System.out.println(3 / 0);  // ArithmeticException
            // System.out.println("Hello".charAt(150));   // StringIndexOutOfBoundsException

        }catch (StringIndexOutOfBoundsException se){
            se.printStackTrace();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }

        System.out.println("End of the program");
    }
}
