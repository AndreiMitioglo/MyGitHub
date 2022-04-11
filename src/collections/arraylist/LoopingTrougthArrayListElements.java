package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LoopingTrougthArrayListElements {
    public static void main(String[] args) {

        //ArrayList<Character> chars = new ArrayList<>();
        List<Character> chars = new ArrayList<>();
        chars.add('D');
        chars.add('A');
        chars.add('B');
        chars.add('C');

        System.out.println(chars);// [D, A, B, C]
        Collections.sort(chars);
        System.out.println(chars); //[A, B, C, D]


        for (int i = 0; i < chars.size(); i++) {
            System.out.println(chars.get(i));
        }


        System.out.println("\n-------Printing each element with for each loop----\n");
        for (Character element : chars) {
            System.out.println(element);

        }
    }
}
