package regex;

import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {
        System.out.println( Pattern.matches("[a-z]+", "hello")); // true-> contains one or more letters
        System.out.println( Pattern.matches("[a-z]+", "1")); // false -> not contains one or more letters
        System.out.println( Pattern.matches("[a-z]+", "b")); // true -> contains one or more letters
        System.out.println( Pattern.matches("[a-zA-Z]{3,}", "hello class")); // false -> contains space
        System.out.println( Pattern.matches("[a-zA-Z ]{3,}", "hello class")); // true -> contains space after Z [a-zA-Z ]{3,}

/*
    Write a regex pattern with the conditions below:
    Must be more than 8 characters.
    Must be no more than 15 characters.
    Could include letters(Upper and Lower), numbers, _, and -

 */
        System.out.println( Pattern.matches("[a-zA-Z0-9_-]{8,15}", "TechGlobal-1")); // true
/*
    Write a regex pattern for a phone number with the format of:
    (XXX)-XXX-XXXX

 */

        System.out.println(Pattern.matches("\\([1-9]{3}\\)-[\\d]{3}-[\\d]{4}", "(929)-444-3330")); // true
        System.out.println(Pattern.matches("\\([1-9][0-9]{2}\\)-[1-9][0-9]{2}-[\\d]{4}", "(708)-456-7890")); // not staring whit 0
    }
}
