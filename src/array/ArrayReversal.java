package array;

import java.util.Arrays;

public class ArrayReversal {
	
	public static int[] reversedArray(int arr[]) {
		int n = arr.length;
		int[] tempArr = new int[n];
		for(int i = 0; i < n; i++) {
			tempArr[n-1-i] = arr[i];
		}
		
		return tempArr;
		
	}

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println("=====Before Reversal=====");
		Arrays.stream(arr).forEach(x->System.out.println(x));
		System.out.println("=====After Reversal=====");
		Arrays.stream(reversedArray(arr)).forEach(y->System.out.println(y));
	}

}
