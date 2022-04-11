package stringMethod;

public class _01_valueOf {
    public static void main(String[] args) {


        // Method Task: Convert given variable to the string
        // -  it is static- you can call it whit class name
        // - it is a return type, and it returns a String
        //  - it takes different arguments as it is an
        //                     overloading method and converts given args to a String
        //

        int i = 5;
           String num = String.valueOf(i); // num = 5

        System.out.println(i+i); // num = 10
        System.out.println(num+num); // 55


    }
}
