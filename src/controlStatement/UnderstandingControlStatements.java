package controlStatement;

public class UnderstandingControlStatements {

    public static void main(String[] args) {

        for (int i = 1; i <= 25; i++) {
            if (i % 10 != 0) System.out.println(i);
        }
        for (int i = 1; i <= 25; i++) {
            if (i % 10 != 0) continue;  // skipping 10
            else System.out.println(i);
        }
        for (int i = 1; i <= 25; i++) {
            if (i % 10 != 0)
                continue;  // skipping 10
            else
                System.out.println(i);
            if (i == 15) {
                break;
            }
        }
    }
}