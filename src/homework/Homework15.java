package homework;

import primitives.Char;
import utilities.CharacterHelper;

import java.util.ArrayList;
import java.util.Collections;

public class Homework15 {
    public static void main(String[] args) {


        System.out.println("\n\t  -------- Task 1 --------");
        /*
-Create an ArrayList and store below numbers
10, 23, 67, 23, 78

THEN:
-Print element at index of 3
-Print element at index of 0
-Print element at index of 2
-Print the entire list
Expected Result:
23
10
67
[10, 23, 67, 23, 78]


         */
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(67);
        numbers.add(23);
        numbers.add(78);


        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);


        System.out.println("\n\t  -------- Task 2 --------");

        /*
        Requirement:
-Create an ArrayList and store below colors
Blue, Brown, Red, White, Black, Purple

THEN:
-Print element at index of 1
-Print element at index of 3
-Print element at index of 5
-Print the entire list

Expected Result:
Brown
White
Purple
[Blue, Brown, Red, White, Black, Purple]

         */

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");

        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);


        System.out.println("\n\t  -------- Task 3 --------");

/*
Requirement:
-Create an ArrayList and store below numbers
23, -34, -56, 0, 89, 100

THEN:
-Print the entire list
-Print the entire list sorted in ascending order

Expected Result:
[23, -34, -56, 0, 89, 100]
[-56, -34, 0, 23, 89, 100]

 */

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(23);
        nums.add(-34);
        nums.add(-56);
        nums.add(0);
        nums.add(89);
        nums.add(100);

        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);

        System.out.println("\n\t  -------- Task 4 --------");
        /*
        Requirement:
-Create an ArrayList and store below cities
Istanbul, Berlin, Madrid, Paris

THEN:
-Print the entire list
-Print the entire list sorted lexicographically

Expected Result:
[Istanbul, Berlin, Madrid, Paris]
[Berlin, Istanbul, Madrid, Paris]

         */

        ArrayList<String> countries = new ArrayList<>();
        countries.add("Istanbul");
        countries.add("Berlin");
        countries.add("Madrid");
        countries.add("Paris");

        System.out.println(countries);
        Collections.sort(countries);
        System.out.println(countries);

        System.out.println("\n\t  -------- Task 5 --------");

        /*
        Requirement:
-Create an ArrayList and store Marvel characters below
Spider Man, Iron Man, Black Panter, Deadpool, Captain America

THEN:
-Print the entire list
-Then, check if it contains Wolwerine
	if it contains Wolwerine, then print true
	if it does not contain Wolwerine, print false

Expected Result:
[Spider Man, Iron Man, Black Panter, Deadpool, Captain America]
false

         */
    ArrayList<String> marvel = new ArrayList<>();
    marvel.add("Spider Man");
    marvel.add("Iron Man");
    marvel.add("Black Panter");
    marvel.add("SDeadpool");
    marvel.add("Captain America");

        System.out.println(marvel);
          boolean isWolwerine = false;
        for (String character : marvel) {

            if (character.equals("Wolwerine")) isWolwerine = true;
                        break;
        }
        System.out.println(isWolwerine);

        System.out.println("\n\t  -------- Task 6 --------");

/*
Requirement:
-Create an ArrayList and store Avengers characters below
Hulk, Black Widow, Captain America, Iron Man

THEN:
-Print the entire list sorted lexicographically
-Then, check if it contains Hulk and Iron Man
	if it contains both, then print true
	if it does not contain both, print false

Expected Result:
[Black Widow, Captain America, Hulk, Iron Man]
true

 */

        ArrayList<String> avengers = new ArrayList<>();
        avengers.add("Hulk");
        avengers.add("Black Widow");
        avengers.add("Captain America");
        avengers.add("Iron Man");
        Collections.sort(avengers);
        System.out.println(avengers);

         int count = 0;
        for (String avenger : avengers) {
            if (avenger.equals("Hulk")) {
                count++;
            } else if (avenger.equals("Iron Man"))  count++;

        }
        System.out.println(count>1);


        System.out.println("\n\t  -------- Task 7 --------");
        /*
        Requirement:
-Create an ArrayList and store characters below
A, x, $, %, 9, *, +, F, G

THEN:
-Print the entire list
-Print each element

Expected Result:
[A, x, $, %, 9, *, +, F, G]
A
x
$
%
9
*
+
F
G

         */

       ArrayList<Character>  characters = new ArrayList<>();
       characters.add('A');
       characters.add('x');
       characters.add('$');
       characters.add('%');
       characters.add('9');
       characters.add('*');
       characters.add('+');
       characters.add('F');
       characters.add('G');
        System.out.println(characters);

        for (Character character : characters) {
            System.out.println(character);
        }

        System.out.println("\n\t  -------- Task 8 --------");
/*
Requirement:
-Create an ArrayList and store below objects
Desk, Laptop, Mouse, Monitor, Mouse-Pad, Adapter

THEN:
-Print the entire list
-Print the entire list sorted lexicographically
-Count objects that starts with M or m
-Count objects that does not have A or a or E or e

Expected Result:
[Desk, Laptop, Mouse, Monitor, Mouse-Pad, Adapter]
[Adapter, Desk, Laptop, Monitor, Mouse, Mouse-Pad]
3
1

 */


        ArrayList<String>  objects = new ArrayList<>();
     objects.add("Desk");
     objects.add("Laptop");
     objects.add("Mouse");
     objects.add("Monitor");
     objects.add("Mouse-Pad");
     objects.add("Adapter");
        System.out.println(objects);
        Collections.sort(objects);
        System.out.println(objects);

        int startsMOrm = 0, dontHaveAaEe = 0;
        for (String object : objects) {
            if (object.toLowerCase().startsWith("m")) startsMOrm++;
             if (!object.toLowerCase().contains("a") && !object.toLowerCase().contains("e")) dontHaveAaEe++;

        }
        System.out.println(startsMOrm);
        System.out.println(dontHaveAaEe);

        System.out.println("\n\t  -------- Task 9 --------");
/*
Requirement:
-Create an ArrayList and store below kitchen objects
Plate, spoon, fork, Knife, cup, Mixer

THEN:
-Print the entire list
-Print how many elements starts with uppercase
-Print how many elements starts with lowercase
-Print how many elements has P or p
-Print how many elements starts or ends with P or p

Expected Result:
[Plate, spoon, fork, Knife, cup, Mixer]
Elements starts with uppercase = 3
Elements starts with lowercase = 3
Elements having P or p= 3
Elements starting or ending with P or p = 2

 */

        ArrayList<String>  kitchen = new ArrayList<>();
        kitchen.add("Plate");
        kitchen.add("spoon");
        kitchen.add("fork");
        kitchen.add("Knife");
        kitchen.add("cup");
        kitchen.add("Mixer");
        System.out.println(kitchen);
        int startsUpper = 0, startsLower = 0, hasPOrp = 0, startEndPOrp = 0;

        for (String element : kitchen) {
            if (CharacterHelper.isUppercase(element.charAt(0)))  startsUpper++;
            if (CharacterHelper.isLowercase(element.charAt(0))) startsLower++;
            if (element.toLowerCase().contains("p")) hasPOrp++;
            if (element.toLowerCase().startsWith("p") || element.toLowerCase().endsWith("p")) startEndPOrp++;

        }
        System.out.println("Elements starts with uppercase = " + startsUpper);
        System.out.println("Elements starts with lowercase = " + startsLower);
        System.out.println("Elements having P or p= " + hasPOrp);
        System.out.println("Elements starting or ending with P or p = " + startEndPOrp);

        System.out.println("\n\t  -------- Task 10 --------");
/*
Requirement:
-Create an ArrayList and store below numbers
3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78

THEN:
-Print the entire list
-Print how many element can be divided by 10
-Print how many even numbers are greater than 15
-Print how many odd numbers are less than 20
-Print how many elements are less than 15 or greater than 50

Expected Result:
[3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78]
Elements that can be divided by 10 = 4
Elements that are even and greater than 15 = 3
Elements that are odd and less than 20 = 4
Elements that are less than 15 or greater than 50 = 8

 */

        ArrayList<Integer> numbs = new ArrayList<>();
   numbs.add(3);
   numbs.add(5);
   numbs.add(7);
   numbs.add(10);
   numbs.add(0);
   numbs.add(20);
   numbs.add(17);
   numbs.add(10);
   numbs.add(23);
   numbs.add(56);
   numbs.add(78);

        System.out.println(numbs);
        int divBy10 = 0, greaterThan15 = 0, oddLess20 = 0, less15Great50 = 0;

        for (Integer numb : numbs) {
            if (numb % 10 == 0) divBy10++;
            if (numb > 15 && numb % 2 == 0) greaterThan15++;
            if (numb % 2 == 1 && numb < 20) oddLess20++;
            if (numb < 15 || numb > 50) less15Great50++;

        }
        System.out.println("Elements that can be divided by 10 = " + divBy10);
        System.out.println("Elements that are even and greater than 15 = " + greaterThan15);
        System.out.println("Elements that are odd and less than 20 = " + oddLess20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + less15Great50);


    }
}