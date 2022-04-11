package collections.arraylist;

import java.util.ArrayList;

public class AddingAllAndRemovingAll {
    public static void main(String[] args) {
/*
TASK-1
Create an ArrayList of germanCars and add below items
BMW
Mercedes
Volkswagen

Then print the list

RESULT:
German cars = [BMW, Mercedes, Volkswagen]
 */


        ArrayList<String> germanCars = new ArrayList<>();
        germanCars.add("Mercedes");
        germanCars.add("Volkswagen");
        germanCars.add("BMW");
        germanCars.add("Audi");

        System.out.println(germanCars); // [Mercedes, Volkswagen]

        /*
TASK-2
Create an ArrayList of japaneseCars and add below items
Honda
Toyota
Lexus

Then print the list

RESULT:
Japanese cars = [Honda, Toyota, Lexus]
 */

        ArrayList<String> japanCars = new ArrayList<>();
        japanCars.add("Honda");
        japanCars.add("Toyota");
        japanCars.add("Lexus");

        System.out.println("Japanese cars = " + japanCars);//Japanese cars = [Honda, Toyota, Lexus]

/*
TASK-3
Create an ArrayList of luxuryCars and store below cars
Maserati
Tesla
Range Rover
Jaguar

Then print the list

RESULT:
Luxury cars = [Maserati, Tesla, Range Rover, Jaguar]
 */
        ArrayList<String> luxuryCars = new ArrayList<>();

        luxuryCars.add("Maserati");
        luxuryCars.add("Tesla");
        luxuryCars.add("Range Rover");
        luxuryCars.add("Jaguar");
        System.out.println("Luxury cars = " + luxuryCars);


        System.out.println("=========== put all together==============");

        ArrayList<String> inventory = new ArrayList<>();
        System.out.println("Inventory of the beginning " + inventory); // Inventory of the beginning []

        // adding all german cars to the inventory collections
        inventory.addAll(germanCars);
        System.out.println("Inventory after adding german cars " + inventory);

        // adding all luxury cars

        inventory.addAll(luxuryCars);

        System.out.println(inventory); // [Mercedes, Volkswagen, Maserati, Tesla, Range Rover, Jaguar]

        // adding all japanese cars
        inventory.addAll(germanCars.size(), japanCars); // germanCars.size()->  it is a index  of 3

        System.out.println(inventory);//[Mercedes, Volkswagen,BMW,
                                      // "Honda", Toyota, Lexus, Maserati, Tesla, Range Rover, Jaguar]

        // remove all japanese cars
        inventory.removeAll(japanCars);
        System.out.println(inventory); // [Mercedes, Volkswagen, BMW, Maserati, Tesla, Range Rover, Jaguar]

        // remove Tesla, Audi and BMW
//        inventory.remove("Audi");
//        inventory.remove("BMW");
//        inventory.remove("Tesla");
//        inventory.remove(3);

        ArrayList<String> carsTobeRemoved = new ArrayList<>();
        carsTobeRemoved.add("BMW");
        carsTobeRemoved.add("Tesla");

        inventory.removeAll(carsTobeRemoved); //[Mercedes, Volkswagen, BMW, Audi, Maserati, Tesla, Range Rover, Jaguar]





    }
}
