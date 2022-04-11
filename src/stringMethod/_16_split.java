package stringMethod;

import java.util.Arrays;

public class _16_split {
    public static void main(String[] args) {

        /*
         split()
It is used to split a String from given regex
- It is a String class method
- it is a non-static method
- it is return type and returns a String array
- it takes an argument as a regex String

         */

        String s = "Banana is nice";
        String[] sSplitedFromSpace= s.split(" ");

        System.out.println(Arrays.toString(sSplitedFromSpace)); //[Banana, is, nice]

        String[] sSplitFromI = s.split("i");
        System.out.println(Arrays.toString(sSplitFromI)); // [Banana , s n, ce]

        String[] sSplitFromA = s.split("a");
        System.out.println(Arrays.toString(sSplitFromA)); // [B, n, n,  is nice]

        String[] sSplitFromIs = s.split("is");
        System.out.println(Arrays.toString(sSplitFromIs)); // [Banana ,  nice]
    }

}
