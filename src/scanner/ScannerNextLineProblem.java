package scanner;

import java.util.Scanner;

public class ScannerNextLineProblem {


    public static void main(String[] args) {



      /*

      name         -> next()
      age          -> nextInt()
      myBrainOk   -> nextBoolean()
      fav quote    -> nextLine()

       */


        Scanner userInput = new Scanner(System.in);

        System.out.println("Whats your name?");
        String name = userInput.next();  // string # 1

        System.out.println("Whats your age?");
        int age = userInput.nextInt();

        System.out.println("Is your brain fried?");
        boolean myBrainOK = userInput.nextBoolean();

        System.out.println("Whats your address?");
        userInput.nextLine();     // trebu numaidecat de pus ca nu salveaza numele a doua oara///
        // la al doilea string nu lucreaza, inainte de string
        String address = userInput.nextLine();   // string # 2

        System.out.println("User name is = " + name +
                "\nUser age is = " + age +
                "\nIs user's brain OK? = " + myBrainOK +
                "\nUser's address is = " + address);



        /*

        Create a program witch asking user 3 numbers, then added them

         */


        System.out.println("Whats are your number1 ?");

        int number1 = userInput.nextInt();
        System.out.println("Whats are your number2 ?");
        int number2 = userInput.nextInt();
        System.out.println("Whats are your number3 ?");
        int number3 = userInput.nextInt();

        int sum = number1  + number2 + number3;  //second way to do that
        System.out.println("Sum of the numbers is =" + (number1 + number2 + number3 ));// 1st way to add numbers
        System.out.println("Sum of the numbers is =" + sum);

    }
}
