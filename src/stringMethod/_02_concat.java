package stringMethod;

public class _02_concat {
    public static void main(String[] args) {

        /*
-it is used to combine multiple strings , and forms a new one
-it is non-static,(not called with  a class) and we can call it an object created
- it is a return type method, and it returns a new String that is
     combination of the others
- it takes a String as an argument
         */

        String s1 = "Tech"; // String object
        String s2 = "Global"; // String object

        // concat method
        String s3 = s1.concat(s2); // String s3 = s1 + s2;  // TechGlobal

        System.out.println(s3.concat(" School")); // TechGlobal School
        System.out.println("Hello".concat(" ").concat("World")); // Hello World
        System.out.println("Hello".concat(" ") + "World"); // Hello World


    }
}
