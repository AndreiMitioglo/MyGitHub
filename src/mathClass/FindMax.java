package mathClass;

public class FindMax {

    public static void main(String[] args) {








        int x = 8;
        int y = 20;
        int z = 12_345;
        int a = 34;
        int b = 123;

        int maxValueOfXY = Math.max(x, y); // char can be put as well
        int maxValueOfXYZ = Math.max(maxValueOfXY, z);
        int maxValueOfAB = Math.max(a, b);

        int maxOfEvery = Math.max(Math.max(Math.max(8, 20), 12_345), Math.max(34, 123));
        // int maxOfEveryNValue = Math.max(Math.max(Math.max(Math.max(n1, n2), n3), n4), n5);
        System.out.println("maxValueOfXY " + maxValueOfXY);
        System.out.println("maxValueOfXYZ " + maxValueOfXYZ);
        System.out.println("maxValueOfAB " + maxValueOfAB);
        System.out.println("maxOfEvery " + maxOfEvery);


        Math.min(6, -23);
       int min = Math.min(6, -23);  // is storing the value
    }
}
