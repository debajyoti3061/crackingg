package com.array;
//https://www.youtube.com/watch?v=qBr2hq4daWE&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-&index=31

import java.util.Arrays;

public class ClosestSum {

  public static void main(String[] args){
    int[] nums = {-1, 2, 1, -4};
    int target = 1;
    System.out.println(threeSumClosest(nums,target));
  }
  public static int threeSumClosest(int[] num, int target) {
    int result = num[0] + num[1] + num[num.length - 1];
    Arrays.sort(num);
    for (int i = 0; i < num.length - 2; i++) {
      int start = i + 1, end = num.length - 1;
      while (start < end) {
        int sum = num[i] + num[start] + num[end];
        if (sum > target) {
          end--;
        } else {
          start++;
        }
        if (Math.abs(sum - target) < Math.abs(result - target)) {
          result = sum;
        }
      }
    }
    return result;
  }
}
