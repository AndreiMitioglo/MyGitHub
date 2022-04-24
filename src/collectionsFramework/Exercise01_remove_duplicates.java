package collectionsFramework;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Exercise01_remove_duplicates {
    public static void main(String[] args) {

        /*
        Create an ArrayList and store below elements:
        Computer
        Phone
        Mouse
        Mouse
        Mouse
        Phone
        Pen
        From the list remove all duplicates and print the unique elements
         */

        System.out.println("=== First way - not preferred ====");
        ArrayList<String> objects = new ArrayList<>();
        objects.add("Computer");
        objects.add("Phone");
        objects.add("Mouse");
        objects.add("Mouse");
        objects.add("Mouse");
        objects.add("Phone");
        objects.add("Pen");

        System.out.println("List before removing " + objects);

        // Create an empty list to store unique values
        ArrayList<String> uniques = new ArrayList<>();

        for (String object : objects) {
            if(!uniques.contains(object)) uniques.add(object);
        }

        System.out.println("My list after removing duplicates = " + uniques); // [Computer, Phone, Mouse, Pen]

        System.out.println("\n-------Second way - using collections--------\n");

        // TreeSet > Computer, Mouse, Pen, Phone
        // HashSet > no prediction
        // LinkedHasSet is the one wee need


        System.out.println( new LinkedHashSet<>(objects)); // [Computer, Phone, Mouse, Pen]


        }

    }

