package regex;

public class ReplaceAllMethod {
    public static void main(String[] args) {
        String str = "Hello World";
        str = str.replaceAll("[aeiouAEIOU]", "\\$");  // removes [aeiouAEIOU] and replace with $
        System.out.println("After " + str); //H$ll$ W$rld

        String str2 = "hello123world";
        str2 = str2.replaceAll("[0-9]", "");
        System.out.println(str2); // helloworld
    /*
    Create a String as below:
    String str = “ abc 123 $#^ ”;
    Remove all special characters
    Expected output: abc123

 */
        String str3 =  "abc 123 $#^ ";
//        str3 = str3.replaceAll("\\$", ""); remove one by one
//        str3 = str3.replaceAll("#", "");
//        str3 = str3.replaceAll("\\^", "");
//        str3 = str3.replaceAll("[$#^ ]", ""); second way of removing
        str3 = str3.replaceAll("[^a-zA-Z0-9]", ""); // abc123


        System.out.println(str3);



    }
}
