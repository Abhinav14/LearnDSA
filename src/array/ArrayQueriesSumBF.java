package array;

public class ArrayQueriesSumBF {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6};
		int[][] queries = {{0,3}, {1,2}, {1,4}};
		System.out.println("Number of queries : "+queries.length);
		for(int i = 0; i < queries.length; i++) {
			int[] tempArr = queries[i];
			int L = tempArr[0];
			int R = tempArr[1];
			int sum = 0;
			for(int j = L; j <=R; j++) {
				sum = sum+arr[j];
			}
			System.out.println("Sum of query-"+i+" is : "+sum);
		}
		
	}

}
