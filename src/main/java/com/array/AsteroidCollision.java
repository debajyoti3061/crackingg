package com.array;

import java.util.Stack;

public class AsteroidCollision {

  public static void main(String[] args){
    int[] ast = {-2, 1, -1, 2};
    int result[] = asteroidCollision(ast);
    for(int i:result){
      System.out.println(i);
    }
  }
  public static int[] asteroidCollision(int[] ast) {
    Stack<Integer> stack = new Stack();
    int i =0;
    while(i<ast.length){
      if(ast[i]>0){
        stack.push(ast[i]);
      }else{
        while(!stack.isEmpty() && stack.peek()>0 && stack.peek()<Math.abs(ast[i])){
          stack.pop();
        }
        if(stack.isEmpty() || stack.peek()<0){
          stack.push(ast[i]);
        }
        if(stack.peek() == Math.abs(ast[i])){
          stack.pop();
        }
      }
      i++;
    }

    int[] result = new int[stack.size()];
    for( i=stack.size()-1;i>=0;i--){
      result[i] = stack.pop();
    }
    return result;
  }
}
