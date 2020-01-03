package com.one;

import java.util.Arrays;

/**
 * Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.

 Example 1:

 Input: 2
 Output: [0,1,1]
 Example 2:

 Input: 5
 Output: [0,1,1,2,1,2]
 */
public class CountNumberof1s {

    public static void main(String[] args){
        Arrays.stream(countBits(5)).forEach(x-> System.out.println(x));
    }

    public static int[] countBits(int num) {
        int a[] = new int[num+1];

        for(int i =1;i<=num;i++){
            a[i] = a[i>>1] + (i&1);
        }

        return a;

    }
}
