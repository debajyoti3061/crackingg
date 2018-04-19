package com.LinkedList.two.one;

public class ReverseLinkList {

  public static void main(String[] args) {
    LinkedListNode1<Integer> head = new LinkedListNode1<Integer>(1);
    LinkedListNode1<Integer> node1 = new LinkedListNode1<Integer>(2);
    LinkedListNode1<Integer> node2 = new LinkedListNode1<Integer>(2);
    LinkedListNode1<Integer> node3 = new LinkedListNode1<Integer>(3);
    head.next = node1;
    node1.next = node2;
    node2.next = node3;
    LinkedListNode1<Integer> newhead = reverse(head);

    printList(newhead);
  }

  private static LinkedListNode1 reverse(LinkedListNode1<Integer> node) {
    LinkedListNode1 prev = null;
    LinkedListNode1 current = node;
    LinkedListNode1 future = null;
    while (current != null) {
      future = current.next;
      current.next = prev;
      prev = current;
      current = future;
    }
    node = prev;
    return node;

  }

  static void printList(LinkedListNode1 node) {
    while (node != null) {
      System.out.print(node.data + " ");
      node = node.next;
    }
  }

}
