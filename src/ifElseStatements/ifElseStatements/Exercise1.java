package ifElseStatements.ifElseStatements;

public class Exercise1 {

    public static void main(String[] args) {

/*
Write a program that generates a random number between -10, 10(inclusive)
and if the number is positive print out "number is POSITIVE!",
if the number is negative print out "number is NEGATIVE!",
and if the number is 0 print out "number is ZERO!".


input:                      input:                  input:
6                           -5                      0
output:                     output:                 output:
number is POSITIVE!         number is NEGATIVE!     number is ZERO!
 */

        // (int) Math.random() * (end point - start point +1) + start point;
        int num1 = (int) (Math.random() * 21) - 10;
        System.out.println(num1);

//     if(num1 < 0){  // NEGATIVE
//         System.out.println("Number is negative ");
//
//     } else if(num1 > 0){  // POSITIVE
//            System.out.println("Number is positive ");
//
//        }else {    // a treia conditie
//            System.out.println("Number is Zero ");

        if (num1 > 0) {
            System.out.println("Positive");
        } else if (num1 < 0){
            System.out.println("Negative");
        }else {
            System.out.println(" Zero");
        }

     }
    }




