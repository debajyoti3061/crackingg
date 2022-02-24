package com.Strings;

public class StringCompression {

    public static void main(String args[]){
        String input = "aabbbcdd";
        System.out.println(compress(input));

    }

    private static String compress(String input) {
        StringBuffer sb = new StringBuffer();
        char start = input.charAt(0);
        int count =1;
        for(int i=1; i< input.length();i++){
            if(start == input.charAt(i)){
              count++;
              if(i < input.length()-1) continue;
            }
            sb.append(start);
            sb.append(count);
            start = input.charAt(i);
            count =1;
        }

        return sb.toString();
    }
}
