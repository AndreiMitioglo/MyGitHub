package javaMemoryManagement;

public class Dog {
    public String breed;
    public int age;

   // This method will execute garbage collection for reference loosed their values
    @Override
    protected void finalize(){ // this is to show the garbage collected (dog1)
        System.out.println("A dog object is garbage collected"); // A dog object is garbage collected
        System.out.println("The object is -> " + this.getClass().hashCode()); // The object is -> 1762225762

    }
}
