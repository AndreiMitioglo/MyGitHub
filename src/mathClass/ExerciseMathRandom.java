package mathClass;

import utilities.Calculator;

public class ExerciseMathRandom {


    public static void main(String[] args) {

//        // (int) Math.random() * (end point - start point +1) + start point;
//        // 15 to 30 -->  (int)(Math.random() * 16 + 15)
//
//
//        //System.out.println( (int) (Math.random() * 54 + 45 ));
//
//
//        /*
//Create a program which is generating two random numbers between 67 - 85
//and print it out the number1 and number2 and max and min.
//       */
//
//
         int number1 = (int)(Math.random() * 19 + 67);
         int number2 = (int)(Math.random() * 19 + 67);

        System.out.println(" first number is = " + number1 + "\nsecond number is = " + number2 +
                "\nmax is = " + Math.max(number1, number2) + "\nmin is = " + Math.min(number1, number2));





    }

}
