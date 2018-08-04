package com.Strings;

import java.util.HashMap;

public class Q1 {

  public static void main(String[] args) {
    HashMap<Character, Integer> map = new HashMap<>();
    HashMap<Character, Integer> ansmap = verifystring("sdhhdsfkjs", map);
    System.out.println(ansmap);
    //answer=verifystring("abcdef",map);
  }

  private static HashMap<Character, Integer> verifystring(String input,
                                                          HashMap<Character, Integer> map) {
    for (int i = 0; i < input.length(); i++) {
      if (map.get(input.charAt(i)) == null) {
        map.put(input.charAt(i), 1);
      } else map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
    }
    return map;
  }


}
