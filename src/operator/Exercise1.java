package operator;

public class Exercise1 {
    public static void main(String[] args) {

        int i = 5;
        int age = 10 * i++;  // 10 * 5

        System.out.println(age); // 50

          age = 10 * i;  // 10 * 6

        System.out.println(age); // 60
         age = 10 * i;

        System.out.println(age);//60



    }
}
