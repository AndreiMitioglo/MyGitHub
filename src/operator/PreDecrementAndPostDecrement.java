package operator;

public class PreDecrementAndPostDecrement {

    public static void main(String[] args) {

        int a = 5;

        System.out.println(--a); // 4 (5-1) ,  a -= 1  -> a = a-1 preincremental
        System.out.println(a);  // 4 printeaza valoarea noua a lui "a"
        System.out.println(a--);  // 4 asteapta pana la urmatorea chemare post incremental
        System.out.println(a); // 3 (4-1)



        int i = 5;

        int age = 10 * i++; //10 * 5
        System.out.println(age); // 50

        age = 10 * i; // 10 * 6
        System.out.println(age); // 60

        age = 10 * ++i;
        System.out.println(age); // 70

        age = 10 * i++;
        System.out.println(age); // 70

        age = 10 * i;
        System.out.println(age); // 80

        age = 10 * ++i;
        System.out.println(age); // 90

        age = 10 * i++; // i
        System.out.println(age); // 90

        age = 10 * ++i;
        System.out.println(age); // 110



        System.out.println(a--); // 5 // a -= 1 -> a = a - 1
        System.out.println(a);   // 4

        System.out.println(--a); // 3
        System.out.println(a--); // 3
        System.out.println(a);   // 2


    }
}

