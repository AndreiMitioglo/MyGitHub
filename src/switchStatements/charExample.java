package switchStatements;

public class charExample {
    public static void main(String[] args) {

        char character = ' '; // punem valoarea aici A, 5, $

        switch (character) { // poate sa fie numai o variabila
            case 'A':
                System.out.println("This is upper and first letter of alphabet");
                break;
            case '5':
                System.out.println(" It is a digit");
                break;
            case '$':
                System.out.println("Its a dollar sign");
                break;
                default:
                System.out.println("It is not A, 5 or $");

        }
                System.out.println(" End of the program");




    }
}
