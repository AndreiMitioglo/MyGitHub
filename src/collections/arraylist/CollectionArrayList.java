package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionArrayList {
    public static void main(String[] args) {

          String[] namesArray = new String[5];
          /*
          NOTE: None of the collections except Arrays will not work with primitives.

Declaring an ArrayList
ArrayList<dataType> variableName = new ArrayList<dataType>();
ArrayList<dataType> variableName = new ArrayList<>(); // better
Getting size of the Array
int lengthOfArray = variableName.length;
Getting size of the ArrayList
int sizeOfTheArrayList = variableName.size();
           */

        // ArrayList is dynamic sized Arrays
        // 1. Declaring an ArrayList

       ArrayList<String> namesList = new ArrayList<>();

        // 2. How to print the size of Array vs ArrayList

        System.out.println("Size of the ArrayList " + namesList.size()); // 0

        //3. How to add elements to Array vs ArrayList;
        namesArray[0] = "Abe";
        namesArray[4] = "Data";

        namesList.add("Abe"); // taking objects [Abe]
        namesList.add(1, "Data"); //[Abe, Data]
        namesList.add(1, "John"); //[Abe, Data, John]
        namesList.add("Alona"); //[Abe, Data, John, Alona]
        namesList.add("Max"); //[Abe, Data, John, Alona, Max]

        namesList.set(2, "Lionel"); // [Abe , John, Lionel]

            //4. How to print Array or ArrayList;

        System.out.println(Arrays.toString(namesArray)); // Abe, null , null, null, Lionel]
        System.out.println(namesList);

        namesList.add("Andrei");
        System.out.println(namesList);// [Abe, John, Lionel, Alona, Max, Andrei]

        namesList.add(5, "Taylor");
        System.out.println(namesList); //[Abe, John, Lionel, Alona, Max, Taylor, Andrei]

        namesList.set(3, "Daria"); // updating existing element
        System.out.println(namesList); //[Abe, John, Lionel, Daria, Max, Taylor, Andrei]

        namesList.add("Regina");
        namesList.add("Regina");
        namesList.add(null);
        namesList.add("Guluzar");//[Abe, John, Lionel, Daria, Max, Taylor, Andrei, Regina, Regina, null, Guluzar]

        System.out.println(namesList);

        namesList.remove(0); // James
        System.out.println(namesList); // [John, Lionel, Daria, Max, Taylor, Andrei, Regina, Regina, null, Guluzar]
        System.out.println(namesList.remove(2));

        namesList.remove("Alona"); // remove Alona
        System.out.println(namesList);// [John, Lionel, Max, Taylor, Andrei, Regina, Regina, null, Guluzar]
        System.out.println( namesList.remove("John")); // true
        System.out.println(namesList); // [Lionel, Max, Taylor, Andrei, Regina, Regina, null, Guluzar]

        System.out.println(namesList.remove("max")); // false
        namesList.add(0,"Regina");
        System.out.println(namesList); // [Regina, Lionel, Max, Taylor, Andrei, Regina, Regina, null, Guluzar]

          namesList.remove("Regina");// [Lionel, Max, Taylor, Andrei, Regina, Regina, null, Guluzar]
                            // removes first element Regina.

        System.out.println(namesList.get(3)); // Max
        System.out.println(namesList.get(5)); // Regina
        System.out.println(namesList); // [Lionel, Max, Taylor, Andrei, Regina, Regina, null, Guluzar]

     System.out.println( namesList.indexOf("Regina")); // 4
     System.out.println(namesList.lastIndexOf("Regina"));// 5

     System.out.println(namesList.contains("Max"));; // true
     System.out.println(namesList.contains("max"));; // false
     System.out.println( namesList.contains("Kaly"));; // false

     namesList.isEmpty(); // false

     namesList.clear();
     System.out.println(namesList.size()); // 0



    }
}
