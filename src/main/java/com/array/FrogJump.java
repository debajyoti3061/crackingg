package com.array;

import java.util.*;

public class FrogJump {
  public static void main(String args[]){
    int stones[]= {0,1,3,5,6,8,12,17};
    System.out.println(canCross(stones));
  }

  private static boolean canCross(int[] stones) {

    Set<Integer> stonePosition= new HashSet<>();
    for(int stone:stones){
      stonePosition.add(stone);
    }
    int lastStone=stones[stones.length-1];
    Stack<Integer> positons= new Stack<>();
    Stack<Integer> jumps= new Stack<>();
    positons.add(0);
    jumps.add(0);
    while(!positons.isEmpty()){
      int position = positons.pop();
      int jumpDistance = jumps.pop();
      for(int i = jumpDistance-1;i<=jumpDistance+1;i++){
        if(i<=0) {continue;}
        int nextPosition = position+i;
        if(lastStone==nextPosition) { return true;}
        else if (stonePosition.contains(nextPosition)){
          positons.add(nextPosition);
          jumps.add(i);
        }
      }
    }

      return false;
  }
}
