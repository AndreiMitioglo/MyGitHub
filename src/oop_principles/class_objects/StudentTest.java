package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {

        /*
        Create a student object with bellow info:
        firstName = John
         lastName = Doe
         */

        Student student1 = new Student();
        student1.firstName = "John";
        student1.lastName = "Doe";
        student1.age = 45;
        student1.gender = "male";
        student1.address = "Chicago";
        student1.weight = 170.5;
        student1.birth = "01/01/1997";
        student1.email = "johndoe@gmail.com";
        student1.id = 1001;

        System.out.println(student1);// Student{firstName='John', lastName='Doe',
        // age=45, birth='null', gender='male', address='Chicago', height=0.0,
        // weight=170.5, email='johndoe@gmail.com', id=1001}

        Student student2 = new Student();
        student2.firstName = "Lionel";
        student2.lastName = "Messi";
        student2.age = 34;
        student2.gender = "male";
        student2.address = "Paris";
        student2.birth = "01/01/1988";
        student2.weight = 150;
        student2.height = 6.7;

        student2.email = "lionel@gmail.com";
        student2.id = 1002;
        System.out.println(student2);


/*
Create 3 more Student object with below information
firstName = Alex, Jessie, Kaly
lastName = Morgan, Smith, Ngo
age = 20, 15, 16;
dateOfBirth = 01/01/2002 - 01/01/2007 - 01/01/2006
gender = male, female, female
address = Chicago, Miami, Berlin
weight = 165, 160, 150
height = 5.5, 5.7, 5.3
email = alex@gmail.com, jessie@gmail.com, kaly@gmail.com
id = 1003, 1004, 1005

Then, print the objects

 */
        Student student3 = new Student();

        student3.firstName = "Alex";
        student3.lastName = "Morgan";
        student3.age = 20;
        student3.gender = "male";
        student3.address = "Chicago";
        student3.birth = "01/01/2002";
        student3.weight = 165;
        student3.height = 5.5;
        student3.email = "alex@gmail.com";
        student3.id = 1003;
        System.out.println(student3);

        Student student4 = new Student();

        student4.firstName = "Jessie";
        student4.lastName = "Smith";
        student4.age = 15;
        student4.gender = "female";
        student4.address = "Miami";
        student4.birth = "01/01/2007";
        student4.weight = 160;
        student4.height = 5.7;
        student4.email = "jessie@gmail.com";
        student4.id = 1004;
        System.out.println(student4);

        Student student5 = new Student();

        student5.firstName = "Kaly";
        student5.lastName = "Ngo";
        student5.age = 16;
        student5.gender = "female";
        student5.address = "Berlin";
        student5.birth = "01/01/2006";
        student5.weight = 150;
        student5.height = 5.3;
        student5.email = "kaly@gmail.com";
        student5.id = 1005;
        System.out.println(student5);

        System.out.println("\n-------TASK-1----------\n");
        /*
        count how many students are from Chicago ?
        expected 2
         */

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        int counter = 0;
        for (Student student : students) {
            if (student.address.equalsIgnoreCase("chicago")) counter++;

        }
        System.out.println(counter); // 2

        System.out.println("\n-------TASK-2, 3 ----------\n");
        /*
        Count how many are male and females ?
        Count teenagers 13-19 years
        male 3
        female 2
        teenager 2
         */
        int teenager = 0;
        int countMale = 0;
        int countFemale = 0;

        for (Student student : students) {
            if (student.gender.equalsIgnoreCase("male")) countMale++;
           else if (student.gender.toLowerCase().startsWith("f")) countFemale++;
           if (student.age >= 13 && student.age <= 19) teenager++;


        }
        System.out.println(countMale);
        System.out.println(countFemale);
        System.out.println(teenager);

        System.out.println("\n-------TASK-4----------\n");
         /*
        TASK-4
        Print all information of each student in separate lines
         */


        for (Student student : students) { // iter shortcut

            System.out.println(student.firstName);
            System.out.println(student.lastName);
            System.out.println(student.age);
            System.out.println(student.address);
            System.out.println(student.email);
            System.out.println();
        }
      students.forEach(student -> { // different method
          System.out.println(student.firstName);
          System.out.println(student.lastName);
          System.out.println(student.age);
          System.out.println(student.address);
          System.out.println(student.email);
          System.out.println();
          student.study(); // Student studies
          student.eat(); // Student eats
      });


    }
}
