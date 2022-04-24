package collectionsFramework;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetPractice {
    public static void main(String[] args) {

        // does not allow duplicates, store in insertion order

        LinkedHashSet<String> words = new LinkedHashSet<>();
        words.add("Foo");
        words.add("Bar");
        words.add("foo");
        words.add("BAR");
        words.add(null);
        words.add("John");

        System.out.println(words); // [Foo, Bar, foo, BAR, null, John]

    }
}
