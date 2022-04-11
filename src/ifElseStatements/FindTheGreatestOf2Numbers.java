package ifElseStatements;

public class FindTheGreatestOf2Numbers {

    public static void main(String[] args) {

        //  find random 0 to 10
        // example : between 23 to 37
        // big - small + 1

        int num1 = (int)(Math.random()* 11 + 0), num2 = (int)(Math.random()* 11);

        System.out.println(num1);
        System.out.println(num2);

         // Math.max

        if (num1 >= num2){
            System.out.println( "The greatest is = " + num1);

        }else {
            System.out.println( "The greatest is = " + num2);
        }
    }
}
