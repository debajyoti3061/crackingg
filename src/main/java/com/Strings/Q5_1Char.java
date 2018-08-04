package com.Strings;

public class Q5_1Char {

	public static void main(String[] args) {
		System.out.println(oneEditAway("pale","bale"));
	}

	static boolean oneEditAway(String first, String second) {
		if (first.length() == second.length()) {
			return oneEditReplace(first, second);
		} else if (first.length() + 1 == second.length()) {
			return oneEditlnsert(first, second);
		} else if (first.length() - 1 == second.length()) {
			return oneEditlnsert(second, first);
		}
		return false;
	}

	private static boolean oneEditlnsert(String first, String second) {
		// TODO Auto-generated method stub
		return false;
	}

	static boolean oneEditReplace(String s1, String s2) {
		boolean foundDifference = false;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				if (foundDifference) {
					return false;
				}
				foundDifference = true;
			}
		}
		return true;
	}
}
