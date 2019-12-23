package com.array;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args){
        int digits[]={1,2,3};
        int result[] = plusOne(digits);
        Arrays.stream(result).forEach(x-> System.out.println(x));
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1;i>=0;i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }

        int result[]= new int[n+1];
        result[0]=1;
        return result;
    }
}
