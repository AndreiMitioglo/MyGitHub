package mathClass;

public class FindMin {

    public static void main(String[] args) {


        int x = 8;
        int y = 20;
        int z = 12_345;
        int a = 34;
        int b = 123;

        int minValueOfXY = Math.min(x, y); // char can be put as well
        int minValueOfXYZ = Math.min(minValueOfXY, z);
        int minValueOfAB = Math.min(a, b);

        int maxOfEvery = Math.min(Math.min(Math.max(8, 20), 12_345), Math.min(34, 123));

        System.out.println("minValueOfXY " + minValueOfXY);
        System.out.println("minValueOfXYZ " + minValueOfXYZ);
        System.out.println("minValueOfAB " + minValueOfAB);
        System.out.println("minOfEvery " + maxOfEvery);




    }
}
