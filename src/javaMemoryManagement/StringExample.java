package javaMemoryManagement;

public class StringExample {
    public static void main(String[] args) {


        // first way to create string
        String name1 = "John";

        // second way to create string
        String name2 = new String("Alex");

        String name3 = "Alex";
        String name4 = "John";

        // to compare Strings DO NOT USE == operator
        System.out.println(name1 == name4); // true
        System.out.println(name2 == name3); // false ? -> comparing the locations in the pool
        System.out.println(name2.equals(name3)); // true -> compare the value

    }
}
