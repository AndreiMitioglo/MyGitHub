package collectionsFramework;

import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {
        TreeMap<String, Integer> studentAges = new TreeMap<>();
        studentAges.put("Kaly", 17);
        studentAges.put("Torie",20);
        studentAges.put("Alona",15);
        studentAges.put("andrei",25);// {Alona=15, Kaly=17, Torie=20, andrei=25}
       // studentAges.put(null, 15);//NullPointerException
       studentAges.put("Guluzar", null);//{Alona=15, Guluzar=null, Kaly=17, Torie=20, andrei=25}

        System.out.println(studentAges); // {Kaly=17, Torie=20}



    }
}
