package javaMemoryManagement;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("John"); // John
        sb.append("athan");
        System.out.println(sb); // Johnathan (John + athan)

        sb.append(123);
        System.out.println(sb); // Johnathan123

        sb.insert(2, "$$");
        System.out.println(sb); // Jo$$hnathan123
        sb.reverse();

        System.out.println(sb); // 321nahtanh$$oJ


    }
}
