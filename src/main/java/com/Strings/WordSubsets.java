package com.Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * We are given two arrays A and B of words.  Each word is a string of lowercase letters.
 * <p>
 * Now, say that word b is a subset of word a if every letter in b occurs in a, including multiplicity.  For example, "wrr" is a subset of "warrior", but is not a subset of "world".
 * <p>
 * Now say a word a from A is universal if for every b in B, b is a subset of a.
 * <p>
 * Return a list of all universal words in A.  You can return the words in any order.
 * <p>
 * Input: A = ["amazon","apple","facebook","google","leetcode"], B = ["ec","oc","ceo"]
 * Output: ["facebook","leetcode"]
 */
public class WordSubsets {

    public static void main(String[] args) {
        String A[] = {"amazon", "apple", "facebook", "google", "leetcode"};
        String B[] = {"ec", "oc", "ceo"};
        wordSubsets(A, B).stream().forEach(a -> System.out.println(a));
    }

    public static List<String> wordSubsets(String[] A, String[] B) {
        int[] count = new int[26];
        for (String b : B) {
            int[] bCnt = new int[26];
            for (char c : b.toCharArray()) {
                ++bCnt[c - 'a'];
            } // count b's char.
            for (int i = 0; i < 26; ++i) {
                count[i] = Math.max(count[i], bCnt[i]);
            } // count the max frequency.
        }
        List<String> ans = new ArrayList<>();
        outer:
        for (String a : A) {
            int[] aCnt = new int[26];
            for (char c : a.toCharArray()) {
                ++aCnt[c - 'a'];
            } // count a's char.
            // if the occurrency of char ('a' + i) in B is more frequent than
            // that in a, ignore it.
            for (int i = 0; i < 26; ++i) {
                if (count[i] > aCnt[i]) continue outer;
            }
            ans.add(a);
        }
        return ans;
    }
}
