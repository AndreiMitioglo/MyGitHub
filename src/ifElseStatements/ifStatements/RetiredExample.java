package ifElseStatements.ifStatements;

import java.util.Scanner;

public class RetiredExample {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("What is your age ?");
        int age = input.nextInt();
        if (age >= 55) {  // printing only true value
            System.out.println("It your time to retire");
        } else {
            System.out.println("You will not retired");
        }
    }
}