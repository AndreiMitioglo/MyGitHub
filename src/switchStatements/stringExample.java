package switchStatements;

public class stringExample {

    public static void main(String[] args) {
        String greeting = "Good Morning!";  // the input has to match exactly with the case

        switch (greeting) {
            case "Good Morning!":
                System.out.println("Then, it is morning");
                break;
            case "Good afternoon !":
                System.out.println("Then is a afternoon");
                break;
            case "Good evening !":
                System.out.println("Then is evening");
                break;
            default:
                System.out.println("Well i need to study more");


        }
    }
}