package casting;

public class AutoboxingAndUnboxing {//   Always implicit (automatic).

    public static void main(String[] args) {

        // Autoboxing (primitive to object[wrapper class])

        float num =  45.6F;  // Float is Wrapped Class
        Float numFloat = num;

        // Unboxing (object [wrapper class] to primitive]

        char character = 'D';
        char characterPrimitive = character;


    }
}
