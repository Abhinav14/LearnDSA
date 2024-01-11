package array;

import java.util.Arrays;

public class Array2DQueriesNumSumOpt {
	public static void main(String[] args) {
		int[] arr = {0,0,0,0,0,0};
		int[][] queries = {{0,3,5},{1,4,2},{5,5,1},{4,5,3}};
		int l = 0, r = 0, num = 0;
		for(int i =0; i < queries.length; i++) {
			l = queries[i][0];
			r = queries[i][1];
			num = queries[i][2];
			arr[l] = arr[l] + num;
			if(r+1 < arr.length) {
				arr[r+1] = arr[r+1] - num;
			}
		}
		for(int i = 1; i < arr.length; i++) {
			arr[i] = arr[i] + arr[i-1];
		}
		
		Arrays.stream(arr).forEach(x->System.out.println("Sum is : "+x));
	}

}
