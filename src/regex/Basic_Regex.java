package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basic_Regex {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("o");
        Matcher matcher = pattern.matcher("I love TechGlobal");

        System.out.println(matcher.matches()); // true -> if matcher = pattern(string = string)

        while (matcher.find()) {  /// find the next match pattern in the given string
            System.out.println(matcher.group());
            System.out.println(matcher.start()); //  returns int(index) -> prints out where found pattern starts
            System.out.println(matcher.end()); // ends at index(4)


            

        }
    }
}