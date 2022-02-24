package com.Strings;

import java.util.Arrays;

public class Anagram {
  public static void main(String args[]){
    System.out.println(isAnagram("Apple","lepAp"));
  }

  private static boolean isAnagram(String s, String t) {
    if(s.length()!=t.length()) return false;
    //System.out.println("hello "+ Arrays.equals(Arrays.sort(s.toCharArray()),Arrays.sort(t.toCharArray())));
    int[] count= new int[256];
    for(int i=0;i<s.length();i++){
      count[s.charAt(i)-'A']++;
      count[t.charAt(i)-'A']--;
    }

    for(int i:count){
      if(i !=0) return false;
    }
    return true;
  }
}
