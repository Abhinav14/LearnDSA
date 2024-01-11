package array;

public class MDO1 {

	public static void main(String[] args) {
		int[] arr = {4, 3, 10, 6, 2, 8, 1};
		
		int result = 0;
		int minBefore = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > minBefore) {
				if(arr[i]-minBefore > result) {
					result = arr[i]-minBefore;
				}
			}else {
				minBefore = arr[i];
			}
		}
		System.out.println("Result : "+result);
	}

}
