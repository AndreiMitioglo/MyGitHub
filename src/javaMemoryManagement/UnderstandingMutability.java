package javaMemoryManagement;

public class UnderstandingMutability {
    public static void main(String[] args) {
        String city = "Chicago";
        String address = "Chicago";

        city = "Miami";

        System.out.println(city); // Miami
        System.out.println(address); // Chicago

        System.out.println(city== address); // true -> not proper. location is same
        System.out.println(city.equals(address)); // true -> and proper way
   }
}
