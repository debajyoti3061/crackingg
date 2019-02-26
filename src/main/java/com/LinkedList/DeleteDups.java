package com.LinkedList;

import java.util.HashMap;

public class DeleteDups {

  public static void main(String[] args) {
    LinkedListNode1<Integer> head = new LinkedListNode1<Integer>(1);
    LinkedListNode1<Integer> node1 = new LinkedListNode1<Integer>(2);
    LinkedListNode1<Integer> node2 = new LinkedListNode1<Integer>(2);
    LinkedListNode1<Integer> node3 = new LinkedListNode1<Integer>(3);
    head.next = node1;
    node1.next = node2;
    node2.next = node3;
    //1->2-3
    deleteDups(head);
   while(head != null){
     System.out.println(head.data);
     head = head.next;
   }
  }


  public static void deleteDups(LinkedListNode1 n) {
    HashMap table = new HashMap();
    LinkedListNode1 previous = null;
    while (n != null) {
      if (table.containsKey(n.data)) {
        previous.next = n.next;
      } else {
        table.put(n.data, true);
        previous = n;
      }
      n = n.next;
    }

  }

}
