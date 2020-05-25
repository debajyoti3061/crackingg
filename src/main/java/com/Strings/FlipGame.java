package com.Strings;

import java.util.ArrayList;
import java.util.List;

public class FlipGame {

  public static void main(String[] args){
    List<String> output=generatePossibleNextMove("++--+-++-++--+-");
    for(String o:output){
      System.out.println(o);
    }
  }

  private static List<String> generatePossibleNextMove(String s) {
    List<String> possibleStates= new ArrayList<>();
    int i=0;
    while(i<s.length()){
      int nextmove = i==0? s.indexOf("++"): s.indexOf("++",i);
      if(nextmove==-1){
        return possibleStates;
      }
      String nextState= s.substring(0,nextmove)+"--"+s.substring(nextmove+2);
      possibleStates.add(nextState);
      i=nextmove+1;
    }

    return possibleStates;
  }
}
