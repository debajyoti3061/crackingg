package com.LinkedList;

public class SwapNodesinPair {
    public static void main(String[] args){
        ListNode<Integer> head = new ListNode<Integer>(1);
        ListNode<Integer> node1 = new ListNode<Integer>(2);
        ListNode<Integer> node2 = new ListNode<Integer>(3);
        ListNode<Integer> node3 = new ListNode<Integer>(4);
        head.next = node1;
        node1.next  = node2;
        node2.next = node3;
        node3.next = null;
        head =swapPairs(head);
        while(head !=null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode temp = new ListNode(0);
        temp.next=head;
        ListNode current = temp;

        if(head == null) return null;
        if(head.next == null) return head;

        while(current.next != null && current.next.next!=null){
            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next=second.next;
            current.next = second;
            current.next.next=first;
            current= current.next.next;
        }
        return temp.next;
    }
}
