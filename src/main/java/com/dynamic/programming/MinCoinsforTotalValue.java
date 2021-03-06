package com.dynamic.programming;

import java.util.HashMap;
import java.util.Map;

public class MinCoinsforTotalValue {

  /**
   * Bottom up way of solving this problem.
   * Keep input sorted. Otherwise temp[j-arr[i]) + 1 can become Integer.Max_value + 1 which
   * can be very low negative number
   * Returns Integer.MAX_VALUE - 1 if solution is not possible.
   */
  public int minimumCoinBottomUp(int total, int coins[]){
    int T[] = new int[total + 1];
    int R[] = new int[total + 1];
    T[0] = 0;
    for(int i=1; i <= total; i++){
      T[i] = Integer.MAX_VALUE-1;
      R[i] = -1;
    }
    for(int j=0; j < coins.length; j++){
      for(int i=1; i <= total; i++){
        if(i >= coins[j]){
          if (1+T[i - coins[j]]  < T[i]) {
            T[i] = 1 + T[i - coins[j]];
            R[i] = j;
          }
        }
      }
    }
    printCoinCombination(R, coins);
    return T[total];
  }

  private void printCoinCombination(int R[], int coins[]) {
    if (R[R.length - 1] == -1) {
      System.out.print("No solution is possible");
      return;
    }
    int total = R.length - 1;
    System.out.print("Coins used to form total ");
    while ( total != 0 ) {
     // int j =;
      System.out.print(coins[ R[total]] + " ");
      total = total - coins[ R[total]];
    }
    System.out.print("\n");
  }

  public static void main ( String args[] ) {
    int total = 14;
    int coins[] = {10,7, 3, 2, 6};
    MinCoinsforTotalValue cc = new MinCoinsforTotalValue();
    int bottomUpValue = cc.minimumCoinBottomUp(total, coins);

    System.out.print(String.format("Bottom up and top down result %s ", bottomUpValue));

  }
}
