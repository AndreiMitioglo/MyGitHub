package casting;

public class ConvertingStringToPrimitives {

    public static void main(String[] args) {

        String num1 = "23";
        String num2 = "12"; // 23 + 12

        int num1Int = Integer.parseInt(num1); // 1st way to convert string to primitives
        int num2Int = Integer.parseInt(num2);// 1st way
        // taking a string and returning primitives, number

        Integer num1Integer = Integer.valueOf(num1); // 2nd way
        Integer num2Integer = Integer.valueOf(num2);  // 2nd way to convert string to primitives
        // taking a string and returning string

    int num3 = 34;


        System.out.println(num1 + num2);   // 2312
        System.out.println(num1Int + num2Int);  // 35



    }
}
