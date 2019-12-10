package com.LinkedList;

public class OddEvenList {

    public static void main(String[] args) {
        LinkedListNode1<Integer> head = new LinkedListNode1<Integer>(1);
        LinkedListNode1<Integer> node1 = new LinkedListNode1<Integer>(2);
        LinkedListNode1<Integer> node2 = new LinkedListNode1<Integer>(3);
        LinkedListNode1<Integer> node3 = new LinkedListNode1<Integer>(4);
        head.next = node1;
        node1.next  = node2;
        node2.next = node3;
        node3.next = null;

        head = oddEvenList(head);
        while(head !=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static LinkedListNode1 oddEvenList(LinkedListNode1 head) {
        if (head==null) return null;
        LinkedListNode1 odd = head;
        LinkedListNode1 even= head.next;
        LinkedListNode1 evenHead = even;

        while(even != null && even.next != null ){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next=evenHead;
        return head;
    }
}
