package learningObjects;


public class LearningStrings {


    public static void main(String[] args){
        // Data type variableName = value;

        // declare
        // assign

        String greetings;  // declaration
           greetings = "Hello"; // assignment


        String myGreetings = "world";


        System.out.println(greetings + myGreetings);

        System.out.println("Hello" + "Hello");

        System.out.println("Hello" + " " + "Hello");




        String myName = "Andrew";
        String myLastName = "Mitioglo";

        // Andrei Mitioglo  the end result
        // create a String variable double quotation
        // create a String variable with '+'
        // create a String variable with concat method

        String fullName1 = "Andrei Mitioglo";
        String fullName2 = myName + " " + myLastName;
        String fullName3 = myName.concat("".concat(myLastName));

        "".concat(myLastName);


        System.out.println("Thiss is fullName1" + "-" + "Mitioglo Andrei");
        System.out.println("This is fullName2" + myName + myLastName);
        System.out.println( fullName1 + fullName2);
    }
}
