package oop_principles.recapOOP;

public class CurvedSword {
 static {  // static code block is running first
     System.out.println("Start the furnace");
 }
    {
        // non-static code block
        System.out.println("Heating up the material");
        System.out.println("Sword is created");
    }

    public CurvedSword() {


    }

    public String  color;
    public String material;
    public static String handle = "T shape handle";
    public String sharpeness;
    public static String size = "Medium";
    public double price;
    public double weight;


              // creating a constructor
    public CurvedSword(String color, String material, String handle, double weight, double price){

        this.color = color;
        this.material = material;
        this.weight = weight;
    }
               // creating methods
    public void cut (){
        System.out.println("Sword cuts");
    }

    public void cut(boolean isSharp){
        if (isSharp){
            System.out.println("The cut is sharp");
        } else System.out.println("There is no cut");
    }
    public static CurvedSword creatingSword(String material){
        CurvedSword sword = new CurvedSword();
        sword.material = material;
        return sword;
    }



    @Override
    public String toString() {
        return "CurvedSword{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", sharpeness='" + sharpeness + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
