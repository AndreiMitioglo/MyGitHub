package collections.arraylist;

import java.util.ArrayList;

public class IntegerArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);

        System.out.println(numbers.size()); //3;
        System.out.println(numbers); // 5, 7, 10


    }
}
