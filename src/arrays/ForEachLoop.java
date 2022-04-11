package arrays;

public class ForEachLoop {
    public static void main(String[] args) {
      /*

Print each element with a message

EXPECTED OUTPUT:
Element 1 = A
Element 2 =
Element 3 = ,
Element 4 = #
Element 5 = T
Element 6 = 6
Element 7 = 9

 */

        char[] chars = {'a', ' ', ' ', '#', '@', '$'};

                   // for i loop
        int sizeOfArray = chars.length;   // giving int size

        for (char i = 0; i < chars.length - 1; i++) {
            System.out.println(chars[i]);

            System.out.println("\n-----for each loop------\n");

            for (char element : chars) {
                System.out.println("Element = " + element);

            }
        }
    }
}