package AdminClasses;
import java.util.Random;

public class ArrayProblemCreation {
	
	private static int XredCost;
	private static int YinvCost;
	
	public ArrayProblemCreation(int xredCost, int yinvCost) {
		super();
		XredCost = xredCost;
		YinvCost = yinvCost;
	}
	
	public static int getXredCost() {
		return XredCost;
	}

	public static void setXredCost(int xredCost) {
		XredCost = xredCost;
	}

	public static int getYinvCost() {
		return YinvCost;
	}

	public static void setYinvCost(int yinvCost) {
		YinvCost = yinvCost;
	}

	public static int[] randomArray(int size) {
	    Random random = new Random();
	    int[] rand = new int[size];
	    for (int i = 0; i < rand.length; i++) {
	        rand[i] = random.nextInt(10);
	    }
	    return rand;
	}/////random array generation
	
	public static int[] exampleArray() {
		int [] a = new int[] {5, 3, 8, 3, 2};
		return a;
	}/////hardcoded array
	
	

}
