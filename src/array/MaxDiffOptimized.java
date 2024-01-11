package array;

public class MaxDiffOptimized {

	public static void main(String[] args) {
		
		int[] arr = {2, 8, 9, 6, 3, 1};
		int ans = 0, n = 0;
		
		n = arr.length;
		int minBefore = arr[0];
		
		for(int i = 1; i < n; i++) {
			int a = minBefore;
			int b = arr[i];
			
			if(b > a) {
				if(b-a > ans) {
					ans = b-a;
				}
			}
			if(arr[i] < minBefore) {
				minBefore = arr[i];
			}
		}
		
		System.out.println("Max difference is : "+ans);
	}

}
