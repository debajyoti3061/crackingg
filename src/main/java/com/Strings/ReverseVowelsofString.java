package com.Strings;

import java.util.*;

public class ReverseVowelsofString {
  public static void main(String args[]){
    System.out.println(reverseVowels("leetcode"));
  }


  public static String reverseVowels(String s) {
    Set<Character> vowels = new HashSet<>();
    vowels.addAll(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
    char[] arr = s.toCharArray();
    int i =0;
    int j = s.length()-1;
    while(i<j){
      while(i<j && !vowels.contains(arr[i])){
        i++;
      }
      while(i<j && !vowels.contains(arr[j])){
        j--;
      }
      char temp = arr[i];
      arr[i++]= arr[j];
      arr[j--] = temp;
    }
    return new String(arr);
  }
}
