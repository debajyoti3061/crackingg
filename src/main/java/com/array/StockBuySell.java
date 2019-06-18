package com.array;

public class StockBuySell {
  public static void main(String args[]){
    int arr[]={1,3,8,5,6,2};
    System.out.println(maxProfit(arr));
  }

  private static int maxProfit(int[] arr) {
    if(arr==null ||arr.length==0) return 0;
    int profit=0;
    for(int i=0;i<arr.length-1;i++){
      if(arr[i+1]>arr[i]){
        profit+=arr[i+1]-arr[i];
      }
    }

    return profit;
  }
}
