package com.Strings;

import java.util.Arrays;

public class Anagram {
  public static void main(String args[]){
    System.out.println(isAnagram("apple","lepap"));
  }

  private static boolean isAnagram(String s, String t) {
    if(s.length()!=t.length()) return false;
    //System.out.println("hello "+ Arrays.equals(s.toCharArray(),t.toCharArray()));
    int[] count= new int[26];
    for(int i=0;i<s.length();i++){
      count[s.charAt(i)-'a']++;
      count[t.charAt(i)-'a']--;
    }

    for(int i:count){
      if(i !=0) return false;
    }
    return true;
  }
}
