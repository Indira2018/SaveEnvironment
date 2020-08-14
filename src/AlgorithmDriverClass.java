import java.util.Arrays;

import AdminClasses.ArrayProblemSetup;

public class AlgorithmDriverClass extends ArrayProblemSetup {

	public AlgorithmDriverClass(int xredCost, int yinvCost, int[] arrayToplay) {
		super(
				xredCost = getXredCost(), 
				yinvCost = getYinvCost());
	}
	
	//function from reduction emissions
	public static int solution(int [] a, int X, int Y) {
		int n = a.length;
		Arrays.sort(a); //  0(nlogn)
		int best = X*n; //baseline best
		
		//long total_sum = 0;
		
		long[] prefixSum = new long[n];
		
		prefixSum[0] = a[0];
		for(int i=1; i<n; i++) { // [2, 5, 8, 13, 21]
			prefixSum[i] = prefixSum[i-1] + a[i]; //sum needing to disappear
		}
		
		int countKeeping = -1;
		int countInverted = 0;
		long sumInverted = 0;
		
		// effort to avoid brute force and nested for-loops
		// this loop is ( on the average) 0(n) not 0(n^2)
		while (countInverted+countKeeping<=n) { 
			if (countInverted>0) {
				sumInverted+=a[n-countInverted];
			}
			while (countKeeping<n-1 && prefixSum[countKeeping+1] <= sumInverted) {
				countKeeping+=1;
			}
			
			int ansHere = Y*countInverted + X*Math.max(0, n-countInverted-(countKeeping+1));
			
			if (ansHere<best) {
				best = ansHere;
			}
			
			countInverted+=1;
		}
		
		return best;
	}

	public static void main(String[] args) {
		
		ArrayProblemSetup game = new ArrayProblemSetup(getXredCost(), getYinvCost());
		int xredc = game.getXredCost();
		System.out.println(xredc);
		
		System.out.println("Minimum cost to get to 0 or less emissions: ");
		
//		System.out.println(ArrayProblemSetup.printArray(getArrayToplay()));
//		System.out.println(ArrayProblemSetup.getXredCost());
//		System.out.println(ArrayProblemSetup.getYinvCost());
		//System.out.println(solution(ArrayProblemSetup.getArrayToplay(), ArrayProblemSetup.getXredCost(), ArrayProblemSetup.getYinvCost()));

	}

}
