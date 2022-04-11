package collections.arraylist;

import utilities.CharacterHelper;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class _01_PracticeCountingArrayListElement {
    public static void main(String[] args) {

        //ArrayList<String> numbers = new ArrayList<>();
        /*
TASK-1
Create an ArrayList called numbers that stores below numbers,

10
12
13
8
9
15

Print the list
 */

       List<Integer> numbers = new ArrayList<>();
        numbers.add(10);       // {10,12,13,8,9};
        numbers.add(12);
        numbers.add(13);
        numbers.add(8);
        numbers.add(9);
        System.out.println(numbers);


     /*
TASK-2
Count how many odd numbers you have in the list and print the result

RESULT:
Odds = 3
 */         // for each loop
        int countOdds = 0;
        for ( int number : numbers){
            if (number % 2 == 1) countOdds++;
        }

        //     for i loop
        System.out.println(countOdds);
        for (int i = 0; i <numbers.size() ; i++) {
            if (numbers.get(i) % 2 ==1) countOdds++;
        }System.out.println("odds = " + countOdds);

/*
TASK-3
Create a List called colors that stores below elements
Purple
Yellow
blue
red
Brown
Black
White

And then print the list

RESULT:
[Purple, Yellow, blue, red, Brown, Black, White]
 */

        List<String> colors = new ArrayList<>();
        colors.add("Purple");
        colors.add("Yellow");
        colors.add("blue");
        colors.add("red");
        colors.add("Brown");
        colors.add("Black");
        colors.add("White");

        System.out.println(colors);

   /*
TASK-4
Count how many colors in the colors list are starting with uppercase

RESULT:
5
 */
       // for each loop
        int count = 0;
        for (String color: colors){
            if(Character.isUpperCase(color.charAt(0))) count++;
        }
        System.out.println(count);

        // for i loop
              int count1 = 0;
        for (int i = 0; i < colors.size() ; i++) {
           if(Character.isUpperCase(colors.get(i).charAt(0))) count1++;
        }
        System.out.println(count1);





    }

}
