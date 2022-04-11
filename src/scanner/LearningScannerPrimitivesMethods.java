package scanner;

import java.sql.SQLOutput;
import  java.util.Scanner;


public class LearningScannerPrimitivesMethods {

    public static void main(String[] args){

    /*
    How to use Scanner methods
    1. Create an object of Scanner(import the class as well)
    ClassName/DataType variable/objectName = new ClassName/DataType(if it is needed);

    2. variableName/objectName.methodName (if it is needed parameter);

     */
      /*
        Task-1
        1. Ask user their age
        2. Print the question
        3. Use the proper next method(nextInt)
        4. Print out the users age


       */
        Scanner collect = new Scanner(System.in);
        System.out.println("What is your age ?");
        int usersAge = collect.nextInt();


        System.out.println("User age is =" + usersAge);


        System.out.println("What is your account balance ?");
        double userAccount = collect.nextDouble();
        System.out.println("\n'The balance is\' = \"$" + userAccount + "\""); // "$22.56"




        /*
        Ask for user are you understanding this java claas today?
        Get the answer and store it
        Print the answer

         */


        System.out.println("Are you understanding this java claas today ?");
        boolean userAnswer = collect.nextBoolean();
        System.out.println("Are uoy enjoying the java classes ?" + userAnswer);





    }
}
