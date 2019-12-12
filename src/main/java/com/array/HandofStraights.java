package com.array;

import java.util.TreeMap;

/**
 * Alice has a hand of cards, given as an array of integers.

 Now she wants to rearrange the cards into groups so that each group is size W, and consists of W consecutive cards.

 Return true if and only if she can.



 Example 1:

 Input: hand = [1,2,3,6,2,3,4,7,8], W = 3
 Output: true
 Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8]
 */
public class HandofStraights {
    public static void main(String[] args) {
        int input[]={1,2,3,6,2,3,4,7,8};
        int w=3;
        System.out.println(
                isNStraightHand(input,w)
        );
    }

    public static boolean isNStraightHand(int[] hand, int W) {
        TreeMap<Integer, Integer> count = new TreeMap();
        for (int card : hand) {
            if (!count.containsKey(card))
                count.put(card, 1);
            else
                count.replace(card, count.get(card) + 1);
        }

        while (count.size() > 0) {
            int first = count.firstKey();
            for (int card = first; card < first + W; ++card) {
                if (!count.containsKey(card)) return false;
                int c = count.get(card);
                if (c == 1) count.remove(card);
                else count.replace(card, c - 1);
            }
        }

        return true;
    }
}