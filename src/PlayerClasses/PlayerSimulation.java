package PlayerClasses;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import AdminClasses.ArrayProblemSetup;

public class PlayerSimulation extends ArrayProblemSetup {
	
	public PlayerSimulation(int xredCost, int yinvCost, int[] a) {
		super(xredCost, yinvCost);
	}
	
	public static int xcounter;
	public static int ycounter;
	
	public static int xredCost = 2;
	public static int yinvCost = 5;
	public static int [] a = {5, 3, 8, 3, 2};

	public static void Xreduce(int x) {
		int ele = (int) Array.get(a, x); // element at index x to be reduced
		for (int i = 0; i<a.length; i++) {
			if (a[x] == ele) {
				a[x] = 0;
			}
		}
		System.out.println("Reduction performed on a["+ x + "], value =" + a[x]);
		System.out.println(Arrays.toString(a));

		//int redvar = (int) Array.get(a, x); // should be 0
	}////reduce

	public static void Yinvert(int y) {
		int ele = (int) Array.get(a, y); // element at index x to be inverted
		for (int i = 0; i<a.length; i++) {
			if (a[y] == ele) {
				a[y] = 0-ele;
			}
		}
		System.out.println("Inversion performed on a["+ y + "], value =" + a[y]);
		System.out.println(Arrays.toString(a));
		//int invert = (int) Array.get(a, y); // should be 0
	}/////invert
	
	public static int[] update(int[] w) {
		return w;
	}
	
	public static int totalCost(int x, int y) {
		int cost = (xredCost*xcounter) + (yinvCost*ycounter); //ansHere function
		return cost;
	}


	public static void main(String[] args) {
		int [] a = new int[] {5, 3, 8, 3, 2};
		int n = a.length;

		long[] prefixSum = new long[n];
		prefixSum[0] = a[0];
		for(int i=1; i<n; i++) { // [2, 5, 8, 13, 21]
			prefixSum[i] = prefixSum[i-1] + a[i]; //sum needing to disappear
		}



		System.out.println("Welcome to the Environment Game!!");
		System.out.println("This is your Carbon Emission array: " + Arrays.toString(a));
		System.out.println("For executing Reduction, type 1 followed by enter when prompted.");
		System.out.println("For executing Inversion, type 2 followed by enter when prompted.");
		System.out.println();
		//System.out.println("Current view of Emission array: " + Arrays.toString(a));


		while(prefixSum[n-1] > 0) {
			System.out.println("Enter the function you would like to execute: ");

			Scanner sc = new Scanner(System.in);

			while (sc.hasNext()) { //end-of-file handled 
				int input=sc.nextInt();

				if (input == 1) {
					System.out.println("Which index in the array will be reduced? ");
					int indexX = sc.nextInt();
					Xreduce(indexX);
					
					//need to add update method

					System.out.println("After reduction at index: " + indexX);
					System.out.println("Cost incured is: " + xredCost + " energy points");
					xcounter++;
				} 

				if (input == 2) {
					System.out.println("Which index in the array will be inverted? ");
					int indexY = sc.nextInt();
					Yinvert(indexY);
					
					//need to add update method to see array

					System.out.println("After inversion at index: " + indexY);
					System.out.println("Cost incured is: " + yinvCost + " energy points");
					ycounter++;
				} 
			}
			sc.close();
		}

	}

}
