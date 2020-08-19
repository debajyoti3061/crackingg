package com.one;

public class HammingDistance {
  public static  void main(String[] args){
    System.out.println(totalHammingDistance(new int[] {1,2,3}));
  }

  public static int totalHammingDistance(int[] nums) {
    int total = 0, n = nums.length;
    for (int j=0;j<32;j++) {
      int bitCount = 0;
      for (int i=0;i<n;i++)
        bitCount += (nums[i] >> j) & 1;
      int a,b=0;
      total += bitCount*(n - bitCount);
    }
    return total;
  }
}
