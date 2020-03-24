package com.Interview;

import java.util.*;

/**
 * Declare a list & add elements into it
 * Iterate through each element & print it
 * */
public class Interview1 {

  public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        for(int i =0;i<list.size();i++){
          System.out.println(list.get(i));
        }

}
}
