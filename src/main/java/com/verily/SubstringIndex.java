package com.verily;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

public class SubstringIndex {
    public static void main(String args[]){
        List<Integer> output = substringIndex("GCTCTCTGCCTCTACTTA", "CTCT");
        output.forEach(a -> System.out.println(a));
    }

    private static List<Integer> substringIndex(String s1 ,String s2) {
        List<Integer> output = new ArrayList<>();
        int i = s1.indexOf(s2);
        while(i >= 0){
            output.add(i);
            i = s1.indexOf(s2, i+1);
        }
        return output;
    }
}
