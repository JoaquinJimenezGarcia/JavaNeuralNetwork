package math;

import java.util.Random;

public class RandomNumberGenerator {
	public static long seed = 0;
	public static Random r;
	
	public static double GenerateNext(){
        if (r == null) {
        	r = new Random(seed);
        }

        return r.nextDouble();
    }
	
	public static void setSeed(long seed){
        seed = seed;
        r.setSeed(seed);
    }
}
