package collectionsFramework;

import java.util.*;

public class RecapArrayAndList {
    public static void main(String[] args) {
/*
    Create an int array to store 1, 5, 7, 9, 10
    Then, print the array
 */
        System.out.println(" === int array ====");

        int[] arr = {1,5,7,9,10}; // null is not allowed in int array
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[2]); // 7

        System.out.println(" === String array ====");

        String[] cities = {"Tokyo", "Berlin", "Oslo", "Denver", null, null};
        System.out.println(Arrays.toString(cities));


        /*
        List: ArrayList- Vector-LinkedList
         */

//        ArrayList<String> names1 = new ArrayList<>();
//        List<String> names2 = new ArrayList<>();
//        Collection<String> names3 = new ArrayList<>();
//        Iterable<String> names4 = new ArrayList<>();
//        Object names5 = new ArrayList<>();
//        Cloneable names6 = new ArrayList<>();

        System.out.println("=== Array list===");

        ArrayList<String> cities2 = new ArrayList<>();
        Collections.addAll(cities2, cities);
        cities2.add("Tokyo");

        System.out.println(cities2);//[Tokyo, Berlin, Oslo, Denver, null, null, Tokyo]
        System.out.println(cities2.get(3)); // Denver


        System.out.println("=== Vector list===");

        Vector<String> names = new Vector<>();
        names.add(null);
        names.add(null);
        names.add(null);
        names.add("Regina");
        names.add("Regina");
        names.add("Data");


        System.out.println(names.size()); // 6
        names.forEach(System.out::println);
        System.out.println("name at index of 5 = " + names.get(5)); // Data

        System.out.println("=== string LinkedList ===");

        LinkedList<String> objects1 = new LinkedList<>();
        List<String> objects2 = new LinkedList<>();

        objects1.add("Phone");
        objects1.add("Computer");
        objects1.add("Airpods");
        objects1.add("Screen");
        objects1.add("Screen");
        objects1.add(null);
        objects1.add(null);
        objects1.add(null);
        objects1.add(null);

        System.out.println(objects1.getLast());// null
        System.out.println(objects1.get(2)); // Airpods
        System.out.println(objects1); //[Phone, Computer, Airpods, Screen, Screen, null, null, null, null]
        System.out.println(objects1.stream().filter(Objects::isNull).count()); // 4
    }
}
