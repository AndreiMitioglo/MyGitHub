package collectionsFramework;

import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {

        // sorts automatic, not accepting null
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
       // numbers.add(null); // NullPointerException


        System.out.println(numbers);//[1, 2, 3, 5]

        TreeSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("Joe");
        names.add("Joe"); // prints only one Joe
        names.add("Alex");
        names.add("ali");



        System.out.println(names);
    }
}
