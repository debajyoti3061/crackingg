package com.search;

import java.util.Arrays;
import java.util.List;

/**
 * Given an array of strings arr. String s is a concatenation of a sub-sequence of arr which have unique characters.
 *
 * Return the maximum possible length of s.
 *
 *
 *
 * Example 1:
 *
 * Input: arr = ["un","iq","ue"]
 * Output: 4
 * Explanation: All possible concatenations are "","un","iq","ue","uniq" and "ique".
 * Maximum length is 4.
 */
public class ConcatenedUniqueString {

  private static int max = 0;

  public static  void main(String[] args){
     String[] a={"un","iq","ue"};
     List<String > arr = Arrays.asList(a);
    System.out.println(maxLength(arr));
  }
  public static int maxLength(List<String> arr) {
    dfs(arr, 0, "");
    return max;
  }

  public static void dfs(List<String> arr, int index, String concatenatStr) {
    if (isUnique(concatenatStr)) max = Math.max(max, concatenatStr.length());
    if (index == arr.size() || !isUnique(concatenatStr))  return;
    for (int i = index; i < arr.size(); i++) {
      dfs(arr, i + 1, concatenatStr + arr.get(i));
    }
  }
  public static boolean isUnique(String s) {
    int[] alpha = new int[26];
    for (int i = 0; i < s.length(); i++) alpha[s.charAt(i) - 'a']++;
    for (int i = 0; i < alpha.length; i++) if (alpha[i] > 1) return false;
    return true;
  }

}
