package com.Strings;

public class LongestStringwithKDistinct {

    /**
     * Longest Substring - at most K distinct characters
     */
    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] map = new int[256];
        int start = 0, end = 0, maxLen = Integer.MIN_VALUE, counter = 0;

        while (end < s.length()) {
            final char c1 = s.charAt(end);
            if (map[c1] == 0) counter++;
            map[c1]++;
            end++;

            while (counter > k) {
                final char c2 = s.charAt(start);
                if (map[c2] == 1) counter--;
                map[c2]--;
                start++;
            }

            maxLen = Math.max(maxLen, end - start);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstringKDistinct("AADDAABEECODEBANC", 4));
    }
    /** Longest Substring - at most 2 distinct characters

     public int lengthOfLongestSubstringTwoDistinct(String s) {
     int[] map = new int[128];
     int start = 0, end = 0, maxLen = 0, counter = 0;

     while (end < s.length()) {
     final char c1 = s.charAt(end);
     if (map[c1] == 0) counter++;
     map[c1]++;
     end++;

     while (counter > 2) {
     final char c2 = s.charAt(start);
     if (map[c2] == 1) counter--;
     map[c2]--;
     start++;
     }

     maxLen = Math.max(maxLen, end - start);
     }

     return maxLen;
     }
     */
    /** LongestSubstring - without repeating characters

     public int lengthOfLongestSubstring2(String s) {
     int[] map = new int[128];
     int start = 0, end = 0, maxLen = 0, counter = 0;

     while (end < s.length()) {
     final char c1 = s.charAt(end);
     if (map[c1] > 0) counter++;
     map[c1]++;
     end++;

     while (counter > 0) {
     final char c2 = s.charAt(start);
     if (map[c2] > 1) counter--;
     map[c2]--;
     start++;
     }

     maxLen = Math.max(maxLen, end - start);
     }

     return maxLen;
     }
     */

}
