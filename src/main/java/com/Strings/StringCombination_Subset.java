package com.Strings;

import java.util.*;

public class StringCombination_Subset {

  public void combinationEasy(char[] input) {
    List<Character> r = new ArrayList<>();
    Arrays.sort(input);
    combinationEasy(input, 0, r);
  }

  private void combinationEasy(char[] input, int pos, List<Character> r) {

    r.forEach(r1 -> System.out.print(r1 + " "));
    System.out.println();
    for (int i = pos; i < input.length; i++) {
      if (i != pos && input[i] == input[i-1]) {
        continue;
      }
      r.add(input[i]);
      combinationEasy(input, i + 1, r);
      r.remove(r.size() - 1);
    }
  }

  public static void main(String args[]){
    StringCombination_Subset c = new StringCombination_Subset();
    c.combinationEasy("123".toCharArray());

  }
}
