package stringMethod;

public class _03_equals {
    public static void main(String[] args) {
        /*
        NOTE: This is case-sensitive
        -it compares 2 string each to other and tells if they are equal
        - it is non-static, and we call it with another string object
        - it is a return type and return a boolean
        - it takes String as an argument

         */


        System.out.println("Melda".equals("Melda"));  // true
        System.out.println("melda".equals("Melda"));  // false (melda- Melda)

        String name1 = "John";
        String name2 = "James";
        String name3 = "James";

        System.out.println(name1.equals(name2)); // false
        System.out.println(name2.equals(name3)); // true


    }
}
