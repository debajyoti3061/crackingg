package com.LinkedList;

public class SortList {
    public static void main(String[] args){
        ListNode<Integer> head = new ListNode<Integer>(5);
        ListNode<Integer> node1 = new ListNode<Integer>(-1);
        ListNode<Integer> node2 = new ListNode<Integer>(-3);
        ListNode<Integer> node3 = new ListNode<Integer>(4);
        head.next = node1;
        node1.next  = node2;
        node2.next = node3;
        node3.next = null;
        head =sortList(head);
        while(head !=null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    private static ListNode<Integer> sortList(ListNode<Integer> head) {
        if (head == null || head.next == null)
            return head;

        // step 1. cut the list to two halves
        ListNode prev = null, slow = head, fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        // step 2. sort each half
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        // step 3. merge l1 and l2
        return merge(l1, l2);
    }

    static  ListNode<Integer> merge(ListNode<Integer> l1, ListNode<Integer> l2) {
        ListNode sorted_temp = new ListNode(0), current_node = sorted_temp;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current_node.next = l1;
                l1 = l1.next;
            } else {
                current_node.next = l2;
                l2 = l2.next;
            }
            current_node = current_node.next;
        }

        if (l1 != null)
            current_node.next = l1;

        if (l2 != null)
            current_node.next = l2;

        return sorted_temp.next;
    }
}
