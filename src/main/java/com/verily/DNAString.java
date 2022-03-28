package com.verily;

public class DNAString {
    public static void main(String args[]){
        String output = reverseComplement("GTCA");
        System.out.println(output);
    }

    private static String reverseComplement(String input) {
        StringBuffer sb = new StringBuffer();
        for(int i = input.length()-1 ; i >=0 ; i--){
            if(input.charAt(i) == 'A'){
                sb.append('T');
            }else if(input.charAt(i) == 'T'){
                sb.append('A');
            }else if(input.charAt(i) == 'C'){
                sb.append('G');
            }else if(input.charAt(i) == 'G'){
                sb.append('C');
            }else {
                sb.append(input.charAt(i));
            }
        }
        return sb.toString();
    }
}
