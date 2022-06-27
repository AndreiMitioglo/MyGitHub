package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework23 {

    /*
    Requirement: TASK 1
    Write a method called as parseData() which takes a String has some keys in {}
     and values after between }{ and returns a collection that has all the keys and values as entries.
    NOTE: The keys should be sorted!

    Test Data:
    {104}LA{101}Paris{102}Berlin{103}Chicago{100}London

    Expected Output:
    {100=London, 101=Paris, 102=Berlin, 103=Chicago, 104=LA}

 */

    public static TreeMap<String, String> parseDataAsKeyAndValues(String str){
        TreeMap<String, String> dataTable = new TreeMap<>();
        while(str.contains("{")){
            String key = str.substring(str.indexOf("{")+1, str.indexOf("}"));
            str = str.substring(str.indexOf("}"));
            String value = str.contains("{") ? str.substring(str.indexOf("}")+1, str.indexOf("{")) : str.substring(1);
            if(str.contains("{")) str = str.substring(str.indexOf("{"));
            dataTable.put(key, value);
        }
        return dataTable;
    }







        /*
        Requirement: TASK 2
    Write a method called as calculateTotalPrice1() which takes a Map
    of some shopping items with their amounts and calculates the total prices as double.
    Item prices are given below
    Apple = $2.00
    Orange = $3.29
    Mango = $4.99
    Pineapple = $5.25

    Test Data 1:
    {Apple=3, Mango = 1}

    Expected Output 1:
    10.99

    Test Data 2:
    {Apple=2, Pineapple = 1, Orange=3}

    Expected Output 2:
    19.12

     */

public static double calculateTotalPrice1(Map<String, Integer> fruits){
    double totalSum = 0;
    Map<String, String> prices = new HashMap<>();
    prices.put("Apple", "$2.00");
    prices.put("Orange", "$3.29");
    prices.put("Mango", "$4.99");
    prices.put("Pineapple", "$5.25");
    for (String product : fruits.keySet())
        for (int i = 0; i < fruits.get(product); i++)
            totalSum += Double.parseDouble(prices.get(product).substring(1));
    return (double) Math.round(totalSum * 100) / 100;




}


    /*
        Requirement: TASK 3
    Write a method calculateTotalPrice2() which takes a Map of some shopping items
     with their amounts and calculates the total prices as double. Item prices are given below:
    Apple = $2.00
    Orange = $3.29
    Mango = $4.99

    BUT there will be some discounts as below
    There will be %50 discount for every second Apple
    There will be 1 free Mango if customer gets 3. So, fourth one is free.

    Test Data 1:
    {Apple=3, Mango = 5}

    Expected Output 1:
    24.96

    Test Data 2:
    {Apple=4, Mango = 8, Orange=3}

    Expected Output 2:
    45.81

     */

    public static double calculateTotalPrice2(Map<String, Integer> quantityOfItems){
        double totalPrice = 0;

        HashMap<String, String> pricesOfItems = new HashMap<>();
        pricesOfItems.put("Apple", "$2.00");
        pricesOfItems.put("Orange", "$3.29");
        pricesOfItems.put("Mango", "$4.99");

        for (String item :quantityOfItems.keySet()) {
//            Integer amountOfItem = quantityOfItems.get(item);
            // mango --> 10 / 4 = 2
            // mango -->  quantityOfItems.get(item) / 4 = 2

            // Apple --> 11 / 2 = 5
            // Apple --> 12 / 2 = 6
            // Apple -->  quantityOfItems.get(item) / 2

            totalPrice += Double.parseDouble(pricesOfItems.get(item).substring(1)) * quantityOfItems.get(item);
            if (item.equals("Mango")) totalPrice -=
                    Double.parseDouble(pricesOfItems.get(item).substring(1)) * (int)(quantityOfItems.get(item) / 4);
            if (item.equals("Apple")) totalPrice -=
                    (Double.parseDouble(pricesOfItems.get(item).substring(1)) / 2) * (int)(quantityOfItems.get(item) / 2);
        }
        return totalPrice;
    }


    public static double getNumberAfterPoint(double number, int decimal){
        int decimalValue = 1 ;
        for (int i = 0; i < decimal; i++) decimalValue *= 10;
        return (double) Math.round(number * decimalValue) / decimalValue;
    }
}


