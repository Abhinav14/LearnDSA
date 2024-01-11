package array;

import java.util.Arrays;

public class ARevBF1 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int n = arr.length;
		int[] revArr = new int[n];
		
		for(int i = 0; i < n; i++) {
			revArr[n-1-i] = arr[i];
		}
		Arrays.stream(revArr).forEach(x->System.out.print(" "+x));
	}

}
