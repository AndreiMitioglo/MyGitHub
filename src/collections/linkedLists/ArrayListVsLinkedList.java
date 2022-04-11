package collections.linkedLists;

import java.sql.SQLOutput;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {

        LinkedList<Double> numbers = new LinkedList<>();
        numbers.add(10.5);
        numbers.add(12.5);
        numbers.add(13.3);
        numbers.add(17.7);

        System.out.println(numbers);// [10.5, 12.5, 13.3, 17.7]


        System.out.println(  "==== looping LinkedList=====");
        for (Double d : numbers){
            System.out.println(d);
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));

        }
        System.out.println(numbers.get(0)); // 10.5
        System.out.println(numbers.getFirst()); // 10.5
               numbers.getLast(); // 17.7

        System.out.println(  "==== Some additional methods of LinkedList=====");

        System.out.println(numbers.peek()); // like getFirst() //  10.5
        System.out.println(numbers.peekFirst()); // 10.5
        System.out.println(numbers.peekLast()); // 17.7

        System.out.println(numbers);// [10.5, 12.5, 13.3, 17.7]

        System.out.println("================================");

        System.out.println(numbers.poll()); // 10.5   retrieves the first element and removed it
                                             // [12.5, 13.3, 17.7]
        System.out.println(numbers.pollFirst()); // [13.3, 17.7]

        System.out.println(numbers.pollLast()); // [13.3] removes the last element

        System.out.println(numbers);

        System.out.println("================================");
        numbers.push(5.7);// adds the object to the head at position 0
        numbers.push(8.9);// adds the object to the head at position 0
        System.out.println(numbers.pop()); // removes the object from the head( from the zeros index)

        System.out.println(numbers);


    }
}
