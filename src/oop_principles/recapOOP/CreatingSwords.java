package oop_principles.recapOOP;

public class CreatingSwords {
    public static void main(String[] args) {
        CurvedSword goldenSword = new CurvedSword();
        goldenSword.color = "Yellow";
        goldenSword.material = "Gold";
        goldenSword.price = 500.0;
        goldenSword.sharpeness = "Blunt";

        CurvedSword ironSword = new CurvedSword("Silver", "iron", "Sharp", 30.0, 50.0);
        System.out.println(ironSword);
        System.out.println(goldenSword.price);

        goldenSword.cut();
        goldenSword.cut(false); //There is no cut

        ironSword.cut(true);// The cut is sharp
    }
}
