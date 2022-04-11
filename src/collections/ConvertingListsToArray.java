package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class ConvertingListsToArray {
    public static <Arraylist> void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Rami");
        names.add("Naim");
        names.add("Reem");

        LinkedList<Integer> ages = new LinkedList<>();
        ages.add(25);
        ages.add(2);
        ages.add(27);
        ages.add(30);

        Vector<Boolean> booleans = new Vector<>();
        booleans.add(true);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);

        // Converting lists to Array
        // way - 1   manual
        String[] namesArr1 = new String[names.size()];

        System.out.println("===== First way FOR I LOOP===== ");

        for (int i = 0; i < names.size() ; i++) {
            namesArr1[i] = names.get(i);

        }
        System.out.println(Arrays.toString(namesArr1)); //[Rami, Naim, Reem]

        System.out.println(" ===== 2nd way -> toArray() method ===== ");

        Object[] namesArr2 = names.toArray();
        Object[] agesArr = ages.toArray();
        Object[] booleansArr = booleans.toArray();

        System.out.println(Arrays.toString(namesArr2)); // [Rami, Naim, Reem]
        System.out.println(Arrays.toString(agesArr)); // [25, 2, 27, 30]
        System.out.println(Arrays.toString(booleansArr)); // [true, false, false, false]


    }
}
