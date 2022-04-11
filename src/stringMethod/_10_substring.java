package stringMethod;

public class _10_substring {

    public static void main(String[] args) {

        /*
        Method task: They are used to extract a substring from larger String
        - They are non-static, and we called them with objects
        - They are return type and return and other string
        - There ae 2 overloading substring method
        1. substring (int beginIndex)
        - This method takes begin index as an argument, and it extracts a substring from given index to the end
        2. substring(int beginIndex, int endIndex)
               -This method will take 2 args to define which index to start and which index to stop to extract
               a substring
               NOTE: beginIndex is inclusive but endIndex is exclusive
               NOTE: if your beginIndex is equal to endIndex, then it will return empty string
               NOTE: if your beginIndex is less than endIndex, then it will throw StringIndexOutOfBoundsException

         */

        String result = "About 3,520,000,000 results (0.82 seconds)";

        String num = result.substring(6, 19); //3,520,000,000

        System.out.println(num);

        // Use the substring method to get "(0.82 seconds)"
        String num1 = "About 3,520,000,000 results (0.82 seconds)";

        System.out.println(num1.substring(28));
//                    same as up
        System.out.println(result.substring(result.indexOf('(')));
        System.out.println(result.substring(result.length()-14)); // numara de la urma
        System.out.println(result.substring(result.indexOf("results")+8)); // numara de la "result" + 8

    }
}
