package com.array;

import java.util.Random;

public class SuffleArray {
    private int[] nums;
    private Random random;

    public SuffleArray(int[] nums) {
        this.nums = nums;
        random = new Random();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if(nums == null) return null;
        int[] a = nums.clone();
        for(int j = 1; j < a.length; j++) {
            int i = random.nextInt(j + 1);
            swap(a, i, j);
        }
        return a;
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args)
    {
        int a[] = {4,8,2};
        SuffleArray s = new SuffleArray(a);
        // Array from 0 to 51


        a=s.shuffle();

        // Printing all shuffled elements of cards
        for (int i = 0; i < 3; i ++)
            System.out.print(a[i]+" ");

    }

}
