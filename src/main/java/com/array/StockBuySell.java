package com.array;

public class StockBuySell {
  public static void main(String args[]){
    int arr[]={1,3,3,5,6,2};
    System.out.println(maxProfit(arr));
  }

  private static int maxProfit(int[] arr) {
    int max= 0;
    int min = Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
      if(arr[i]<min) min=arr[i];
      else max= Integer.max(max,arr[i]-min);
    }
    return max;
  }
}