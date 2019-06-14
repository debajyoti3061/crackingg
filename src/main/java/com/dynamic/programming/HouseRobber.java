package com.dynamic.programming;

public class HouseRobber {
    public static void main(String[] args){
        int[] money={5,2,3,6,1,1};
        System.out.println(rob(money));
    }

    private static int rob(int[] money) {
        int[] dp=new int[money.length];
        dp[0]=money[0];
        dp[1]=Math.max(money[0],money[1]);
        for(int i=2;i<money.length;i++){
            dp[i]=Math.max(money[i]+dp[i-2],dp[i-1]);
        }

        return dp[money.length-1];
    }
}
