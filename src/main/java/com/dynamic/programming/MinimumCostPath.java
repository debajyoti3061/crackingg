package com.dynamic.programming;

public class MinimumCostPath {
  //chko
    public static void main(String[] args){
        int nums[][]={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(nums));
    }

    public static int minPathSum(int[][] dp) {
        int m = dp.length;// row
        int n = dp[0].length;
        for(int i =0;i<dp.length;i++)
            for(int j =0;j<dp[0].length;j++){
                if(i==0 && j==0)
                    dp[i][j] = dp[i][j];
                else if(i == 0 &&j !=0){
                    dp[i][j]= dp[i][j]+dp[i][j-1];
                }else if(j ==0 && i!=0){
                    dp[i][j] = dp[i][j]+dp[i-1][j];
                }else{
                    dp[i][j] = dp[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
                }
            }

        return dp[m-1][n-1];
    }
}
