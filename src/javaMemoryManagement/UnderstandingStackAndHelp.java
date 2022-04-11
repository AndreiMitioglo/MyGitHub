package javaMemoryManagement;

public class UnderstandingStackAndHelp {
    public static void main(String[] args) {

        int age = 45;
        System.out.println(age); // 45

    // reference ->  // object
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(dog1); //Dog@1b6d3586  different location than dog2
        System.out.println(dog2); //Dog@4554617c

        dog1.breed = "pupy";
        dog2.age = 5;

    }
}
