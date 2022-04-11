package oop_principles.class_objects;

public class Apple {
    /*
     class members
     1.Attributes
     2. methods
     3. blocks
     4. constructors -> help us to create objects
     */
    // This is a default constructor
//   public Apple(){
//       System.out.println("This is zero-arg constructor");
//       System.out.println("Hello World");
//
//   }
//     // One-arg constructor- custom
//    public Apple(int number){
//        System.out.println("One arg constructor is invoked with " + number);
//
//    }
//
//    public Apple(String s, int i){
//        System.out.println("This is 2 arg constructor");
//
//    }
//    public static void  doNothing(){
//       // this block will be executed each time this method is invoked-called
//        System.out.println("Well, im doing nothing");

                     // default constructor
    public Apple(){


    }
    // define instance variables (color, taste, price)
    public String color;
    public String taste;
    public double price;

    public String toString(){
        return "Apple {" + " color= " + color + " taste= "
                + taste + " price= " + price + "}";
    }


}
