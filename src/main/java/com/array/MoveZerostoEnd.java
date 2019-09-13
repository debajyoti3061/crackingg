package com.array;

import java.util.Arrays;

public class MoveZerostoEnd {

  public static void main(String args[]){
    int[] arr= {0,2,5,0,6,8,3,0,8};
    moveZeroes(arr);
    System.out.println(Arrays.toString(arr));
  }

  private static void moveZeroes(int[] arr) {
    int index = 0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]!=0){
        arr[index++]=arr[i];
      }
    }
    for(int i=index;i<arr.length;i++){
      arr[i]=0;
    }
  }
}
