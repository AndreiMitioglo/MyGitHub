package loops.forLoop;

import java.util.Scanner;

public class PrintNumbersDivisibleBy5 {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
       int number = input.nextInt();


        while (number < 10){
           System.out.println("This number is not more than or equal to 10");
           System.out.println("Please enter a new number");
            number = input.nextInt();
        }



    }
}
