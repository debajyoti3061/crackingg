package com.array;


public class SearchInsertPosition {
    public static void main(String[] args){
        int[] num ={1,3,5,6};
        int target =5;
        System.out.println(searchInsert(num,target));
    }
    public static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length;

        while(low < high){
            int mid = (low + high)/2;

            if(nums[mid] > target){
                high = mid;
            }else if(nums[mid] == target){
                return mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }



}
