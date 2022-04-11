package homework;

import primitives.Char;
import utilities.CharacterHelper;
import utilities.StringHelper;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {

        System.out.println("\n\t  -------- Task 1 --------");

        int[] num = {89, 0, 23, 0, 12, 0, 15, 34, 0, 7};
        System.out.println(num[3]);
        System.out.println(num[0]);
        System.out.println(num[9]);
        System.out.println(Arrays.toString(num));

        System.out.println("\n\t  -------- Task 2 --------");

        String[] str = new String[5];
        str[1]= "abc";
        str[4]= "xyz";
        System.out.println(str[3]);
        System.out.println(str[0]);
        System.out.println(str[4]);
        System.out.println(Arrays.toString(str));

        System.out.println("\n\t  -------- Task 3 --------");

        int[] numbers = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println("\n\t  -------- Task 4 --------");

        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        System.out.println("\n\t  -------- Task 5 --------");

        String[] dogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky" };
        System.out.println(Arrays.toString(dogs));

        boolean hasPluto = false;
        for (String dog: dogs) {
            if (dog.equals("Pluto")) {
                hasPluto = true;
                break;
            }
        }
        System.out.println(hasPluto);


        System.out.println("\n\t  -------- Task 6 --------");

        String[] cartoonCats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cartoonCats);
        System.out.println(Arrays.toString(cartoonCats));

        boolean hasGarfield = false;
        boolean hasFelix = false;
        boolean hasFelixAndHasGarfield = false;

        for(String element :cartoonCats) {
            if (element.equalsIgnoreCase("Garfield")) hasGarfield = true;
            if (element.equalsIgnoreCase("Felix")) hasFelix = true;
            if (hasFelix && hasGarfield) hasFelixAndHasGarfield = true;

        }
        System.out.println(hasFelixAndHasGarfield);



//        String[] cats = {"Garfield", "Tom", "Sylvester", "Azrael"};
//        Arrays.sort(cats);
//        System.out.println(Arrays.toString(cats));
//          int gotCats = 0;
//        for (String cat: cats) {
//            if (cat.equals("Garfield") || cat.equals("Felix"))
//                gotCats++;


//        System.out.println(gotCats>1);

        System.out.println("\n\t  -------- Task 7 --------");

        double[] numb = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(numb));
        for (double element : numb){
            System.out.println(element);
        }

        System.out.println("\n\t  -------- Task 8 --------");
/*
-Print the entire array
-Print the total count of the letters
-Print the total count of lowercase letters
-Print the total count of uppercase letters
-Print the total count of digits
-Print the total count of special characters

// */
        char[] characters = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};
        System.out.println(Arrays.toString(characters));
        int letters = 0, lowercase = 0, uppercase = 0, digits= 0, special = 0;
        for (char count : characters){
            if(Character.isLetter(count)) letters++;
             if (Character.isLowerCase(count)) lowercase++;
             if (Character.isUpperCase(count)) uppercase++;
             if (Character.isDigit(count)) digits++;

        }
        System.out.println("Letters = " + letters);
        System.out.println("Uppercase letters = " + uppercase);
        System.out.println("Lowercase letters = " + lowercase);
        System.out.println("Digits = " + digits);
        System.out.println("Special characters = " + (characters.length - letters - digits));

        System.out.println("\n\t  -------- Task 9 --------");

        String[] objects = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        System.out.println(Arrays.toString(objects));
        int startsUppercase = 0, startLowercase = 0, bOrP = 0, bookOrPen = 0;


            for (String stores : objects) {
                if(CharacterHelper.isUppercase(stores.charAt(0))) startsUppercase++;
                else if(CharacterHelper.isLowercase(stores.charAt(0))) startLowercase++;
                 if(stores.toLowerCase().charAt(0) == 'b' || stores.toLowerCase().charAt(0) == 'p') bOrP++;
                 if(stores.toLowerCase().contains("book") ||
                        stores.toLowerCase().contains("pen")) bookOrPen++;

        }
        System.out.println("Elements starts with uppercase = " + startsUppercase);
        System.out.println("Elements starts with lowercase = " + startLowercase);
        System.out.println("Elements starting with B or P = " + bOrP);
        System.out.println("Elements having ”book” or “pen” = " + bookOrPen);




        System.out.println("\n\t  -------- Task 10 --------");

        int[] n = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        System.out.println(Arrays.toString(n));
        int moreThan10 = 0, lessThan10 = 0;
        for (int element : n) {
            if (element > 10) moreThan10++;
            else if (element < 10) lessThan10++;
        }
        System.out.println("Elements that are more than 10 = " + moreThan10);
        System.out.println("Elements that are less than 10 = " + lessThan10);
        System.out.println("Elements that are 10 = " + (n.length - moreThan10-lessThan10));

        System.out.println("\n\t  -------- Task 11 --------");


        /*

         */
//
        int[] n1 = { 5, 8, 13, 1, 2};
        int[] n2 = { 9, 3, 67, 1, 0};
        System.out.println("1st array is = " + Arrays.toString(n1));
        System.out.println("2nd array is = " + Arrays.toString(n2));
        int[] n3 = new int[5];

        for (int i = 0; i <= 5; i++){
        n3[i] = Math.max(n1[i], n2[i]);
        }
        System.out.println("3rd array is = " + Arrays.toString(n3));

        /*

            i ->        0, 1, 2,  3, 4, 5, 6
            First ->    5, 8, 13, 1, 2, 2 ,9
            Second ->   9, 3, 67, 1, 0
            Third ->    9, 8, 67, 1, 2, 2, 9
             */
//        if (i < Math.min(first.length, second.length)){
//            third[i] = Math.max(first[i], second[i]);
//        }else if(first.length > second.length){
//            third[i] = first[i]; // getting the rest
//        }else{
//            third[i] = second[i];// getting the rest
//         */

    }

}
