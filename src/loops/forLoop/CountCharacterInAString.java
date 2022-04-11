package loops.forLoop;

public class CountCharacterInAString {
    public static void main(String[] args) {


        String str = "TechGlobal School";
        int totalNumbers = 0;
        for (int i = 0; i <= str.length()-1; i++) {
            if (str.charAt(i) == 'o')
                totalNumbers++; // increasing by 1 (totalNumber += 1 );
        }
            System.out.println(totalNumbers); // 3
        }
    }

