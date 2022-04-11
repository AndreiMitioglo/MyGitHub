package stringMethod;

public class _11_startsWith_endsWith {  // return boolean true or false
    public static void main(String[] args) {

/*
Method Task: They are used to finding out if the string starts with or ends with another letter or string
        -They are non-static as we call them with objects    str.startsWhith();
        -They return boolean
        -They take String as an argument
 */


        String str ="Today is Sunday";

        System.out.println(str.startsWith("Today")); // true
        System.out.println(str.startsWith("today")); // false
        System.out.println(str.endsWith("day")); // true

        System.out.println(str.toUpperCase().endsWith("SUNDAY")); // true
        System.out.println(str.toUpperCase().startsWith("is" , 6)); // true  // al doilea startWith(" " , 6)
        //                                                                                         cu 2 argumente
//                                                                        6 e de unde sa inceapa a compara.
    }
}
