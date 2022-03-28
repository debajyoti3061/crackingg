package com.verily;

public class ThirdNumber {
    public static void main(String args[]){
        printEvery3rdNumber(2,8);
    }

    private static void printEvery3rdNumber(int start, int end) {
        while(start <= end){
            System.out.println(start);
            start += 3;
        }

    }
}
