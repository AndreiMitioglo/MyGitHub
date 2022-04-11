package operator.shortHandAsignmentOperators;

public class Exercise1 {

    public static void main(String[] args) {


       /*Create 2 int variables
          int a = 8, b = 3;
     Then, find their sum, subtraction, multiplication, division and
 remainder by using shorthand operators, and assign those values into a.
      */


        /*
        1. Create the variables
        2. Use shorthand assignment
        3. Print them out
         */
        int a = 8;
        int b = 3;

        System.out.println("a += b ->" + (a += b)); // a = 11
        System.out.println("a -= b ->" + (a -= b));// a = 8
        System.out.println("a *= b ->" + (a *= b));// a = 24
        System.out.println("a /= b ->" + (a /=b ));// a = 8

 //===================================================================================

        int johnsAge = 5;

        //Please find the age of John for 5 years later

        //int johnsAge5YearsLater = johnsAge + 5;  ==
        //johnsAge = johnsAge + 5;

        johnsAge += 5; // 10

        System.out.println(johnsAge);


        String name = "Alex"; // Alexander

        // String name2 = name + "an";
        //name = name + "an";
        name += "an"; // Alexan
        name += "d"; // Alexand
        name += "e"; //Alexande
        name += "r"; //Alexander

        System.out.println(name); // Alexander


    }
}
