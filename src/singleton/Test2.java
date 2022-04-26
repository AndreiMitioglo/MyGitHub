package singleton;

public class Test2 {
    public static void main(String[] args) {

        Driver d1 = Driver.getDriver();
        Driver d2 = Driver.getDriver();
        System.out.println(d1);
        System.out.println(d2);


       for (int i=0; i< 100; i++){
           System.out.println(Driver.getDriver());
       }
    }
}
