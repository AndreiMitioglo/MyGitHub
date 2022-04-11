package arrays;

import java.util.Arrays;

public class DefaultValues {
    public static void main(String[] args) {

                  //  Arrays [] assigning an empty array

        String[] s = new String[5];
        System.out.println(Arrays.toString(s)); // [null, null, null, null, null]

        int[] ints = new int [5];
        System.out.println(Arrays.toString(ints));// [0, 0, 0, 0, 0]

        float[] floats = new float [5];
        System.out.println(Arrays.toString(floats)); //

        char[] chars = new char [5];
        System.out.println(Arrays.toString(chars)); // [0.0, 0.0, 0.0, 0.0, 0.0]

        boolean[] booleans = new boolean [5];
        System.out.println(Arrays.toString(booleans));// [false, false, false, false, false]


    }
}
