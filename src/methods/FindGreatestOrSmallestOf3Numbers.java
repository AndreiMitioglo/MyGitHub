package methods;

import utilities.MathHelper;

public class FindGreatestOrSmallestOf3Numbers {

    public static void main(String[] args) {

      int max = MathHelper.maxOfThree(5, 1, 10);

        System.out.println("Max of three numbers = " + max);

     double max1 = MathHelper.maxOfThree(1.0, 5.3, 6.8);
        System.out.println("Max of 3 numbers = " + max1);


         byte b1 = (byte) (Math.random()*10);
         byte b2 = (byte) (Math.random()*10);
         byte b3 = (byte) (Math.random()*10);

        System.out.println("Random" + b1);
        System.out.println("Random" + b2);
        System.out.println("Random" + b3);
        System.out.println(MathHelper.minOfThree(b1, b2, b3)); // 1
    }
}
