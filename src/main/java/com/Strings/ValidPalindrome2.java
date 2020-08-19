package com.Strings;

public class ValidPalindrome2 {

  public static void main(String args[]){
    System.out.println(isvalidPalindrome("abab"));
  }

  private static boolean isvalidPalindrome(String input) {
      int start = 0;
      int end = input.length()-1;
      while(start<end){
        if(input.charAt(start)!=input.charAt(end)){
          return (isvalidPalindromeSubstring(input,start+1,end) || isvalidPalindromeSubstring(input,start,end-1));
        }
        start++;
        end--;
      }
    return true;
  }

  private static boolean isvalidPalindromeSubstring(String input, int start, int end) {
    while(start<end){
      if(input.charAt(start)!=input.charAt(end)){
        return false;
      }
      start++;
      end--;
    }
    return true;
  }
}
