package array;

import java.util.Arrays;

public class ArrayReversalOprtimized {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int n = arr.length, temp = 0;
		System.out.println("====Before array reversal====");
		Arrays.stream(arr).forEach(x->System.out.println(x));
		for(int i = 0; i < n/2; i++) {
			temp = arr[i];
			arr[i] = arr[n-1-i];
			arr[n-1-i] = temp;
		}
		System.out.println("====After array reversal====");
		Arrays.stream(arr).forEach(y->System.out.println(y));
		
	}

}
