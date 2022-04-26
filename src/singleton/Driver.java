package singleton;

public class Driver {

/*
How to achieve singleton
1. make constructor private
2. declare  a private instance variable off object of driver
3. make this variable static and provide a static getDriver method
4. provide an if condition to initialize the Driver instance variables
if it is null, then initialized
if it is not null, then return the driver witch has been already initialized

NOTE: The single Driver object is also encapsulated .
 */


   private static Driver driver; // declared

    private Driver(){

    }

    public  static Driver getDriver() {
       if(driver == null) driver = new Driver(); // gives same driver
        return driver;
    }
}
