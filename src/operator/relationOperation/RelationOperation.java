package operator.relationOperation;

public class RelationOperation {

    public static void main(String[] args) {

        int a = 4;
        int b = 10;

        boolean isAEqualToB = a == b;  // a is equal to b
        boolean isANotEqualToB = a != b;  // a is not equal to b


        System.out.println("a = b : " + isAEqualToB);
        System.out.println("a ! b : " + isANotEqualToB) ;



        boolean isAGreaterThanB = a > b;
        boolean isASmallerThanB = a < b;
        boolean isAGreaterOrEqualThanB = a >= b;
        boolean isASmallerOrEqualThanB = a <= b;

        System.out.println("a>b : " + isAGreaterThanB);  //    4 > 10       false
        System.out.println("a<=b : " + isASmallerOrEqualThanB); // 4 <= 10  true




    }
}
