package oop_principles.class_objects;

public class Fruit {

    // Instance variables
    public static boolean hasColor;

    static {
        hasColor = true;
    }

    public String name;
    public String shape;
    public boolean isSweet;

    {
        shape = "Round";
        isSweet = true;
    }

    public static void main(String[] args) {
        Fruit fruit1 = new Fruit();

        System.out.println(Fruit.hasColor); // false

        System.out.println(fruit1.name);// null
        System.out.println(fruit1.shape); // Round
        System.out.println(fruit1.isSweet); // true

    }

        }



