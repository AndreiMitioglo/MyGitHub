package methods;

public class RandomNumberGenerator {
    public static int getRandomGenerator(int start, int end){
        return (int) (Math.random() * (end - start + 1)) + start;
    }
}


