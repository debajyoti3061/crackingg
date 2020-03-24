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

    System.out.println("iterative :"+ reverse("java"));
  }

  public static String reverse(String str){
    char[] output=str.toCharArray();
    int j = str.length()-1;
    for(int i=0;i<str.length()/2;i++){
      char temp = output[i];
      output[i]= output[j];
      output[j]= temp;
      j--;
    }
    //System.out.println(output);
    return String.valueOf(output);
  }


}
