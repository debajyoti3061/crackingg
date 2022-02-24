package com.array;

import java.util.*;

public class
MeetinRoom {

  public static void main(String[] args){
    int[][] input={{0,30},{35,45},{20,40}};
    System.out.println(findsize(input));

  }

  private static int findsize(int[][] input) {
    Arrays.sort(input, Comparator.comparingInt(o -> o[0]));

    /**Arrays.sort(input, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        return Integer.compare(o1[0],o2[0]);
      }
    });*/

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.add(input[0][1]);
    for(int i=1;i<input.length;i++){
      int start = input[i][0];
      if (start>=pq.peek()){
        pq.remove();
      }
      pq.add(input[i][1]);
    }

    return pq.size();
  }
}

