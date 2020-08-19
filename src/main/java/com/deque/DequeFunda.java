package com.deque;

import java.util.*;

public class DequeFunda {
  public static void main(String[] args){
    Deque dq= new ArrayDeque();
    dq.add(1);
    dq.add(2);
    dq.add(0);

    Iterator i = dq.iterator();
    while(i.hasNext()){
      System.out.println(i.next());
    }

  }
}
