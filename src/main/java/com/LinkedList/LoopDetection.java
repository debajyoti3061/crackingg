package com.LinkedList;

public class LoopDetection {

  public static void main(String[] args) {
    LinkedListNode1<Integer> head = new LinkedListNode1<Integer>(1);
    LinkedListNode1<Integer> node1 = new LinkedListNode1<Integer>(2);
    LinkedListNode1<Integer> node2 = new LinkedListNode1<Integer>(3);
    LinkedListNode1<Integer> node3 = new LinkedListNode1<Integer>(4);
    LinkedListNode1<Integer> node4 = new LinkedListNode1<Integer>(5);
    LinkedListNode1<Integer> node5 = new LinkedListNode1<Integer>(6);
    head.next = node1;
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;
    node5.next = node3;
    LinkedListNode1 loopstart = detectLoop(head);

    System.out.println(loopstart.data);
  }

  private static LinkedListNode1 detectLoop(
      LinkedListNode1<java.lang.Integer> head) {
    LinkedListNode1 slow = head;
    LinkedListNode1 fast = head;
    while (fast.next != null && fast.next.next!= null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        break;
      }
    }
    slow = head;
    while (slow != fast) {
      slow = slow.next;
      fast = fast.next;
    }
    return slow;
  }


}
