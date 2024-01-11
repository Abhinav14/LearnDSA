package leetcode;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		boolean result = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter ");
		int userInput = sc.nextInt();
		if(userInput < 0 || userInput == 0) {
			System.out.println(result);
		}else {
			int tmp = reverseInt(userInput);
			if(userInput == tmp) {
				result = true;
				System.out.println(result);
			}else {
				System.out.println(result);
			}
		}

	}
	
	public static int reverseInt(int userInput) {
		int reversed = 0, remainder = 0;
		while(userInput!=0) {
			remainder = userInput%10;
			reversed = reversed*10+remainder;
			userInput = userInput/10;
		}
		return reversed;
	}

}
