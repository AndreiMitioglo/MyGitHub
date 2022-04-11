package javaMemoryManagement;

public class GarbageCollection {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        System.out.println(" === object locations before loosing reference===");
        System.out.println(dog1); // Dog@1b6d3586
        System.out.println(dog2); // Dog@4554617c
        System.out.println(dog1.equals(dog2)); // false

        System.out.println(" === object locations before loosing reference===");

        dog1 = dog2; // dog1 is loosing reference here and garbage collected

        // Explicitly doing Garbage Collection
        System.gc();
        Runtime.getRuntime().gc();
        System.out.println(dog1); // Dog@4554617c
        System.out.println(dog2); // Dog@4554617c
        System.out.println(dog1.equals(dog2)); // true


    }
}
