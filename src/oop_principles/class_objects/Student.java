package oop_principles.class_objects;

public class Student {

    // Please call default constructor

    public Student() {


    }

    // Define instance variable of Students
    // firstName, lastName, age, date of birth, gender....

    public String firstName;
    public String lastName;
    public int age;
    public String birth;
    public String gender;
    public String address;
    public double height;
    public double weight;
    public String email;
    public int id;


    // define Student behavior -> function
    // study, eat, sleep


    public void study(){
        System.out.println("Student studies");
    }
    public void eat(){
        System.out.println("Student eats");
    }
    public void sleep(){
        System.out.println("Student sleeps");
    }

    // override toString method from object class


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", birth='" + birth + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
}
