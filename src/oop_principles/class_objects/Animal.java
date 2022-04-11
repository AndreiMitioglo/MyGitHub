package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    // default constructor
    public Animal(){

    }
    // Custom constructor that takes 6 arguments

    public Animal(String name, String color, int age, boolean isCarnivore,
                  boolean isHerbivore, boolean isOmnivore ){
        // i should assign these local variables into instance variable
        this.name = name; // local to instance variables
        this.color = color;
        this.age = age;
        this.isOmnivore = isOmnivore;
        this.isHerbivore = isHerbivore;
        this.isCarnivore = isCarnivore;
    }



    // Fields of an Animal
    public  static final boolean hasEyes = true; // static -> belongs to all animals
    public String name;
    public int age;
    public String color;
    public boolean isCarnivore;
    public boolean isHerbivore;
    public boolean isOmnivore;

//    @Override
//    public String toString() {
//        return "Animal{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", color='" + color + '\'' +
//                ", isCarnivore=" + isCarnivore +
//                ", isHerbivore=" + isHerbivore +
//                ", isOmnivore=" + isOmnivore +
//                '}';




     @Override
    public String toString() {
         String s = "Animal{";
         if (this.name != null) s += "name='" + this.name + '\'';
         if (this.color != null) s += ", color='" + this.color + '\'';
         if (this.age != 0) s += ", age=" + this.age;
         if (this.isCarnivore) s += ", isCarnivore=" + this.isCarnivore;
         if (this.isHerbivore) s += ", isHerbivore=" + this.isHerbivore;
         if (this.isOmnivore) s += ", isOmnivore=" + this.isOmnivore;
         s += '}';
         return s;

     }
// testing Animal

    public static void main(String[] args) {
        int count = 0;
        Animal animal1 = new Animal();
        count++;
        Animal animal2 = new Animal();
        count++;

        // animal1.hasEyes = false; // compiler error it is final

        System.out.println(Animal.hasEyes); // true // called whit Class name
        System.out.println(count + " times Animal object are created"); // 2 times Animal object are created

 /*
        Create an animal object called a1 and define its information as below
        Cow
        3
        Black
        Herbivore
         */


        Animal a1 = new Animal();
        a1.name = "Cow";
        a1.age = 3;
        a1.color= "Black";
        a1.isHerbivore = true;
        a1.isCarnivore = false;
        a1.isOmnivore = false;


        System.out.println(a1);

        Animal a2 = new Animal("Cow", "Black", 3,
                true, false, true);

        System.out.println(a2);// Animal{name='Cow', age=3, color='Black',
                              // isCarnivore=true, isHerbivore=false, isOmnivore=true}

         /*
        Create a2 object with below info
        Cat
        1
        Gray
        Omnivore

        Print it as well
         */
        Animal a3 = new Animal("Cat","Gray", 1,
                false, false, true);
        System.out.println(a3);
/*
Create a3 object with below info
Parrot
2
White
Herbivore

Print it as well
 */
        Animal a4 = new Animal("Parrot","White", 2,
                false, true,false);
        System.out.println(a4);

/*
Create a4 object with below info
Lion
4
Beige
Carnivore

Print it as well
 */

Animal a5 = new Animal("lion", "Beige", 4, true, false, false);
        System.out.println(a5);

/*
TASK-1
Store your animal object in a collection
Count how many herbivore, omnivore and carnivore animal object you have

RESULT:
Herbivore = 2
Carnivore = 1
Omnivore = 1
 *///
                       // can create ArrayList whit asList(a1,a2,a3,a4)
        // List<Animal> animals = new ArrayList<>(Arrays.asList(a1,a2,a3,a4));

        List<Animal> animals = new ArrayList<>();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
        animals.add(a4);
//
//        int omnivore = 0, carnivore = 0, herbivore = 0;
//        for (Animal animal : animals) {
//              if  (animal.isCarnivore) carnivore++;
//             else if(animal.isOmnivore) omnivore++;
//             else  herbivore++;

   //     }

                // lambda expression
        // count return a log , then casting to (int)
        int herbivoreCount = (int) animals.stream().filter(animal -> animal.isHerbivore).count();
        int carnivoreCount = (int) animals.stream().filter(animal -> animal.isCarnivore).count();
        int omnivoreCount = (int) animals.stream().filter(animal -> animal.isOmnivore).count();

        System.out.println("Herbivore = " + herbivoreCount);
        System.out.println("Omnivore = " + omnivoreCount);
        System.out.println("Carnivore " + carnivoreCount);


    }


}
