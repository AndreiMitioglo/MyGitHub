package loops.forLoop;

public class FindSumOfNumbers {
    public static void main(String[] args) {
/*
Write a Java program that print sum of numbers from 10 to 15
10+11+12+13+14+15 = 75
 */
            // 1. create a result container
            int sum = 0;
            //2. start filling your result
        for (int i = 10; i <= 15; i++) {
            sum += i;
        }
        //  3. print out results
            System.out.println(sum); // 75 //  needs to be outside the loop block

    }
}