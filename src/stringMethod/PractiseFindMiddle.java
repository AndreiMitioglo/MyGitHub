package stringMethod;

import utilities.StringHelper;

public class PractiseFindMiddle {

    public static void main(String[] args) {
        String name1 = "Taylor";
        String name2 = "Alona";
        System.out.println(StringHelper.getMiddle(name1)); // yl
        System.out.println(StringHelper.getMiddle(name2)); // o
        System.out.println(StringHelper.getMiddle("Alona")); // o
        System.out.println(StringHelper.getMiddle("Guluzar")); // u se poate si fara (String name 1 = )

    }
}
