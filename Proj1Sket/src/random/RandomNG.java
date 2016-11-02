package random;

import java.util.Random;

public class RandomNG {

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            System.out.print(RandomGen()[i] + "   ");
        }

    }
    
    public static int[] RandomGen() {
        Random randomg = new Random(500);
        
        int[] rng = new int[20];
        
        for (int i = 0; i < rng.length; i++) {
            rng[i] = randomg.nextInt(4);
        }
        return rng;
    }

}
