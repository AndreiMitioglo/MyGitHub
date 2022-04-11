package projects;

import java.util.Scanner;

public class example {

    public static void main(String[] args) {

        Scanner collect = new Scanner(System.in);

        System.out.println("What is your full name ?");
        String student1 = collect.nextLine();
        System.out.println("What is your age ?");
        int student1Age = collect.nextInt();

        System.out.println("What is your full name ?");
        collect.nextLine(); ///face stop /// trebu de pus ca altfel nu se opreste la al 2 lea string
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
