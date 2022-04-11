package projects;

import java.util.Scanner;

public class Project02 {

    public static void main(String[] args) {


                // ------ Task 1 -------
        //   Using scanner class for creating my object.
        //   storing the data in int using multiple declaration.


        Scanner collect = new Scanner(System.in);
        System.out.println("Please enter 3 numbers ");
        int num1 = collect.nextInt(); int num2 = collect.nextInt(); int num3 = collect.nextInt();


        System.out.println("The product of the numbers entered is = " + (num1) * (num2)
        * (num3));
        System.out.println();


               // ------- Task 2 -----

        System.out.println("What is your first name ? ");
        String firstName = collect.next();

        System.out.println("What is your last name ? ");
        String lastName = collect.next();


        System.out.println(" What is your year of birth ? ");

              int yearOfBirth = collect.nextInt();
              int currentYear = 2022;
              int age = currentYear - yearOfBirth;

        System.out.println( firstName + " " + lastName + "'s age is = " + age); //// ????


//         //------------ Task 3 -----------

        System.out.println("What's your full name ? ");
        String fullName = collect.nextLine();

        System.out.println("What is your weight ? in kg ");
        int weight = collect.nextInt();

        System.out.println(fullName + "'s weight is = " + (weight * 2.205) + " lbs");


        // ------ Task 4 -----

        System.out.println("What is your full name ?");
        String student1 = collect.nextLine();
        System.out.println("What is your age ?");
        int student1Age = collect.nextInt();

        System.out.println("What is your full name ?");
        collect.nextLine();   /// trebu de pus ca altfel nu salveaza numele la al 2 lea string
        String student2 = collect.nextLine();
        System.out.println("What is your age ?");
        int student2Age = collect.nextInt();

        System.out.println("What is your full name ?");
        collect.nextLine();
        String student3 = collect.nextLine();
        System.out.println("What is your age ?");
        int student3Age = collect.nextInt();

        int averageAge = (student1Age + student2Age + student3Age) / 3;
        int eldestAge = Math.max(Math.max(student1Age, student2Age), student3Age);
        int youngestAge = Math.min(Math.min(student1Age, student2Age), student3Age);


        System.out.println(student1 + "'s age is " + student1Age);
        System.out.println( student2 + "'s age is " + student2Age);
        System.out.println(student3 + "'s age is " + student3Age);
        System.out.println("The average is " + averageAge);
        System.out.println("The eldest age is " + eldestAge);
        System.out.println("The youngest age is " + youngestAge);



    }
}
