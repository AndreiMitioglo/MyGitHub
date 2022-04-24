package collectionsFramework;

import java.util.ArrayList;
import java.util.TreeSet;

public class Exercise02_find_second_greatest {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(5);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(3);


        // TreeSet > [3,5,7]
        TreeSet<Integer> uniques = new TreeSet<>(numbers); //  TreeSet remove duplicates and sort
        System.out.println(uniques); // [3,5,7]

        ArrayList<Integer> uniquesList = new ArrayList<>(uniques); // convert TreeSet to ArrayList to use index

        System.out.println(uniquesList.get(uniquesList.size()-2)); // 7
        System.out.println(uniquesList.get(1)); // 3

        /*
         //TreeSet -> [1, 3, 5, 7, 10]
        ArrayList<Integer> uniquesList = new ArrayList<>(new TreeSet<>(numbers));
        System.out.println(uniquesList.get(uniquesList.size()-2)); // 7
        System.out.println(uniquesList.get(1)); // 3
         */
    }
}
