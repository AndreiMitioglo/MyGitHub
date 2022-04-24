package collectionsFramework;

import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        /*
        Key       value
        Ukraine > Kiev
        Spain >   Madrid
        Portugal > Lisbon
        Italy >   Rome
        US >     DC
        Canada >  Ottawa
         */

        System.out.println("\n=== understanding Map=====\n");
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Ukraine", "Kiev");
        capitals.put("Spain", "Madrid");
        capitals.put("Portugal", "Lisbon");
        capitals.put("Italy", "Rome");
        capitals.put("US", "DC");
        capitals.put("Canada", "Ottawa");

            // how to print a HashMap
        System.out.println(capitals);// {Canada=Ottawa, Ukraine=Kiev, Italy=Rome, Portugal=Lisbon, US=DC, Spain=Madrid}


        // How to get a particular key-value pair ?
        System.out.println( capitals.get("Spain")); // Madrid
        System.out.println( capitals.get("Germany")); // null
        System.out.println( capitals.get("us")); // null // lower case

        System.out.println("\n=== understanding HashMap=====\n");
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Alona");
        students.put(2, "Abdullah");
        students.put(3, "Abdullah");
        students.put(4, "Data");
        students.put(null, "John");
       // students.put(null, "Alex"); // this will replace John with Alex
        // students.put(1, "Daria"); // this will replace Alona with Daria

        System.out.println(students.size());// 5
        System.out.println(students); //{null=John, 1=Alona, 2=Abdullah, 3=Abdullah, 4=Data}


    }
}
