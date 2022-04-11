package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleTest {

    public static void main(String[] args) {
        // Create 2 Apple objects
//
//        Apple apple1 =  new Apple();// This is zero-arg constructor
//        System.out.println(apple1); // oop_principles.class_objects.Apple@1b6d3586
//
//        Apple apple2 = new Apple();
//        System.out.println(apple2); // oop_principles.class_objects.Apple@4554617c
//
//        Apple apple3 = new Apple(5);  // can run whith out System.out.println()
//
//        System.out.println(apple3); // oop_principles.class_objects.Apple@74a14482
//
//
//        Apple apple4 = new Apple("",5);//One arg constructor is invoked with 5
//
//        Apple.doNothing();// Well, im doing nothing

        Apple apple1 = new Apple();
        apple1.color = "Red";
        apple1.taste = "Sweet";
        apple1.price = 0.99;

        System.out.println(apple1.color); // Red
        System.out.println(apple1.taste); // Sweet
        System.out.println(apple1.price); // 0.99

        Apple apple2 = new Apple();
        apple2.color = "Green";
        apple2.taste = "Sour";
        apple2.price = 1.29;

        System.out.println(apple2.color); // Green
        System.out.println(apple2.price); // 1.29

        System.out.println(apple1.toString()); // Apple { color= Red taste= Sweet price= 0.99}
        System.out.println(apple2.toString()); // Apple { color= Green taste= Sour price= 1.29}

        Apple apple3 = new Apple();

        System.out.println(apple3); // Apple { color= null taste= null price= 0.0}

        Apple[] myApples = {apple1, apple2, apple3};
        System.out.println(Arrays.toString(myApples)); // [Apple { color= Red taste= Sweet price= 0.99},
                                                       // Apple { color= Green taste= Sour price= 1.29},
                                                       // Apple { color= null taste= null price= 0.0}]

        ArrayList<Apple> myAppleList = new ArrayList<>(Arrays.asList(myApples));
        System.out.println(myAppleList);// [Apple { color= Red taste= Sweet price= 0.99},
                                        // Apple { color= Green taste= Sour price= 1.29},
                                        // Apple { color= null taste= null price= 0.0}]

        for (Apple apple : myAppleList){
              System.out.println("My apple = " + apple); // My apple = Apple { color= null taste= null price= 0.0}
                }
        for (Apple apple : myAppleList){
            System.out.println(apple.color);
            System.out.println(apple.taste);
            System.out.println(apple.price);
        }
    }

}
