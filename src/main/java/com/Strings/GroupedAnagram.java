package com.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupedAnagram {
    public static void main(String[] args){
        String input[]={"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> output =groupAnagrams(input);
        output.stream().forEach(o-> System.out.println(o));
    }

    public static List<List<String>> groupAnagrams(String[] input) {
        // if(strs.length() == 0) return res;
        HashMap<String,List> map = new HashMap<>();
        for(String s : input) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if(!map.containsKey(key)) {
                map.put(key,new ArrayList());
            }
            map.get(key).add(s);

        }
        return new ArrayList(map.values());
    }
}

