package utilities;

public class TestingRandomGenerator {

    public static void main(String[] args) {

int num1 =2, num2= 6, num3 = 3, num4 =9;
        // whith a print out

  MyMethods.printMaxOf4Numbers(2, 6, 3, 9 );


        // Same thing with the return method
        System.out.println(MyMethods.findMaxOf4(2, num2,3,num4));

        // write a program finding a difference between max and num1
        // 1 st way
        Math.abs(Math.max(Math.max(Math.max(num1, num2), num3), num4) - num1);
        // 2nd way
        Math.abs(MyMethods.findMaxOf4(2, num2,3,num4)- num1);

    }
}
