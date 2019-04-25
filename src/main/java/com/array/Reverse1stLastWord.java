package com.array;

public class Reverse1stLastWord {
  //reverse words in a character array
  //'a','b',' ','c',' ','d','e'
  //'d','e',' ','c',' ','a','b'
  //reverse all words & then reverse the string
  
  public static void main(String args[]){
    char[]  input={'a','b',' ','c',' ','e','f'};
    reversewords(input,0,0);
    System.out.println(input);
    reverseString(input,0,input.length-1);
    System.out.println(input);
  }

  private static void reversewords(char[] input,int start, int end) {
    while(start<input.length) {
      end = getEndIndex(input, start);
      reverseString(input,start, end);
      start = end+2;
    }
  }

  private static int getEndIndex(char[] input, int start) {
    int i;
    for( i=1;i<input.length;i++) {
      if (start + i < input.length) {
        if (input[start + i] == ' ')
          return start+i-1;
      } else if ((start + i) == input.length + 1)
        break;
      }
    return start+i-2;
  }

  private static void reverseString(char[] input,int start, int end ) {
    int i = start,j=end;
    while(i<j){
      char temp = input[i];
      input[i]=input[j];
      input[j] = temp;
      i++;
      j--;
    }
  }

}
