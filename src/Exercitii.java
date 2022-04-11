public class Exercitii {
    public static void main(String[] args) {

/// ========== Fibonacci ===================

        int n1 = 0; // n1
        int n2 = 1; // n2
        int total = 0; // n3
        String message = "";

        for (int i = 0; i < 7; i++) {
            message += n1 + " - ";
            total = n1 + n2;
            n1 = n2;
           n2 = total;
        }
        System.out.println(message.substring(0, message.length()-3));
    }
}
