package loops;

public class Understanding {
    public static void main(String[] args) {

        /*
     1. For loop (traditional i loop or i loop)
     Syntax:
     for

         */
       /*

       Write a java program to print 'Hello" 5 times;
        */

        for (int count = 1; count <= 10; count++){  // post-increment
            System.out.println("Hello");
        }
        System.out.println("End of the program");
//-------------------------------------------------------------------
        int age = 10;
        int year = 2022;
        for (int i = 10; i <= 35; i++){  // post-increment
            System.out.println("The age is = " + age + " in "+ year); // The age is = 20 in 2032
            year++; // increment year to  1;                          //  The age is = 34 in 2046
            age++;
        }
        System.out.println("End of the program");

    }
}
