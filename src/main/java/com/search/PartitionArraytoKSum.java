package com.search;

import java.util.*;

public class PartitionArraytoKSum {
  public static void main(String[] args) {
    int[] nums = {0,2,4,2,0,4};
    int sum=4;
    Arrays.sort(nums);
    solve(nums, sum).stream().forEach(a-> System.out.println(a));
  }

  private static List<List<Integer>> solve(int[] nums, int sum) {
  List<List<Integer>> answer = new ArrayList<>();
  int pos =0;
  int interimSum= 0;
  while(pos<nums.length){
    List<Integer> temp = new ArrayList<>();
    interimSum = sum;
    for(int i =pos;i<nums.length;i++) {
      if (interimSum - nums[i] > 0) {temp.add(nums[i]);interimSum-=nums[i];}
      else if (interimSum - nums[i] ==0) {temp.add(nums[i]);answer.add(temp);pos=i+1;break;}
      else {pos=i;break;}
    }
  }
  return answer;
  }


}
