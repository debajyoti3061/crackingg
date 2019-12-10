package com.array;

public class StockbuysellOnetxn {
  public static void main(String args[]){
    int arr[]={1,3,8,5,6,2};
    System.out.println(maxProfit(arr));
  }

  private static int maxProfit(int[] arr) {
    int max=0;
    int min = Integer.MAX_VALUE;
      for (int anArr : arr) {
          if (anArr < min) {
              min = anArr;
          } else {
              max = Math.max(max, anArr - min);
          }
      }
    return max;
  }
}
