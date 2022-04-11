package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1); // oop_principles.class_objects.Car@1b6d3586

        System.out.println(car1.getClass().getName());// oop_principles.class_objects.Car
        System.out.println(car1.equals(car1)); // true


        car1.make = "Tesla";
        car1.model = "S";
        car1.color = "Red";
        car1.year = 2022;

        System.out.println(car1.make); //Tesla
        System.out.println(car1.model); // S
        System.out.println(car1.year);// 2022
        System.out.println(car1.color); // Red
        System.out.println(car1.hasRoof); // false nothing assigned yet


        Car car2 = new Car();

        car2.make = "BMW";

        Car car3 = new Car();
        System.out.println(car3.make); // null
          car3.make= "Tesla";
        System.out.println(car1);// Car{make='Tesla', model='S', color='Red', year=2022, price=0.0, hasRoof=false}

        car1.drives();// This car drives
        car3.drives();// This car drives
        car1.honks(); // This car honks
           car2.drives();

        Car car4 = new Car();
        car4.make = "Tesla";
        car4.year = 2020;

        System.out.println("=====  Cars List ======'");

        List<Car> myCars = new ArrayList<>();
        System.out.println(myCars); // [] empty
        myCars.add(car1);
 System.out.println(myCars); //[Car{make='Tesla', model='S', color='Red', year=2022, price=0.0, hasRoof=false}]

        myCars.add(car2);
        myCars.add(car3);

        for (Car myCar : myCars){
            if( myCar.make.equals("Tesla") ) System.out.println(myCar); // only 2 are Tesla
        }







    }
}
