package exceptions;

public class MultipleCatchBlocks {
    public static void main(String[] args) {

        try{
            System.out.println("Hello".charAt(1000));
        } catch(StringIndexOutOfBoundsException se){
            se.printStackTrace();
        }
    }
}
