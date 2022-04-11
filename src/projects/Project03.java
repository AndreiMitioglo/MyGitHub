package projects;

public class Project03 {
    public static void main(String[] args) {

        System.out.println("\t  -------- Task 1 --------");

        String s1 = "24", s2 = "5";

        int num1 = Integer.parseInt(s1), num2 = Integer.parseInt(s2);
        double div1 = Double.parseDouble(s1), div2 = Double.parseDouble(s2);
        System.out.println("The sum of 24 and 5 = " + (num1 + num2) + "\nThe subtraction of 24 and 5 = " + (num1 - num2)
        + "\nThe division of 24 and 5 = " + (div1 / div2) + "\nThe multiplication of 24 and 5 = " + (num1 * num2) +
                "\nThe remainder of 24 and 5 = " + (num1 %= num2));


        System.out.println("\n\t  -------- Task 2 --------");

        int random = (int) (Math.random() * 35) + 1;
        System.out.println("Random number = " + random);
        if (random == 2) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (random % 2 == 1 || random % 2 == 2) {

            System.out.println("THE NUMBER IS  A PRIME NUMBER");
        } else {
            System.out.println("THE NUMBER IS   NOT A PRIME NUMBER");
        }


        System.out.println("\n\t  -------- Task 3 --------");

        int rand1 = (int) (Math.random() * 50) + 1, rand2 = (int) (Math.random() * 50) + 1,
                rand3 = (int) (Math.random() * 50) + 1;
        System.out.println("Random number 1 = " + rand1 + "\nRandom number 2 = " + rand2 +
                "\nRandom number 3 = " + rand3);
        System.out.println();

        int max = Math.max(Math.max(rand1, rand2), rand3);
        int min = Math.min(Math.min(rand1, rand2), rand3);


        System.out.println("Lowest number is = " + min);
        if (rand1 != max && rand1 != min) {
            System.out.println("Middle number is = " + rand1);
        } else if (rand2 != max && rand2 != min) {
            System.out.println("Middle number is = " + rand2);
        } else System.out.println("Middle number is = " + rand3);
        System.out.println("Greatest number is = " + max);


        System.out.println("\n\t  -------- Task 4 --------");

        char c = '5';

        if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
            if (c >= 65 && c <= 90) {
                System.out.println("The letter is upper case");
            } else {
                System.out.println("The letter is lower case");
            }
        } else {
            System.out.println("Invalid character detected");
        }


        System.out.println("\n\t  -------- Task 5 --------");


        char c1 = '#';

        if ((c1 >= 65 && c1 <= 90) || (c1 >= 97 && c1 <= 122)) {

            switch (c1){
                case 'a':
                case 101: // e
                case 105: // i
                case 111:// o
                case 117:
                case 65: // no break needed
                case 69:
                case 73:
                case 79:
                case 85:
                    System.out.println("The letter is vowel");
                    break;
                default:
                    System.out.println("The letter is consonant");
            }

//            if (c1 == 97 || c1 == 101 || c1 == 108 || c1 == 117 || c1 == 65
//                    || c1 == 69 || c1 == 73 || c1 == 79 || c1 == 85) {
//                System.out.println("The letter is vowel");
//            } else System.out.println("Letter is consonant");

        } else System.out.println("Invalid character detected");


        System.out.println("\n\t  -------- Task 6 --------");

        char c2 = '8';
        if (((c2 >= 65 && c2 <= 90) || (c2 >= 97 && c2 <= 122)) || (c2 >= 48 && c2 <= 57)) {
            System.out.println("Invalid character detected !!!");
        } else System.out.println("Special character is = " + c2);

        System.out.println("\n\t  -------- Task 7 --------");
        char t7 = '@';
        if (t7 >= 65 && t7 <= 90 || t7 >= 97 && t7 <= 122) {
            System.out.println("Character is a letter");
        } else if (t7 >= '0' && t7 <= '9') {               // can use '0' '9' instead of ASCII numbers
            System.out.println("Character is a digit");
        } else System.out.println("Character is a special character");

    }
}


