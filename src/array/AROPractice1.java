package array;

import java.util.Arrays;

public class AROPractice1 {
	
	public static void main(String[] args) {
	
	int[] arr = new int[] {1, 2, 3, 4, 5};
	int temp = 0;
	System.out.println("Before reversal");
	Arrays.stream(arr).forEach(x->System.out.println(x));
	
	for(int i = 0; i < arr.length/2; i++) {
		temp = arr[i];
		arr[i] = arr[arr.length-1-i];
		arr[arr.length-1-i] = temp;
	}
		
		System.out.println("After reversal");
		Arrays.stream(arr).forEach(x->System.out.println(x));
	
	}

}
