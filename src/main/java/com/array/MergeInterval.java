package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {12, 15}};
        int output[][] = merge(intervals);
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j]+",");
            }
            System.out.println();
        }
    }
    public static int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length <= 1) return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];

        List<int[]> result = new ArrayList<>();

        for(int[] interval : intervals){
            if(interval[0] <= end){
                end = Math.max(end, interval[1]);
            }
            else{
                result.add(new int[]{start, end});
                start = interval[0];
                end = interval[1];
            }
        }
        result.add(new int[]{start, end});

        return result.toArray(new int[result.size()][2]);
    }
}
