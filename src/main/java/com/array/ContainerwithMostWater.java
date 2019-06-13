package com.array;

import static java.lang.Math.min;

public class ContainerwithMostWater {
    public static void main(String[] args)
    {
        int arr[] = {0, 1, 0, 2, 1, 0, 1,
                3, 2, 1, 2, 1};
        int n = arr.length;

        System.out.println("Maximum water that "
                + "can be accumulated is "
                + maxWater(arr));

    }

    private static int maxWater(int[] arr) {
        int max= Integer.MIN_VALUE;
        int i=0;int j = arr.length-1;
        while(i<j){
            int min = min(arr[i],arr[j]);
            max= Math.max(max,min*(j-i));
            if(arr[i]<arr[j]) i++;
            else j--;
        }
        return max;
    }
}
