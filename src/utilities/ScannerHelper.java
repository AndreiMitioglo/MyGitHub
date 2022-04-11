package utilities;

import java.util.Scanner;

public class ScannerHelper {

    public static int getNumberFromUser() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : "); // returns int
        int number = scanner.nextInt();

        return number;
    }

    // --------------------------------------------------
    public static String getANameFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a name: "); // return a string
        String name = scanner.nextLine();
        return name;
    }

    public static String getAStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String string = scanner.nextLine();
        return string;
    }

    public static String getAddressFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your address: ");
        String address = scanner.nextLine();
        return address;
    }
}

