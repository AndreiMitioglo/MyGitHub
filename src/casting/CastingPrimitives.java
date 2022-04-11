package casting;

public class CastingPrimitives {

    public static void main(String[] args) {

        /*
        double > float > long > int >= char >= short > byte
         */

        int myInt = 32; // mai mic in mai mare se face automat
        //casting( exchange, a schimba cu locul....)
        long myLong = myInt;  // implicit (hiden, latent, absolute)

        myInt = (int) myLong;  // explicit  ( apparent, obvious, evident....)

        int myseconInt = 'B';  // implicit
        char myChar = (char) 56; // you don't have to cast
        char mySecondChar = 56;

        int myThirdINt = (int) 45.4;  // say the data type you want tp convert to other one

        short myShort = (short) myChar;
        char myThirdChar = (char) myShort;


        /*

        short =
         */
       byte num1 = 45; // casting tarnsforma byte in int
       int num2 = num1; // implicit  se face automat

        double num3 = 13.6;
        float num4 = (float) num3; // explicit casting, numar mai mic in mai mare trebu paranteze

        int num5= 45;
        short num6 = 34;

        char c = (char) num5; // we have to cast for both
        c = (char) num6;
    }
}
