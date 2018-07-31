package com.Strings;

public class ReverseString {
  String reverse = "";

  public String reverseString(String str){
  if (str.length() == 1) return str;
  else return reverse+str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1));

  }

  public static void main(String a[]){
    ReverseString srr = new ReverseString();
    System.out.println("Result: "+srr.reverseString("Java2novice"));
  }
}
