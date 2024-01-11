package array;

public class MaxDiffBruteForce {

	public static void main(String[] args) {
		
		int[] arr = {2, 3, 10, 6, 4, 8, 1};
		int n = arr.length;
		int ans = 0;
		
		for(int i = 0; i < n-1; i++) {
			int a = arr[i];
			for(int j = i+1; j < n; j++) {
				int b = arr[j];
				if(b > a) {
					if(b-a > ans) {
						ans = b-a;
					} 
				}
			}
		}
		System.out.println("The maximum difference is : "+ans);
	}

}
