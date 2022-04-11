package stringMethod;

import java.util.Arrays;

public class _15_toCharArray {
    public static void main(String[] args) {
//
                            // String to char array; toCharArray();

        String s = "Java"; // toCharArray(); method converting String to charArray;

        System.out.println(Arrays.toString(s.toCharArray())); //  [J, a, v, a]

        int countA = 0;
        for (char element : s.toCharArray()){
            if (element == 'a') countA++;
        }
        System.out.println(countA); //2

        System.out.println(Arrays.toString("Hello".toCharArray())); // [H, e, l, l, o]

    }
}
