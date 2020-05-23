package com.Strings;

import java.util.*;

public class MostCommonWord {
  public static void main(String args[]){
    String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
    String[] banned = {"hit"};
    System.out.println(mostCommonWord(paragraph,banned));
  }


  public static String mostCommonWord(String p, String[] banned) {
    Set<String> ban = new HashSet<>(Arrays.asList(banned));
    Map<String, Integer> count = new HashMap<>();
    String[] words = p.replaceAll("\\W+" , " ").toLowerCase().split("\\s+");
    for (String w : words) if (!ban.contains(w)) count.put(w, count.getOrDefault(w, 0) + 1);
    return Collections.max(count.entrySet(), Map.Entry.comparingByValue()).getKey();
  }
}
