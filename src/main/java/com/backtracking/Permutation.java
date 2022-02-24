package com.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    static List<List<Integer>> list = new ArrayList<>();
    public static void main(String[] args){
        int nums[]={1,2,0,1};
        permuteUnique(nums).stream().forEach(System.out::println);
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        backtrack(  nums, new boolean[nums.length],new ArrayList<>());
        return list;
    }

    private static void  backtrack(  int [] nums, boolean [] used,List<Integer> tempList){
        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
        } else{
            for(int i = 0; i < nums.length; i++){
                if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]) continue;
                used[i] = true;
                tempList.add(nums[i]);
                backtrack( nums, used,tempList);
                used[i] = false;
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
