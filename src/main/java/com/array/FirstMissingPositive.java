package com.array;

public class FirstMissingPositive {
    public static  void main(String[] args){
        int nums[]={3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] A) {
        int i = 0;
        while(i < A.length){
            if(A[i] == i+1 || A[i] <= 0 || A[i] > A.length) i++;
            else if(A[A[i]-1] != A[i]) swap(A, i, A[i]-1);
            else i++;
        }
        i = 0;
        while(i < A.length && A[i] == i+1) i++;
        return i+1;
    }

    private static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public static int firstMissingPositive1(int[] nums) {
        int n = nums.length;

        // 1. mark numbers (num < 0) and (num > n) with a special marker number (n+1)
        // (we can ignore those because if all number are > n then we'll simply return 1)
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = n + 1;
            }
        }
        // note: all number in the array are now positive, and on the range 1..n+1

        // 2. mark each cell appearing in the array, by converting the index for that number to negative
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num > n) {
                continue;
            }
            num--; // -1 for zero index based array (so the number 1 will be at pos 0)
            if (nums[num] > 0) { // prevents double negative operations
                nums[num] = -1 * nums[num];
            }
        }

        // 3. find the first cell which isn't negative (doesn't appear in the array)
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                return i + 1;
            }
        }

        // 4. no positive numbers were found, which means the array contains all numbers 1..n
        return n + 1;
    }
}
