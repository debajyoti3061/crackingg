package com.LinkedList;

public class DeleteNode {

	public static void main(String[] args) {
		LinkedListNode1<Integer> head = new LinkedListNode1<Integer>(1);
	    LinkedListNode1<Integer> node1 = new LinkedListNode1<Integer>(2);
	    LinkedListNode1<Integer> node2 = new LinkedListNode1<Integer>(3);
	    LinkedListNode1<Integer> node3 = new LinkedListNode1<Integer>(4);
	    head.next = node1;
	    node1.next  = node2;
	    node2.next = node3;
	    node3.next = null;
	    
	    deleteNode(head,node2);
	    while(head !=null){
				System.out.println(head.data);
				head = head.next;
			}
	}

	private static void deleteNode(LinkedListNode1<Integer> head,LinkedListNode1<Integer> node) {
		LinkedListNode1 fast = head.next;
		while(fast != node){
			fast = fast.next;
			head = head.next;
		}
		head.next = node.next;
	}

}
