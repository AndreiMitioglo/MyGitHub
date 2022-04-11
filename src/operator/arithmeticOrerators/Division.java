package operator.arithmeticOrerators;

public class Division {

    public static void main(String[] args) {

       double num1 = 15.6;
       double num2 = 4.5;
       int num3 = 4;
       int num4 = 10;

        double division = num1 / num2;
        double divisionByINT = num1 /num3;
        double divisionByDouble = num4 / num2;

        System.out.println("num1 / num2 =" + division);  // double / double
        System.out.println("num1 / num3 =" +  divisionByINT); // double / int
        System.out.println("num4 / num2 =" + divisionByDouble);  // int / double

        System.out.println("num1 / num2 =" +(num1 / num2));  // double / double
        System.out.println("num1 / num3 =" +  (num1 /num3)); // double / int
        System.out.println("num4 / num2 =" + (num4 / num2));  // int / double
                                             // 10     3
                                                       // fara paranteze le pune una dupa alta 103






    }
}
