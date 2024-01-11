package array;

public class MDBF1 {

	public static void main(String[] args) {
		int[] arr = {2, 3, 10, 6, 4, 8, 1};
		int result = 0;
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 1; j < arr.length; j++) {
				if(arr[j] > arr[i]) {
					if(arr[j]-arr[i] > result) {
						result = arr[j]-arr[i];
					}
				}
			}
		}
		System.out.println("Result is : "+result);
	}

}
