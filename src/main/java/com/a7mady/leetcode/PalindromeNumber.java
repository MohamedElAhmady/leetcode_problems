package com.a7mady.leetcode;

public class PalindromeNumber {

	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		
		int divFactor = 1;
		while (x / divFactor >= 10) {
			divFactor *= 10;
		}

		while (x != 0) {

			int head = x / divFactor;
			int tail = x % 10;

			if (head != tail)
				return false;

			x = (x % divFactor) / 10;
			divFactor /= 100;
		}
		
		return true;
	}

	public static void main(String[] args) {
		new PalindromeNumber().isPalindrome(121);

	}

}
