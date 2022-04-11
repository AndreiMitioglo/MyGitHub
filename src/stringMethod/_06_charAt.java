package stringMethod;

public class _06_charAt {
    public static void main(String[] args) {

        /*
        It helps to get a character at a specific index
        NOTE: Index starts with zero
        It is non-static as we call it with object name
        It is a return type and returns char primitive
        It takes an argument which is Int (index)
        NOTE: It will throw StringIndexOutOfBoundsException
         */
        String name = "Alex";

        System.out.println(name.charAt(0)); // A
        System.out.println(name.charAt(1));// l
        System.out.println(name.charAt(2));// e
        System.out.println(name.charAt(3));// x

        /*
        Check if the name starts with A, and print "This name starts with  "A"
         */
        String name1 = "Alex";
       char firstChar = name1.charAt(0); //takes first letter of Alex and compare it whit char 'A' or 'a';

 if (firstChar == 'A' || firstChar == 'a') {
     System.out.println("This name starts with A");
 }else {
     System.out.println("This name NOT starts whit 'A");
 }
        name.charAt(1);




 }

}
