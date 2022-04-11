package operator.arithmeticOrerators;

public class Exercise3 {

    public static void main(String[] args) {

/*     Exercise
An annual average salary for an SDET in the Unites States is 90k.
 Write a Java program that calculates and prints the monthly and
 bi-weekly and weekly average amount that an SDETs makes in the United States

 */
        /*
        Pseudo code

        1. Create the variable
        2. Do the equation
        3. Print them

         */

        double avgSalary = 90_000.00;  // 90000.00
        double montSal = avgSalary / 12;
        double biWeeklySal = avgSalary / 26;
        double weeklySal = avgSalary / 52;

        System.out.println(" Mountly salary = " + montSal);
        System.out.println("Bi weekly salary = " + biWeeklySal);





    }
}
