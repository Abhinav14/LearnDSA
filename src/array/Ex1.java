package array;

import java.util.Arrays;

public class Ex1 {
	
	public static void main(String[] args) {
		
		//int[] arr = new int[5];
		int temp = 0, n = 0;
		int[] arr = {1, 2, 3, 4,5};
		n = arr.length;
		System.out.println("Pre Reversal");
		Arrays.stream(arr).forEach(x->System.out.println(x));
		
		System.out.println("====n/2 is ===>"+arr.length/2);
		
		for(int i = 0; i < n/2; i++) {
			temp = arr[n-1-i];
			arr[n-1-i] = arr[i];
			arr[i] = temp;
		}
		System.out.println("Post reversal");
		Arrays.stream(arr).forEach(y->System.out.println(y));
		
	}

}
