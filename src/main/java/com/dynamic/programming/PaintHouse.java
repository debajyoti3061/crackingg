package com.dynamic.programming;

public class PaintHouse {

    public static void main(String[] args){
        int[][] cost={{15,2,6},{8,2,5},{2,4,0}};
        System.out.println(minCost(cost));
    }

    private static int minCost(int[][] cost) {
        for(int i=1;i<cost.length;i++){
          cost[i][0]+=Math.min(cost[i-1][1],cost[i-1][2]);
          cost[i][1]+=Math.min(cost[i-1][2],cost[i-1][0]);
          cost[i][2]+=Math.min(cost[i-1][0],cost[i-1][1]);
        }
        System.out.println(cost[cost.length-1][0]+" "+cost[cost.length-1][1]+" "+cost[cost.length-1][2]);
        return Math.min(Math.min(cost[cost.length-1][0],cost[cost.length-1][1]),cost[cost.length-1][2]);
    }
}
