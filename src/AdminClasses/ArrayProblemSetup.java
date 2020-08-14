package AdminClasses;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblemSetup extends ArrayProblemCreation {

	public ArrayProblemSetup(int xredCost, int yinvCost) {
		super(xredCost, yinvCost);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Environment Game Admin Set up!!");
		System.out.println("Type 1 for random array generation, type 2 to play using the example array.");
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) { //end-of-file handled 
			int option=sc.nextInt();
			// re-write as a switch statement
			if (option == 1) {
				System.out.println("type size of array: ");
				int n = sc.nextInt();
				System.out.println("Generating random array...");
				int arrayToplay[] = randomArray(n);
				System.out.println(Arrays.toString(arrayToplay));
			}
			
			if (option == 2) {
				int [] a = new int[] {5, 3, 8, 3, 2};
				System.out.println("Example Array: " + Arrays.toString(a));
			}
			
			System.out.println();
			System.out.println("type 3 to play using example function costs, type 4 to set new costs");
			int option2 = sc.nextInt();
			
			if (option2 == 3) {
				int xcost = 2;
				System.out.println("cost of Reduction is set at "+ xcost + " energy points");
				setXredCost(xcost);
				int ycost = 5;
				System.out.println("cost of Reduction is set at "+ ycost + " energy points");
				setXredCost(ycost);
			}
			
			if(option2 == 4) {
				System.out.println("Set energy points for Reduction: ");
				int costRed = sc.nextInt();
				setXredCost(costRed);
				
				System.out.println("Set energy points for Inversion: ");
				int costInv = sc.nextInt();
				setYinvCost(costInv);
				
				System.out.println("Reduction is now set to cost "+ getXredCost());
				System.out.println("Inversion is now set to cost "+ getYinvCost());
			}
			
			System.out.println("Set up is complete! you may now begin playing the game!");
		}
		sc.close();
	}
}
