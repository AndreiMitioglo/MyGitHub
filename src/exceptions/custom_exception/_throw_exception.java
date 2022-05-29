package exceptions.custom_exception;

public class _throw_exception {

    public static void main(String[] args) {


  // Validating the age
        int age = 16;

        if (age >= 18) {
            System.out.println("You are allowed");

        } else //throw new RuntimeException("Age not allowed");
                throw new IndexOutOfBoundsException("Not found"); // Displayed message

      }

    }
