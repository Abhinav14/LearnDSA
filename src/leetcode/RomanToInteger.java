package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		int result = 0;
		Map<Character, Integer> romanMap = new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter roman numbers in uppercase");
		String userInput = sc.next();
		char[] charArr = userInput.toCharArray();
		for(int i = 0; i < charArr.length; i++) {
			result = result + romanMap.get(charArr[i]);
		}
		System.out.println("Result is : "+result);
	}

}
