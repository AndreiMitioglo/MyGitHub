package stringMethod;

public class _04_equalsIgnoreCase {
    public static void main(String[] args) {


        System.out.println("hello".equals("Hello")); // false
        System.out.println("hello".equalsIgnoreCase("Hello")); // true
        System.out.println("hello".equalsIgnoreCase(" Hello")); // false // has a space
                                                              // character
        // one extra space character " Hello";

        String s1 = "Good";
        String s2 = "GOOD";

        boolean b = s1.equalsIgnoreCase(s2); // true
        System.out.println(b);
    }
}
