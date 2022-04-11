package operator;

public class operatorIncrementDecrement {

    public static void main(String[] args) {
        int a =10;
        a = a + 1;
        a += 1;
        a++; // a = 10 + 1 postincrement -- asteapta pina la urmaturul a
        ++a; // a = 11 + 1 preincrement

        System.out.println(a);
        System.out.println(++a);
    }
}
