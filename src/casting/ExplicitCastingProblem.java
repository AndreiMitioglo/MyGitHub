package casting;

public class ExplicitCastingProblem {
    public static void main(String[] args) {

        int num = 150;
        byte b = (byte) num;
        System.out.println(b); // -106
     // byte (-128  to 127)  de atita -106 nu 105 ca se socoate si 0 (105+0);




    }
}
