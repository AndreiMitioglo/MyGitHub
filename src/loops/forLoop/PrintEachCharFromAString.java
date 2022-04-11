package loops.forLoop;

public class PrintEachCharFromAString {
    public static void main(String[] args) {
/*
T
e
c
.
.
o
o      firstChar = charAt(0);
       lastChar = charAt(str.length()-1;
l
 */

        String str = "TechGlobal School";
        for (int i = 0; i <= str.length()-1; i++) {

                System.out.println(str.charAt(i));
        }
    }
}