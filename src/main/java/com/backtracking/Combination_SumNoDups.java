package com.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Combination_SumNoDups {
    //back trac
    public static void main(String[] args){
        int[] nums={1,0,1,2,1,4};

        List<List<Integer>> output = combinationSum2(nums,6);
        output.stream().forEach(x-> System.out.println(x));
    }

    public static List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, target, 0);

        return list;

    }


    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int pos){
        if(remain < 0) return;
        else if(remain == 0) list.add(new ArrayList<>(tempList));
        else{
            for(int i = pos; i < nums.length; i++){
                if(i != pos && nums[i] == nums[i-1]) continue; // skip duplicates
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, remain - nums[i], i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
