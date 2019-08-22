package com.array;

import java.util.HashMap;

public class TwoSum {

  public static void main(String args[]){
    int[] nums={1,4,7,89,2,6};
    int target =3;
    int[] result=twoSum(nums,target);
    System.out.println(result[0]+" "+result[1]);

  }

  private static int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<nums.length;i++){
      if(map.containsKey(target-nums[i])){
        result[0]=i;
        result[1]=map.get(target-nums[i]);
        return result;
      }
      map.put(nums[i],i);
    }
    return result;
  }
}
