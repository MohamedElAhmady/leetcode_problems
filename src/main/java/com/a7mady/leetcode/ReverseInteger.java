package com.a7mady.leetcode;

class ReverseInteger {
	public int reverse(int x) {

		int result = 0;
		while (x != 0) {
			int reversed = result * 10 + x % 10;
			if ((reversed - x % 10) / 10 != result)
				return 0;
			x = x / 10;
			result = reversed;
		}
		return result;
	}

	public static void main(String[] args) {

		new ReverseInteger().reverse(-2147483648);

	}
}