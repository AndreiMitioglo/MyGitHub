package mathClass;

public class FindRandom {


    public static void main(String[] args) {

        Math.random();  // any random number between 0 and 1 (exclude num 1.0)
        // Math.random accepta numai double, zecimale

        double random = Math.random();  // 0.0---------0.99999

        int random1 = (int) (Math.random() * 21);  // 0 to 20 included.
        ///(int) (Math.random() take the double as a single, exclude zecimalele

        System.out.println(random);
       int random10And20Included = (int) (Math.random() *11) + 10; // 10 -20

        System.out.println(random10And20Included);
        // create a random number between 103 -346
        // get the difference -> 346-103 = 243 add + 1
        // multiply it by 243 + 1 = 244
        // add the starting point to the equation
                           // random * (end point - start point +1) + start point

        // (int) Math.random() * (end point - start point +1) + start point;
        // 15 to 30 -->  (int)(Math.random() * 16 + 15)


        //create a random number between 103 - 346  included take that as an int
        // get the difference --> 346 - 103 = 243 add + 1
        // multiply it by 243 + 1 = 244
        // add the starting point to the equation
        // random * (end point - start point + 1) + start point  --> included

        int random103And346Included = 103 + (int) (Math.random() * 244);

        System.out.println(random103And346Included);

        // create a random number between -50 / 50  included take that as an int
        // random * (end point - start point + 1) + start point  --> included
        // (random * (101)) - 50)

        int random_50And50Included = (int) (Math.random() * 101) - 50;
        System.out.println(random_50And50Included);


    }
}
