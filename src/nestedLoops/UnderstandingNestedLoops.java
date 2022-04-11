package nestedLoops;

public class UnderstandingNestedLoops {
    public static void main(String[] args) {

        for(int i = 1; i <= 3; i++){ // outer loop -> outside loop increment(up)
            System.out.println(i);

            for(int j = 5; j >= 3; j--){  // inner loop -> inside loop decrement (down)
             System.out.println("\t" + j);
            }
        }





    }
}
