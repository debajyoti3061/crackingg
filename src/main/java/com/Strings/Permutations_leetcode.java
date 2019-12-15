package com.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations_leetcode {
    static List<List<Integer>> listoflist = new ArrayList<>();

    public static void main(String[] args){
        int nums[]={1,2,3};
        listoflist = permute(nums);
        for(List<Integer> innerLs : listoflist) {
            Object[] arr = innerLs.toArray();
            System.out.println(Arrays.deepToString(arr));
        }
    }



    public static List<List<Integer>> permute(int[] nums) {

        permutation(nums,0,nums.length-1);
        return listoflist;
    }

    static void permutation(int nums[],int l,int r){
        if(l==r){
            List<Integer> alist=new ArrayList<>();

            for(int i=0;i<nums.length;i++)
                alist.add(nums[i]);

            listoflist.add(alist);
        }

        for(int i=l;i<=r;i++){
            swap(nums,i,l);
            permutation(nums,l+1,r);
            swap(nums,i,l);
        }
    }

    static int[] swap(int nums[],int i,int j){

        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        return nums;
    }
}
