package mathClass;

import java.util.Scanner;

public class exercisesMaxMin {
    public static void main(String[] args) {
//
//
//        /*
//        Find the min and max of given 3 numbers, write down the Pseudo and print
//
//        x = 4 y = 67  z = -54
//
//         */
//
//           //int x = 4, y = 67, z = -54;
//
////                                           // 1                   2
//        System.out.println(Math.max(Math.max(4, 67), (Math.max(67, -54))));   // numai 2 numere
//        System.out.println(Math.min(Math.min(4, 67), (Math.min(67, -57))));
//
//
//-----------------------------------------------------------------------------------
//
//        System.out.println(Math.max(23, Math.max(4, 56)));  // 56
//
//---------------------------------------------------------------------------------

        /*
Write a program which is going to ask 4 NUMBER print the max of retrieved 4 numbers.
 */
       // 1st way
        Scanner scan = new Scanner(System.in);
        System.out.println(" Please enter 4 numbers");
        //int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt(), num4 = scan.nextInt();

        //System.out.println(" The max of a 4 numbers is = " + Math.max(Math.max(num1, num2),Math.max(num3, num4)));

        /// 2 way

        System.out.println(" The max of a 4 numbers is = "
                + Math.max(Math.max(scan.nextInt(), scan.nextInt()), Math.max(scan.nextInt(), scan.nextInt())));
    }


}
