package homework;

import java.util.Scanner;

public class Homework05 {


    public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
        System.out.println();

//      ----- Task 1 -------

  System.out.println("Enter your first number");
  int a = input.nextInt();
  System.out.println("Enter your second number");
  int b = input.nextInt();
  System.out.println("Enter your third number");
  int c = input.nextInt();

      System.out.println("Max value = " + Math.max(Math.max(a, b), c));
      System.out.println("Min value = " + Math.min(Math.min(a, b), c));
      System.out.println();



      // ----- Task 2 -----

      System.out.println("Enter your 1st number");
      int num1 = input.nextInt();
      System.out.println("Enter your 2nd number");
      int num2 = input.nextInt();
      System.out.println("Enter your 3rd number");
      int num3 = input.nextInt();
      System.out.println("Enter your 4th number");
      int num4 = input.nextInt();
      System.out.println("Enter your 5th number");
      int num5 = input.nextInt();

      System.out.println("Max value = " + Math.max(Math.max(Math.max(num1, num2), num3), Math.max(num4, num5)));
      System.out.println("Min value = " + Math.min(Math.min(Math.min(num1, num2), num3), Math.min(num4, num5)));
      System.out.println();

      // ---- Task 3 -----

      System.out.println("What is your first number ?");
      int d = input.nextInt();
      System.out.println("What is your second number ?");
      int e = input.nextInt();

      System.out.println("The difference between numbers is = " + Math.abs(d-e));
        System.out.println();



        // ----- Task 4 -----

        int random1 = (int) (Math.random() * 51 + 50);
        int random2 = (int) (Math.random() * 51 + 50);
        int random3 = (int) (Math.random() * 51 + 50);
        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);
        System.out.println("The sum of numbers is = " + (random1 + random2 + random3));


        // ----- Task 5 ----
             // 1st way
        double alex$ = 125;
        double mike$ = 220;

        System.out.println("Alex's money : $" + (alex$ - 25.5));
        System.out.println("Mike's money : $" + (mike$ + 25.5));
            //   2nd way
        System.out.println("Alex's money : $" + (125 - 25.5));
        System.out.println("Mike's money : $" + (220 + 25.5));
        System.out.println();

        //  ---- Task 6 -----

        double davidNeeds$ = 390;
        double davidCanSaveDaily$ = 15.6;
        double daysNeedToHappiness = davidNeeds$ / davidCanSaveDaily$;
        System.out.println(daysNeedToHappiness); // Lol
        System.out.println();

    }
}
