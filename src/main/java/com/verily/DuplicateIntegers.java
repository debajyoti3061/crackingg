package com.verily;

import java.util.*;

public class DuplicateIntegers {
    public static void main(String args[]){
        int[] inputArray = new int[]{1,2,6,2,1,5,2,-1,-3,3,2,5,0};
        //List<Integer> input = Arrays.stream(inputArray).boxed().collect(Collectors.toList());
        List<Integer> input = new ArrayList<>();
        for(int i =0 ; i < inputArray.length; i++){
            if(inputArray[i] < 0 ){
                input.add(0);
            }else {
                input.add(inputArray[i] );
            }
        }
        List<Integer> output = duplicateInteger(input);
        output.forEach(a -> System.out.println(a));
    }

    private static List<Integer> duplicateInteger(List<Integer> input) {
        if(input.size() == 0){
            System.out.println("empty list");
            return null;
        }
        List<Integer> output = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(Integer i : input){
            map.put(i, map.getOrDefault(i,0)+1);
        }


        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            System.out.println(entry.getKey() +":"+ entry.getValue());
            if(entry.getValue() > 1){
                output.add(entry.getKey());
            }
        }
        return output;
    }
}
