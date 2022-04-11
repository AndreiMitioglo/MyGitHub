package homework;

import java.util.Scanner;
public class Homework06 {
    public static void main(String[] args) {

        // -------- Task 1 -------

        String s1 = "5", s2 = "10";  // 5 and 10 as text(string)
        int num1Int = Integer.parseInt(s1);// better  use parse then valueOf
        int num2Int = Integer.parseInt(s2);
        System.out.println("-Sum of 5 and 10 is = " + (num1Int + num2Int));
        System.out.println("-Product of" + num1Int+ "and" + num2Int + " is = " +
                (num1Int * num2Int));  // daca se schimba alte variable ex 6 , 8 va
                                            // printa  6 si 8 in println.

        System.out.println("-Division of 5 and 10 is = " + (num1Int / num2Int));
        System.out.println("-Subtraction of 5 and 10 is = " + (num1Int - num2Int));
        System.out.println("-Remainder of 5 and 10 is = " + (num1Int % num2Int));
        System.out.println();



        // -----Task 2 --------

        String st1 = "200", st2 = "-50";
        int s1Int = Integer.parseInt(st1), s2Int = Integer.parseInt(st2);


        System.out.println("The greatest value is = " + Math.max(s1Int, s2Int));
        System.out.println("The smallest value is = " + Math.min(s1Int, s2Int));
        System.out.println("The average is = " + (s1Int + s2Int)/2);
        System.out.println("The absolute difference is = " + Math.abs(s1Int-s2Int));
        System.out.println();




         // ------ Task 3 --------

        double savePerDay$ = 0.96; // (3*025) + (1*0.1) + (2*0.05) + 0.01 = 0.96
        double daysFor24$ = 24 / savePerDay$;
        double daysFor168$ = 168 / savePerDay$;
        double after5Months = 150 * savePerDay$;

        System.out.println((int) daysFor24$ + " days");
        System.out.println((int) daysFor168$ + " days");
        System.out.println("$" + after5Months);
        System.out.println();


        // ----- Task 4 --------

        double saveDaily = 62.5;
        double needsForComputer = 1_250;
        System.out.println((int) (needsForComputer / saveDaily));
        System.out.println();


        // ------ Task 5 ------

        double needForCar = 14_265;
        double option1Monthly = 475.5;
        double option2Monthly = 951;

        System.out.println("Option 1 will take " + (int)(needForCar / option1Monthly) + " months");
        System.out.println("Option 2 will take " + (int)(needForCar / option2Monthly) + " months");
                   // or
        System.out.println("Option 1 will take " + (int)(14265/475.5) + " months");
        System.out.println("Option 2 will take " + (int)(14265/951)+ " months");
        System.out.println();

        // ------ Task 6 ------

        Scanner ask = new Scanner(System.in);

        System.out.println("Please enter 2 numbers ");
        int number1 = ask.nextInt(), number2 = ask.nextInt();
       double a = number1, b = number2;

        System.out.println(a/b);

    }
}
