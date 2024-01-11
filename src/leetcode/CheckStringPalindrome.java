package leetcode;

import java.util.Scanner;

public class CheckStringPalindrome {
	
	public static void main(String[] args) {
		
		boolean result = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the word");
		String userInput = sc.next();
		char[] chArr = userInput.toCharArray();
		String revString = reverse(chArr);
		if(userInput.equalsIgnoreCase(revString)) {
			result = true;
			System.out.println(result);
		}else {
			System.out.println(result);
		}
	}
	
	public static String reverse(char[] arr) {
		int len = arr.length;
		char tmpChar;
		for(int i = 0; i < len/2; i++) {
			tmpChar = arr[i];
			arr[i] = arr[len-1-i];
			arr[len-1-i] = tmpChar;
		}
		return new String(arr);
	}

}
