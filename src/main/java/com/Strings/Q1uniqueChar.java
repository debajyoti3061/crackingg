package com.Strings;

public class Q1uniqueChar {

  public static void main(String[] args) {
    System.out.println(isUniqueChars("aabcdefe"));

  }

  static boolean isUniqueChars(String str) {
    if (str.length() > 128)
      return false;

    boolean[] char_set = new boolean[128];
    for (int i = 0; i < str.length(); i++) {
      int val = str.charAt(i);
      //System.out.println(val);
      if (char_set[val]) {
        return false;
      }
      char_set[val] = true;
    }
    return true;
  }

}
