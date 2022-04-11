package operator.shortHandAsignmentOperators;

import java.util.Scanner;

public class Exercise2 {
         //Write a Java program that asks user to enter their balance and
         // one day transactions. Subtract each transaction from balance and return new balance
         // using shorthand operator
    public static void main(String[] args) {

        Scanner transactionInput = new Scanner(System.in);

        System.out.println("Please enter your balance= $"); //100 $

       double ballance = transactionInput.nextDouble();  // double because money

        System.out.println("Enter your first transaction = $");// 20$
        double firstTransaction = transactionInput.nextDouble();

         ballance -= firstTransaction; // 80$
        System.out.println("Balance after 1st transaction = $" + ballance); // 80

        System.out.println("Enter your second transaction"); // 30$
        double secondTran = transactionInput.nextDouble();
           ballance -= secondTran;  // 50$  (80-30)
        System.out.println("Balance after 2st transaction = $" + ballance);
        System.out.println(ballance);// 5

    }


}
