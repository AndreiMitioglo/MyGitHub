package collectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {

        /*
        How to create a HasSet ?
         */

        HashSet<Integer> numbers = new HashSet<>();// is placing(storing) randomly
       numbers.add(5);
       numbers.add(10);
      //  numbers.add(10); no duplicates allowed
       numbers.add(-3);
       numbers.add(0);
       numbers.add(-7);
       numbers.add(-55);
       numbers.add(null); // allowing only one null
       numbers.add(null);

        System.out.println(numbers);// [0, -3, 5, -7, -55, 10]
        System.out.println( numbers.contains(334567)); // false
    }
}
