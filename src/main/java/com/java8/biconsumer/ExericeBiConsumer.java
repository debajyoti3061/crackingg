package com.java8.biconsumer;

import java.util.function.BiConsumer;

public class ExericeBiConsumer {
    public static void main(String args[]){
        int[] nums ={2,3,4,6,8};
        int key = 2;
        process(nums, key , (a,b)-> System.out.println(a*b));
        process(nums, key ,(a,b)->System.out.println(a/b));
    }

    public static void process(int[] nums, int key, BiConsumer<Integer,Integer> biConsumer){
        for(int num:nums){
            biConsumer.accept(num,key);
        }

    }
}
