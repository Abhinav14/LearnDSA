package array;

import java.util.Arrays;

public class ArrayQueriesSumOptimizedAgain {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int[][] queries = {{0,3}, {1,2}, {1,4}};
		int[] preSum = new int[arr.length];
		
		preSum[0] = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			preSum[i] = arr[i] + preSum[i-1];
		}
		Arrays.stream(preSum).forEach(x->System.out.print(x+" "));
		
		for(int j = 0; j < queries.length; j++) {
			int l = queries[j][0];
			int r = queries[j][1];
			int sum = 0;
			if(l == 0) {
				sum = preSum[r];
			}else {
				sum = preSum[r] - preSum[l-1];
			}
			System.out.println("Sum is : "+sum);
		}
	}

}
