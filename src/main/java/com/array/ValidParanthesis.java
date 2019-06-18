package com.array;

import java.util.Stack;

public class ValidParanthesis {
  
  public static void main(String args[]){
    System.out.println( isValid("{[]}"));
  }

  private static boolean isValid(String s) {
    Stack<Character> stack = new Stack<> ();
    if (s.length()==0)return true;
    if(!(s.charAt(0)=='(') && !(s.charAt(0)=='{') && !(s.charAt(0)=='[')) return false;
    for(int i=0;i<s.length();i++){

      if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
        stack.push(s.charAt(i));
      else if(s.charAt(i)==')'){
        if(stack.size()!=0 && stack.peek()=='(')
          stack.pop();
        else return false;
      }else if(s.charAt(i)=='}'){
        if(stack.size()!=0 && stack.peek()=='{')
          stack.pop();
        else return false;
      }else if(stack.size()!=0 && s.charAt(i)==']'){
        if(stack.peek()=='[')
          stack.pop();
        else return false;
      }
    }
    if(stack.size() ==0) return true;
    return false;
  }
}
