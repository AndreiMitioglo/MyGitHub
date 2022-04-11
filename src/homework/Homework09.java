package homework;

import utilities.ScannerHelper;

import java.util.Locale;

public class Homework09 {
    public static void main(String[] args) {
        System.out.println("\n\t  -------- Task 1 --------");

        /*
HOW TO FIND IF NAME STARTS WITH LOWERCASE OR UPPERCASE A
1. name.startsWith("A") || name.startsWith("a")
2. name.toLowerCase().startsWith("a")
3. name.toUpperCase().startsWith("A")
4. name.charAt(0) == 'A' || name.charAt(0) == 'a'
5. name.charAt(0) == 65 || name.charAt(0) == 97
6. name.toLowerCase().charAt(0) == 'a'
7. name.toLowerCase().charAt(0) == 97
8. name.toUpperCase().charAt(0) == 'A'
9. name.toUpperCase().charAt(0) == 65
 */
        String name = ScannerHelper.getANameFromUser();

        if(!name.isEmpty()){  // needs in case the input is lived empty
            if(name.toUpperCase().charAt(0) == 'A'){
                System.out.println("You are in the club");
            }
            else{
                System.out.println("Sorry, you are not in the club");
            }
        }
        else{
            System.out.println("The name is required!");
        }


        System.out.println("The length of the name is = " + name.length());
        System.out.println("The first character in the name is = " + name.charAt(0));
        System.out.println("The last character in the name is " + name.charAt(name.length() - 1));
        System.out.println("The first 3 characters in the name are = " + name.substring(0, 3));
        System.out.println("The last 3 characters in the name are = " + name.substring(name.length()-3));


        if (name.charAt(0) == 'A' || name.charAt(0) == 'a') {
            System.out.println("You are in the club!");
        } else
            System.out.println("Sorry, you are not in the club");
//===========================================================================================

        System.out.println("\n\t  -------- Task 2 --------");

        String address = ScannerHelper.getAddressFromUser();
        if (address.toLowerCase().contains("chicago"))
            System.out.println("You are in the club");
        else if (address.toLowerCase().contains("des plains"))
        System.out.println("You are welcome to join the club");
        else System.out.println("Sorry, you will never be in the club");




//======================================================================================
        System.out.println("\n\t  -------- Task 3 --------");

        String color = ScannerHelper.getAStringFromUser();

        if (color.toLowerCase().contains("green") && color.toLowerCase().contains("red"))
            System.out.println("Green and red are in the list");
        else if (color.toLowerCase().contains("green"))

            System.out.println("Green is in the list");
        else if (color.toLowerCase().contains("red"))

            System.out.println("Red is in the list");

        else System.out.println("Green and red are not in the list");



//==========================================================================================
        System.out.println("\n\t  -------- Task 4 --------");
//
//        String str = "  Java is FUN   ";
//        String str1 = str.trim().toLowerCase().substring(0, 4);  // this is hard codding
//        String str2 = str.trim().toLowerCase().substring(5, 7);
//        String str3 = str.trim().toLowerCase().substring(8);
//
//
//
//
//        System.out.println("The first word in the str is = " + str1);
//        System.out.println("The second word in the str is = " + str2 );
//        System.out.println("The third word in the str is = " + str3 );

        String str = "  Make your code dynamic   ";

        str = str.toLowerCase().trim(); // "java is fun"

        String s1 = str.substring(0, str.indexOf(' '));
        String s4 = str.substring(str.lastIndexOf(' ')+1);

        str = str.substring(str.indexOf(' ')+1); // "your code dynamic"
        String s2 = str.substring(0, str.indexOf(' '));
        String s3 = str.substring(str.indexOf(' ')+1, str.lastIndexOf(' '));

        System.out.println("The first word in the str is = " + s1);
        System.out.println("The second word in the str is = " + s2);
        System.out.println("The third word in the str is = " + s3);
        System.out.println("The fourth word in the str is = " + s4);

    }
}
