package com.one;

import java.util.Collections;

public class Q2StringPermutation {

	public static void main(String[] args) {
		boolean answer=permutation("fsade","fedas");
		System.out.println(answer);
	}

	private static boolean permutation(String string1, String string2) {
		if(string1.length()!=string2.length())
		return false;
		if(sorting(string1).equals(sorting(string2)))
			return true;
		else return false;
	}

	private static String sorting(String s) {
		char[] content = s.toCharArray();
		 java.util.Arrays.sort(content);
		 return new String(content);
		
	}

}
